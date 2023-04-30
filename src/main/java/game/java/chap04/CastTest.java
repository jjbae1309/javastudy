package game.java.chap04;

public class CastTest {
	public static void main(String[] args) {
		
		int myInt;
		float myFloat = (float) 3.0;
		double myDouble;
		myInt = (int) myFloat;
		myDouble = myInt;
		System.out.println("myInt = "+ myInt + ", myFloat = " + myFloat + ", myDouble = " + myDouble);
	}
}
