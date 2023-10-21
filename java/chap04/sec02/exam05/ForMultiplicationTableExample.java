package chap04.sec02.exam05;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m = 2; m <= 100; m++) {
			System.out.println("*** " + m + "´Ü ***");
			
			for (int n = 1; n <= 100; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));
			}
		}
	}
}
