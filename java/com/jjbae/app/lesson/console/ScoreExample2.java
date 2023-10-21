package com.jjbae.app.lesson.console;

import java.util.Scanner;

public class ScoreExample2 {

	public static String getRank(int score) {
		String rank = null;

		if (score >= 91 && score <= 100) {
			rank = "수";
		}
		else if (score >= 81 && score <= 90) {
			rank = "우";
		}
		else if (score >= 71 && score <= 80) {
			rank = "미";
		}
		else if (score >= 61 && score <= 70) {
			rank = "양";
		}
		else if (score >= 0 && score <= 60) {
			rank = "가";
		}
		else {
			rank = "판단할수 없습니다.";
		}
		
		return rank;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int count = 0;
		
		while (true) {
			scanner.reset();
			
			System.out.print("이름: ");
			String name = scanner.nextLine();
			
			// 문자열 내용 비교
			if (name.equals("x")) {
				break;
			}
			
			System.out.print("국어:");
			
			int kor = scanner.nextInt();
			// 엔터 제거
			scanner.nextLine();
			System.out.println(getRank(kor));
			
			System.out.print("수학:");
			int math = scanner.nextInt();
			// 엔터 제거
			scanner.nextLine();
			System.out.println(getRank(math));
			
			System.out.print("영어: ");
			int eng = scanner.nextInt();
			// 엔터 제거
			scanner.nextLine();
			System.out.println(getRank(eng));
			
			int total = kor + eng + math;
			int avg = total / 3;
			System.out.println(name + "의 등급: " + getRank(avg));
			
			sum = sum + avg;
			count++;
		}
		
		//int avg = sum / count;
		int avg = 0;
		if (count > 0) {
			avg = sum / count;
		}
		
		
		System.out.println("전체 등급:" + getRank(avg));
	}
}
