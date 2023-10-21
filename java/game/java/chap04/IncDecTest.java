package game.java.chap04;

public class IncDecTest {
	public static void main(String[] args) {
		int x, y, z;
		
		x = 10; y = 5; z = 0;
		z = x++ -  y + 1;
		System.out.println(x + y + z);
		
		x = 10; y = 5; z = 0;
		z = ++x - --y + 1;
		System.out.println(x + y + z);
	}
}
