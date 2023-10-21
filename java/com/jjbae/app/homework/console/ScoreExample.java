package com.jjbae.app.homework.console;

import java.util.Scanner;

public class ScoreExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		
		while (true) {
			int i = scanner.nextInt();

			if (i == -1) {
				break;
			}
			
			sum = i + sum;
			count++;
			
			String rank = null;
			if (i >= 91 && i <= 100) {
				rank = "수";
			}
			else if (i >= 81 && i <= 90) {
				rank = "우";
			}
			else if (i >= 71 && i <= 80) {
				rank = "미";
			}
			else if (i >= 61 && i <= 70) {
				rank = "양";
			}
			else if (i >= 0 && i <= 60) {
				rank = "가";
			}
			else {
				rank = "판단할수 없습니다.";
			}
			
			System.out.println("등급:" + rank);
		}
		
		System.out.println("평균:" + (sum / count));
	}
}
