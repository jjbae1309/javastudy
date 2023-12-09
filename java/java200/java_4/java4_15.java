package java200.java_4;

import java.util.Scanner;

public class java4_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("n의 값:");
		int n;
		do {
			System.out.print("n의 값:");
			n = scanner.nextInt();
		}
		while (n <= 0);
		int sum = 0;
		for (int i = 1; i < n; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.print(n + " = ");
		sum += n;
		System.out.println(sum);
	}
}
