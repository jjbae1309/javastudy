package dad01.datastructure03;

public class Land implements Comparable<Land> {
	// �ʵ�
	private String owner;
	private int width;
	private int height;
	
	// ������
	public Land(String owner, int width, int height) {
		this.owner = owner;
		this.width = width;
		this.height = height;
	}

	// �޼ҵ�
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "������=" + owner + ", ��=" + width + ", ����=" + height + ", ����=" + (width * height);
	}

	@Override
	public int compareTo(Land o) {
		int area = width * height;
		int anotherArea = o.getWidth() * o.getHeight();
		
		if (area < anotherArea) {
			return -1;
		}
		else if (area > anotherArea) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
