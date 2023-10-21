package game.java.chap04;

public class RelationTest {
	public static void main(String[] args) {
		int x, y, z;
		boolean b;
		
		x = y = z = 1;
		b = ((x-- > 0) || ( ++y != 0) && ( --z == 0));
		System.out.println("x = " + x + ", y = " + ", z = " + z + ", b = " + b);
	}
}
