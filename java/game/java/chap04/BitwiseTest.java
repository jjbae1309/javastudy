package game.java.chap04;

public class BitwiseTest {
	public static void main(String[] args) {
		int x, y;
		
		x = 8;
		y = ~x;
		System.out.println(x + y);
		
		System.out.println(x + y);
		System.out.println(x + y);
		System.out.println(x + y);
		
		x = x << 2;
		y = y << 2;
		System.out.println("x = " + x + " (x << 2),  y = " + y +" (y << 2) ");
		
		x = x >> 2;
		y = y >> 2;
		System.out.println("x = " + x + " (y >> 2), y = " + y + "  (y >>> 2)");
	}
}
