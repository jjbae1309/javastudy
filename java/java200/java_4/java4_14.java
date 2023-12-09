package java200.java_4;

import java.util.Scanner;

public class java4_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.print("n의 값:");
			n = scanner.nextInt();
		}
		while (n <= 0);
		int sum = 0;
		for (int i = 0; i <= n; i++)
			sum += i;
		System.out.print("1부터 " + n + "까지의 합은" + sum + "입니다.");
	}
}
