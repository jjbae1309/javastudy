package game.java.no4;

public class CallByReferenceTest {
	public static void swap(Number z) {
		int temp = z.x;
		z.x = z.y;
		z.y = temp;
	}
	public static void main(String[] args) {
		Number n = new Number();
		n.x = 10;
		n.y = 20;
		
		System.out.println("swap() 메서드 호출 전: " + n.x + ", " + n.y);
		swap(n);
		System.out.println("swap() 메서드 호출 후: " + n.x + ", " + n.y);
	}
}

class Number {
	public int x;
	public int y;
}