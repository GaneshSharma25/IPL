package pojos;

public class Team {
	
	//#teams : id , name, abbrevation,owner,max_age,batting_avg,wickets_taken
	
	private int teamId;
	private String name;
	private String abbrevation;
	private String owner;
	private int maxAge;
	private double minBattingAvg;
	private int minWicketsTaken;
	
	public Team(int id, String name, String abbrevation, String owner, int maxAge, double battingAvg,
			int wicketsTaken) {
		super();
		this.teamId = id;
		this.name = name;
		this.abbrevation = abbrevation;
		this.owner = owner;
		this.maxAge = maxAge;
		this.minBattingAvg = battingAvg;
		this.minWicketsTaken = wicketsTaken;
	}

	@Override
	public String toString() {
		return "Team [id=" + teamId + ", name=" + name + ", abbrevation=" + abbrevation + ", owner=" + owner + ", maxAge="
				+ maxAge + ", battingAvg=" + minBattingAvg + ", wicketsTaken=" + minWicketsTaken + "]";
	}

	public int getId() {
		return teamId;
	}

	public void setId(int id) {
		this.teamId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbrevation() {
		return abbrevation;
	}

	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public double getBattingAvg() {
		return minBattingAvg;
	}

	public void setBattingAvg(double battingAvg) {
		this.minBattingAvg = battingAvg;
	}

	public double getWicketsTaken() {
		return minWicketsTaken;
	}

	public void setWicketsTaken(int wicketsTaken) {
		this.minWicketsTaken = wicketsTaken;
	}
	
	
	
	
}
