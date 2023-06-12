package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TeamDaoImpl;
import pojos.Team;

/**
 * Servlet implementation class TeamServlet
 */
@WebServlet("/team")
public class TeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TeamDaoImpl teamDao = null;
	public void init(ServletConfig config) throws ServletException {
		try {
			teamDao = new TeamDaoImpl();
		} catch (Exception e) {
			throw new ServletException("Err in init ..",e);
		}
	}


	public void destroy() {
	    try {
			teamDao.cleanDao();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try(PrintWriter pw = response.getWriter()){
			List<Team> teams = teamDao.getAllTeam();
			if(teamDao != null) {
				pw.print("<h1>Add Player to IPL Team</h1>");
				pw.print("<form>");
				pw.print("<table> <tr> <td>");
				pw.print("<label for='teams'>Choose a Team:</label></td>");
				pw.print("<td><select name='teams' id='teams'>");	
				teams.forEach(p -> pw.print("<option value="+p.getId() +">"+p.getAbbrevation()+"</option>"));
				pw.print("</select> </td></tr>");
				pw.print("<tr> <td><label for='name'>Name:</label></td>");
				pw.print("<td><input type='text' id='name' name='name'> </td> </tr>");
				pw.print("<tr> <td><label for='dob'>DOB:</label></td>");
				pw.print("<td><input type='date' id='dob' name='dob'></td> </tr>");
				pw.print("<tr> <td><label for='btavg'>Batting Avg:</label></td>");
				pw.print("<td><input type='text' id='btavg' name='btavg'> </td> </tr>");
				pw.print("<tr> <td><label for='wktkn'>Wicket Taken:</label></td>");
				pw.print("<td><input type='text' id='wktkn' name='wktkn'></td> </tr>");
				pw.print("<tr> <td><button type='submit' name='btn'>Add Player</button></td>");
				pw.print("</table>");
				pw.print("</form>");
				
			}
		}catch(Exception e) {
			
		}
		
	}


}






















