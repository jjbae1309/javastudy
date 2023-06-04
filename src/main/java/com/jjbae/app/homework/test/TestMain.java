package com.jjbae.app.homework.test;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMain {
	private static Logger LOGGER = LoggerFactory.getLogger(TestMain.class);
	
	public static void main(String[] args) {
		// 1단계. 
		// 1) 정수형 변수 a에 10을 담는다
		// 2) 정수형 변수 b에 20을 담는다.
		// 3) 둘을 곱한 값을 정수형 변수 total에 담는다.
		// 4) LOGGER를 이용해 결과를 출력한다.
		/*
		int a = 10;
		int b = 20;
		int total = a * b;
		
		LOGGER.debug("a * b = " + total);
*/
		
		// 2단계. 1부터 100까지 더한 값을 sum에 넣고 sum을 출력하세요.
/*
		int sum = 0;
		for (int o = 1; o <= 100; o++) {
			sum = sum + o;		
		}
		
		LOGGER.debug("sum = " + sum);
*/		
		// 3단계. 구구단
		// 2 ~ 9단 까지 출력
		// --- 2단 ---
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ..
		// 2 * 9 = 18
		// --- 3단 ---
		// 3 * 1 = 3
		// ..
		/*
		for (int i = 2; i <= 9; i++) {
			LOGGER.debug("---" + i + "단 ---");
			for (int k = 1; k <= 9; k++) {
				//LOGGER.debug(i + "*" + k + "=" + i * k);
				LOGGER.debug(String.format("%d * %d = %d", i, k, (i * k)));
			}
		}
		*/
		
		// 4단계. Scanner를 통해 단수를 입력받아, 정수형 변수 num에 담고 해당 구구단을 출력한다.
		// 단계는? 4
		// --- 4단 ---
		// 4 * 1 = 4
		// 4 * 2 = 8
		// ...
		// 4 * 9 = 36
		// 끝.
		
//		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//			
//		}
//		catch (IOException ex) {
//			LOGGER.error(ex.getMessage(), ex);
//		}
/*		
		System.out.print("단수:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int k = 1; k <= 9; k++) {
			LOGGER.debug(num + "*" + k + "=" + (num * k));
		}
*/		
		
		// 5단계. 정수형 배열 길이가 5개인 arr을 만든다. 이때 arr에 1, 2, 3, 4, 5를 담는다.
		// 루프를 돌려서 짝수만 출력한다.
		int[] arr = {1, 2, 3, 4, 5};
		for (int h = 0; h < arr.length; h++) {
			if (arr[h] % 2 == 1) {
				LOGGER.debug("" + arr[h]);
			}
		}
	}
}
