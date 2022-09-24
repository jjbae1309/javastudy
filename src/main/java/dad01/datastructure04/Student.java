package dad01.datastructure04;

public class Student implements Comparable<Student> {
	private String id;
	private String name;	
	private int kor;
	private int math;
	private int eng;
	private int sci;
	
	public Student(String id, String name, int kor, int math, int eng, int sci) {
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.sci = sci;
	}
	
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
	
	public int getTotal() {
		return kor + math + eng + sci;
	}

	@Override
	public String toString() {
		return "ID=" + id + ", 이름=" + name + ", 국어=" + kor + ", 영어=" + eng + ", 수학=" + math + ", 과학=" + sci +
				", 총점=" + (kor + eng + math + sci);
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int thisTotal = this.kor + this.eng + this.math + this.sci;
		int anotherTotal = o.getKor() + o.getEng() + o.getMath() + o.getSci();
		
		if (thisTotal < anotherTotal) {
			return -1;
		}
		else if (thisTotal > anotherTotal) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
