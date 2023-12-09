package java200.java_4;

import java.util.Scanner;

public class java4_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		int x;
		do {
			System.out.print("양의 정숫값:");
			x = scanner.nextInt();
		}
		while (x <= 0);
		
		for (; x >= 0; x--)
			System.out.println(x);
	}
}
