package java200.java_3;

import java.util.Scanner;

public class java3_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 a:"); int a = scanner.nextInt();
		System.out.print("정수 b:"); int b = scanner.nextInt();
		
		int diff = a >= b ? a - b : b - a;
		
		if (diff <= 10) {
			System.out.println("두 값의 차는 10 이하입니다.");
		}
		else {
			System.out.println("두 값의 차는 11 이상입니다.");
		}
	}
}
