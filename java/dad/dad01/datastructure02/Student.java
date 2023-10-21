package dad01.datastructure02;

public class Student {
	private String id;
	private String name;	
	private int kor;
	private int math;
	private int eng;
	private int sci;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	@Override
	public String toString() {
		return "ID=" + id + ", 이름=" + name + ", 국어=" + kor + ", 영어=" + eng + ", 수학=" + math + ", 과학=" + sci;
	}
}
