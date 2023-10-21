package com.jjbae.app.homework.test;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WarmUp {
	private static Logger LOGGER = LoggerFactory.getLogger(WarmUp.class);
	
	public static void main(String[] args) {
//		int sum = 0;
//		
//		for (int i = 1; i <= 100; i++) {
//			sum = sum + i;
//		}
//		LOGGER.debug(String.format("1부터 100까지 숫자의 합은 %s 입니다", sum));
	
		/*
		 *  1. 길이가 10인 정수형 배열을 만든다.
		 *  2. 길이만큼 루프를 돌면서 1~100 사이의 정수 랜덤 값을 하나 넣는다.
		 *  3. 길이만큼 루프를 돌면서 배열의 값들을 다 더한다.
		 *  4. 출력한다.
		 */

//		int[] testArr = new int[10];
//		for (int i = 0; i < testArr.length; i++) {
//			int k = (int)(Math.random() * 100) + 1;
//			LOGGER.debug(String.format("[%s]:%s", i, k));
//			testArr[i] = k;
//		}
//		
//		int sum = 0;
//		for (int i = 0; i < testArr.length; i++) {
//			sum = sum + testArr[i];
//		}
//		
//	LOGGER.debug(String.format("배열의 값의 총합은 %s입니다.", sum));
	
		List<Integer> list = new ArrayList<>();
		
		for (int t = 0; t < 10; t++) {
			for (int i = 0; i < 100; i++) {
				int k = (int)(Math.random() * 100) + 1;
//				LOGGER.debug(String.format("[%d]:%d", i, k));
				list.add(k);
			}
			
			int sum = 0;
			for (int i = 0; i < list.size(); i++) {
				sum = sum + list.get(i);
			}
			int avg = sum / list.size();
			
			LOGGER.debug(String.format("List의 개수는 %d입니다.", list.size()));
			LOGGER.debug(String.format("List의 값의 총합은 %s입니다.", sum));
			LOGGER.debug(String.format("list의 평균은 %d 입니다.", avg));
		}	
	
		
	
	
		
		/*
		 * --- 2단 ---
		 *  2 * 1 = 2
		 *  2 * 2 = 4
		 *  
		 *  ...
		 *  
		 *  --- 9단 ---
		 *  ...
		 *  9 * 9 = 81
		 */
		
//		for (int i = 2; i <= 9; i++) {
//			LOGGER.debug(String.format("--- %d단 ---", i));
//			for (int k = 1; k <= 9; k++) {
//				LOGGER.debug(String.format("%d * %d = %d", i, k, i * k));
//			}
//				
//		}
			
	}
}
