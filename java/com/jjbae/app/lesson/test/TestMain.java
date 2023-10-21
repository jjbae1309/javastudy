package com.jjbae.app.lesson.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMain {
	private static Logger LOGGER = LoggerFactory.getLogger(TestMain.class);
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int total = a * b;
		
		LOGGER.debug("a * b =" + total);
		
		int sum = 0;
		for (int o = 1; o <= 100; o++) {
			sum = sum + o;
		}
		
		LOGGER.debug("sum =" + sum);
		
		
		for (int i = 2; i <= 9; i++) {
			LOGGER.debug("---" + i + "단 ---");
			for (int k = 1; k <= 9; k++) {
				LOGGER.debug(String.format("%d * %d = %d", i, k, (i * k)));
			}
		}
		
//		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//			
//		}
//		catch (IOException ex) {
//			LOGGER.error(ex.getMessage(), ex);
//		}
		
		System.out.print("단수:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int k = 1; k <= 9; k++) {
			LOGGER.debug(num + "*" + k + "=" + (num * k));
		}
		
		int [] arr = {1, 2, 3, 4, 5};
		for (int h = 0; h < arr.length; h++) {
			if (arr[h] % 2 == 1) {
				LOGGER.debug(" " + arr[h]);
			}
		}
	}
}
