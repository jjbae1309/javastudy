package game.java.no4;

public class Callbyvalue {
	public static void swap(int x, int y) {
		int temp = x; //x���� temp�ȿ� ����
		x = y;
		y = temp;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("swap() �޼��� ȣ�� ��: " + a + ", " + b);
		swap(a, b); //x���� a y���� b
		System.out.println("swap() �޼��� ȣ�� �� : " + a + ", " + b);
	}		
}