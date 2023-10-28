package java200.java_4;

import java.util.Scanner;

public class java4_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x;
		do {
			System.out.print("양의 정숫값:");
			x = scanner.nextInt();
		}
		while (x <= 0);
		while (x >= 0);
		System.out.println(x--);
		System.out.println("x의 값이 " + x + "이 됬습니다.");
	}
}
