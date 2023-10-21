package chap04.sec01.exam04;

import java.util.Scanner;

public class IfDiceExample {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			if ("q".equals(inputData))
				break;
				
			// 1 ~ 6 사이의 정수 발생. 주사위
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
		}
	}
}
