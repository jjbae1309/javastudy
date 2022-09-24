package game.java.no4;

public class Callbyvalue {
	public static void swap(int x, int y) {
		int temp = x; //x값을 temp안에 보관
		x = y;
		y = temp;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("swap() 메서드 호출 전: " + a + ", " + b);
		swap(a, b); //x에는 a y에는 b
		System.out.println("swap() 메서드 호출 후 : " + a + ", " + b);
	}		
}