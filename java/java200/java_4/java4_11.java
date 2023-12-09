package java200.java_4;

import java.util.Scanner;

public class java4_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?:");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print('*');
			System.out.println();
		}
	}
}
