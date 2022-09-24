package game.java.no4;

public class CallByValueTest2 {
	
	static int a;
	static int b;
	
	public static void swap() {
		int temp = a;
		a = b;
		b = temp;
		
	}
	
	public static void main(String[] args) {
		a = 10;
		b = 20;
		
		System.out.println("swap() 메서드 호출 전: " + a + ", " + b);
		swap(); //x에는 a y에는 b
		System.out.println("swap() 메서드 호출 후 : " + a + ", " + b);
	}
}
