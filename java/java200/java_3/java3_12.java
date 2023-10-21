package java200.java_3;

import java.util.Scanner;

public class java3_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("실수 a:"); double a = scanner.nextDouble();
		System.out.print("실수 b:"); double b = scanner.nextDouble();
		
		double max;
		if (a > b) {
			max = a;
		}
		else {
			max = b;
		}
		
		System.out.println("큰 쪽의 값은 " + max + "입니다.");
	}
}
