package com.jjbae.app.homework.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMain1_10 {
	private static Logger LOGGER = LoggerFactory.getLogger(TestMain1_10.class);
	
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
/*
		int[] arr = {1, 2, 3, 4, 5};
		for (int h = 0; h < arr.length; h++) {
			if (arr[h] % 2 == 1) {
				LOGGER.debug("" + arr[h]);
			}
		}
*/
		// 6단계. 사용자 인풋으로 배열의 갯수를 입력 받고,
		// 갯수만큼 숫자를 입력받아서
		// 짝수만 출력한다.
//		System.out.print("배열의 개수는?");
//		Scanner scanner = new Scanner(System.in);
//		int scannerNum = scanner.nextInt();
//		int[] p = new int[scannerNum];
//		for (int i = 0; i < p.length; i++) {
//			System.out.print(i + "번째 숫자는?");
//			p[i] = scanner.nextInt();
//		}	
//		for (int n = 0; n < p.length; n++) {
//			if (p[n] % 2 == 0) {
//				LOGGER.debug("" + p[n]);
//			}
//		}
		
//		// 7단계. 사용자 인풋으로 문자열 배열의 갯수를 입력 받고,
//		// 갯수만큼 사람 이름을 입력받아서
//		// 김씨 성인 사람만 출력한다.
//		System.out.print("사람 이름의 수는?");
//		Scanner scanner = new Scanner(System.in);
//		int personNum = scanner.nextInt();
//		String[] personArr = new String[personNum];
//		for (int i = 0; i < personArr.length; i++) {
//			System.out.print(i + "번째 사람 이름은?");
//			personArr[i] = scanner.next();
//		}
//		
//		LOGGER.debug("김씨인 사람 이름은");
//		for (int a = 0; a < personArr.length; a++) {
//			if (personArr[a].indexOf("김") == 0) {
//				LOGGER.debug(personArr[a]);
//			}
//		}
		
//		// 8단계. 사용자 인풋으로 문자열 배열의 갯수를 입력 받고,
//		// 갯수만큼 "이름,국어점수,수학점수,영어점수" 입력받는다.
//		// 문자열 분리 String[] split(String)
//		// 문자를 숫자로 변환 int Integer.parseInt(String)
//		// 사람별로 점수합과 평균을 구해서 출력한다. ex)배재준 총점 270점, 평균 90점
//		System.out.print("사람 수를 입력해주세요");
//		Scanner scanner = new Scanner(System.in);
//		int testNum = scanner.nextInt();		
//		String[] testArr = new String[testNum];
//		System.out.print("이름,국어점수,수학점수,영어점수 순서대로 입력하세요");
//		for (int i = 0; i < testArr.length; i++) {
//			String oneData = scanner.next();
//			testArr[i] = oneData;
//		}
//		
//		int total = 0;
//		
//		for (int y = 0; y < testArr.length; y++) {
//			String oneData = testArr[y];
//			String[] words = oneData.split(",");
//			String name = words[0];
//			int kor = Integer.parseInt(words[1]);
//			int math = Integer.parseInt(words[2]);
//			int eng = Integer.parseInt(words[3]);
//			
//			int sum = kor + math + eng;
//			int avg = sum / 3;
//			
//			total = sum + total;
//
//			LOGGER.debug(String.format("%s 총점 %s점, 평균 %s점", name, sum, avg));
//		}
//		
//		LOGGER.debug(String.format("전체 총점 평균은 %s점 입니다.", total/testNum));
		
		
		// 9단계
		// 사용자 인풋으로 문자열 배열의 갯수를 입력 받고,
		// 갯수만큼 "성별(남/여),키,몸무게" 입력받는다.
		// 여자들의 평균 키와 몸무게를 출력한다.
		// 문자열 분리 String[] split(String)
		// 문자를 숫자로 변환 int Integer.parseInt(String)
		// 문자열 비교 boolean equals(String)		
		// String gender = words[0];
		// gender.equals("여") == true
/*		
		System.out.print("사람 수를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int genderNum = scanner.nextInt();		
		String[] genderArr = new String[genderNum];
		System.out.print("성별(남/여)키, 몸무게 순서대로 입력해주세요");
		for (int i = 0; i < genderArr.length; i++) {
			String genData = scanner.next();
			genderArr[i] = genData;
		}
		
		int womanCount = 0;
		int womanHeight = 0;
		int womanWeight = 0;
		for (int k = 0; k < genderArr.length; k++) {
			String genData = genderArr[k];
			String[] words = genData.split(",");
			String gen = words[0];
			int height = Integer.parseInt(words[1]);
			int weight = Integer.parseInt(words[2]);
			
			LOGGER.debug(String.format("gen:%s, height:%s, weight:%s", gen, height, weight));
			
			if (gen.equals("여") == true) {
				womanCount++;
				//womanHeight = height + womanHeight;
				womanHeight = womanHeight + height;
				//womanHeight += height;
				womanWeight = weight + womanWeight;
			}
		}
		
		if (womanCount > 0) {
			int weightAvg = womanWeight / womanCount;
			int heightAvg = womanHeight / womanCount;

			LOGGER.debug(String.format("평균 여성의 몸무게는:%s, 평균 여성의 키는:%s", weightAvg, heightAvg));
		}
		else {
			LOGGER.debug("여성이 존재하지 않습니다");
		}
*/		
/*		// 10단계
		// 사용자 인풋으로 축구 선수의 수를 입력 받고,
		// 갯수만큼 "포지션(FW, MF, DF, GK),나이" 입력받는다.
		// FW, MF, DF, GK의 수를 각각 구하고,
		// FW + MF의 평균 나이를 구한다.
		System.out.print("축구선수의 수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int soccerNum = scanner.nextInt();
		String[] soccerArr = new String[soccerNum];
		System.out.print("축구선수의 포지션,나이 순서대로 입력해주세요");
		for (int i = 0; i < soccerArr.length; i++) {
			soccerArr[i] = scanner.next();
		}

		int fwCount = 0;
		int mfCount = 0;
		int dfCount = 0;
		int gkCount = 0;
		
		int fwAge = 0;
		int mfAge = 0;
		int dfAge = 0;
		int gkAge = 0;
		
		for (int k = 0; k < soccerArr.length; k++) {
			String soccerData = soccerArr[k];
			String[] words = soccerData.split(",");
			String position = words[0];
			int age = Integer.parseInt(words[1]);
			
			if (position.equals("FW")) {
				fwCount++;
				fwAge = fwAge + age;
			}
			else if (position.equals("MF")) {
				mfCount++;
				mfAge = mfAge + age;
			}
			else if (position.equals("DF")) {
				dfCount++;
				dfAge = dfAge + age;
			}
			else if (position.equals("GK")) {
				gkCount++;
				gkAge = gkAge + age;
			}
		}
		
		int soccerAvg = (fwAge + mfAge) / (fwCount + mfCount);
		
		LOGGER.debug(String.format("FW와 MF의 평균 나이는 %s 입니다.", soccerAvg));
*/
/*		
		// 10단계
		// 사용자 인풋으로 축구 선수의 수를 입력 받고,
		// 갯수만큼 "이름,포지션(FW, MF, DF, GK),속력,가속력,골결정력(0~10)" 입력받는다.
		// 속력이 5이상인 사람을 출력한다.
		// ex) ====== 속력이 5인 사람 ======
		//     즐라탄
		//     아자르
		// FW의 골 결정력 평균을 출력한다.
		// ex) FW의 골 결정력 평균 5 입니다.
		System.out.print("축구선수의 수를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int soccerNum = scanner.nextInt();
		String[] soccerArr = new String[soccerNum];
		System.out.print("이름,포지션,속력,가속력,골결정력 순서대로 입력해주세요");
		
		
		
		for (int i = 0; i < soccerArr.length; i++) {
			soccerArr[i] = scanner.next();
		}
		
		List<String> speedOver5 = new ArrayList<String>();
		int fwGoleDeterMin = 0;
		int fwCount = 0;
		int mfCount = 0;
		int dfCount = 0;
		int gkCount = 0;
		
		for (int k = 0; k < soccerArr.length; k++) {
			String soccerData = soccerArr[k];
			String[] words = soccerData.split(",");
			String name = words[0];
			String position = words[1];
			int speed = Integer.parseInt(words[2]);
			int acceleration = Integer.parseInt(words[3]);
			int goleDetermin = Integer.parseInt(words[4]);
			
			if (speed >= 5) {
				speedOver5.add(name);
			}

			if (position.equals("FW")) {
				fwCount++;
				fwGoleDeterMin = fwGoleDeterMin + goleDetermin;
			}			
		}
		int fwGoleAvg = fwGoleDeterMin / fwCount;

		LOGGER.debug(String.format("FW의 평균 골 결정력은 :%s 입니다.", fwGoleAvg));
		
		LOGGER.debug("====== 속력이 5인 사람 ======");
		for (String oneName : speedOver5) {
			LOGGER.debug(oneName);
		}
				
//		LOGGER.debug(String.format("속력이 5 이상인 사람은 :%s 입니다.", speedOver5));
*/		
	}
}
