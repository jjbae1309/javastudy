package dad01.datastructure03;

public class Board implements Comparable<Board> {
	private String writer;
	private String title;
	private String contents;
	int readNum;
	
	public Board(String writer, String title, String contents, int readNum) {
		this.writer = writer;
		this.title = title;
		this.contents = contents;
		this.readNum = readNum;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public int getReadNum() {
		return readNum;
	}

	public void setReadNum(int readNum) {
		this.readNum = readNum;
	}
	
	@Override
	public String toString() {
		return "작성자=" + writer + ", 제목=" + title + ", 내용=" + contents + ", readNum=" + readNum;
	}
	
	@Override
	public int compareTo(Board o) {
		int myReadNum = this.readNum;
		int anotherReadNum = o.getReadNum();
	
		if (myReadNum < anotherReadNum) {
			return -1;	
		}
		else if (myReadNum > anotherReadNum) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
