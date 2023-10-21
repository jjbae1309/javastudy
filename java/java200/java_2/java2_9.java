package java200.java_2;

import java.util.Scanner;

public class java2_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("삼각형의 넓이를 구합니다.");
		
		System.out.print("밑변:");
		double width = scanner.nextDouble();
		
		System.out.print("높이:");
		double height = scanner.nextDouble();
		
		System.out.println("넓이는 :" + (width + height / 2) + "입니다.");
	}
}
