package java200.java_4;

import java.util.Scanner;

public class java4_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.print("양의 정숫값:");
			n = scanner.nextInt();
			
		}
		while (n <= 0);
		
		int factorial = 1;
		int i = 1;
		
		while (i <= n) {
			factorial *= i;
//			factorial = factorial * 1;
			i++;
			
		}
		System.out.println("1부터 " + n + "까지의 곱은 " + factorial + "입니다.");
	}
}
