package java200.java_2;

import java.util.Scanner;

public class java2_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값:");
		double x = scanner.nextDouble();
		
		System.out.print("y값:");
		double y = scanner.nextDouble();
		
		System.out.println("합계는 " + (x + y) + "입니다.");
		System.out.println("평균은 " + (x + y) / 2 + "입니다.");
		
	}
}
