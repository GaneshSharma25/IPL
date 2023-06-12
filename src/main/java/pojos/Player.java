package pojos;

import java.sql.Date;

public class Player {
	
	//#players : id , first_name,last_name, dob,batting_avg,wickets_taken....
	//#+team_id 
	private int playerId;
	private String firstName;
	private String lastName;
	private Date dob;
	private double battingAvg;
	private int wicketsTaken;
	private int teamId;
	
	public Player() {
		
	}
	
	public Player(int id, String firstName, String lastName, Date dob, double battingAvg, int wicketsTaken,
			int teamId) {
		super();
		this.playerId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.battingAvg = battingAvg;
		this.wicketsTaken = wicketsTaken;
		this.teamId = teamId;
	}

	@Override
	public String toString() {
		return "Player [id=" + playerId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", battingAvg=" + battingAvg + ", wicketsTaken=" + wicketsTaken + ", teamId=" + teamId + "]";
	}

	public int getId() {
		return playerId;
	}

	public void setId(int id) {
		this.playerId = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getBattingAvg() {
		return battingAvg;
	}

	public void setBattingAvg(double battingAvg) {
		this.battingAvg = battingAvg;
	}

	public double getWicketsTaken() {
		return wicketsTaken;
	}

	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	
	
}
