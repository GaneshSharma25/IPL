package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojos.Team;
import utils.DbUtils;

public class TeamDaoImpl implements TeamDao {

	private Connection cn;
	private PreparedStatement pst1;

	public TeamDaoImpl() throws SQLException {
		cn = DbUtils.openConnection();
		pst1 = cn.prepareStatement("select * from teams");
		//update it to just id and abbrev..
		System.out.println("Team Dao Created..");
	}

	@Override
	public List<Team> getAllTeam() throws SQLException {
		// id , name, abbrevation,owner,max_age,batting_avg,wickets_taken
		try (ResultSet rst = pst1.executeQuery()) {
			List<Team> teams = new ArrayList<Team>();
			while (rst.next()) {
				teams.add(new Team(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5),
						rst.getInt(6), rst.getInt(7)));
			}
			return teams;
		}
	}
	
	public void cleanDao() throws SQLException {
		if (pst1 != null) {
			pst1.close();
		}
		DbUtils.closeConnection();
		System.out.println("Teams Dao Closed...");
	}

}
