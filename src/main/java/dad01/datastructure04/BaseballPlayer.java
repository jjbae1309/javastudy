package dad01.datastructure04;

public class BaseballPlayer implements Comparable <BaseballPlayer> {
	private int id;
	private String name;
	private int backNum;
	private String team;
	private int atBat;
	private int hits;

	public BaseballPlayer(int id, String name, int backNum, String team, int atBat, int hits) {
		this.id = id;
		this.name = name;
		this.backNum = backNum;
		this.team = team;
		this.atBat = atBat;
		this.hits = hits;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBackNum() {
		return backNum;
	}

	public void setBackNum(int backNum) {
		this.backNum = backNum;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAtBat() {
		return atBat;
	}

	public void setAtBat(int atBat) {
		this.atBat = atBat;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}
	
	public float getBatAvg() {
//		float batAvg = hits / atBat;
//		return batAvg;
		return (float)hits / atBat;
	}
	
	@Override
	public String toString() {
		return "아이디=" + id + ", 이름=" + name + ", 등번호=" + backNum + ", 소속팀=" + team + ", 타수=" + atBat + ", 안타수=" + hits + ", 타율=" + this.getBatAvg();  
	}
	
	@Override
	public int compareTo(BaseballPlayer o) {
		float thisBatAvg = this.getBatAvg();
		float anotherBatAvg = o.getBatAvg();
		
		if (thisBatAvg < anotherBatAvg) {
			return -1;
		}
		else if (thisBatAvg > anotherBatAvg) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
