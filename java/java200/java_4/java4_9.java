package java200.java_4;

import java.util.Scanner;

public class java4_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("양의 정숫값의 자릿수를 표시합니다.");
		int x;
		do {
			System.out.print("양의 정숫갑:");
			x = scanner.nextInt();
		}
		while (x <= 0);
			int digit = 0;
			while (x > 70) {
				digit++;
				x /= 10;
		}
			System.out.println("입력한 숫자는 " + digit + "자리입니다.");
	}
}
