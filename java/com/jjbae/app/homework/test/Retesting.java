package com.jjbae.app.homework.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Retesting {
	private static Logger LOGGER = LoggerFactory.getLogger(Retesting.class);
	
	public static void main(String[] args) {
		/* scanner를 이용해 단수 입력, 정수형 변수에 담은 후 구구단 출력하기.
		
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			
		}
		catch (IOException ex) {
			LOGGER.error(ex.getMessage(), ex);
		}
		
		System.out.print("단수:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int k = 1; k <= 9; k++) {
			LOGGER.debug(num + "*" + k + "=" + (num * k));
		}
		
		 사용자 인풋으로 문자열 배열의 개수를 입력 받고,
		 개수만큼 사람 이름을 입력받아 김씨 성인 사람만 출력하기.
		System.out.print("사람 이름의 수는?");
		Scanner scanner = new Scanner(System.in);
		int personNum = scanner.nextInt();
		String[] personArr = new String[personNum];
		for (int i = 0; i < personArr.length; i++) {
			System.out.print(i + "번째 사람 이름은?");
			personArr[i] = scanner.next();
		}
		
		LOGGER.debug("김씨인 사람 이름은");
		for (int a = 0; a < personArr.length; a++) {
			if (personArr[a].indexOf("김") == 0) {
				LOGGER.debug(personArr[a]);
			}
		}
		
		
		 사용자 인풋으로 축구 선수의 수를 입력받고,
		 개수만큼 "이름, 포지션(FW, MF, DF, GK), 속력 , 가속력, 골결정력(0 ~ 10)" 입력받기.
		 FW중 골 결정력이 가장 높은 사람
		 MF나 DF중 속력이 가장 느린 사람 출력하기.
		
		System.out.print("축구선수의 수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int soccerNum = scanner.nextInt();
		String[] soccerArr = new String[soccerNum];
		System.out.print("이름,포지션,속력,가속력,골결정력순으로 입력해주세요.");
		
		for (int i = 0; i < soccerArr.length; i++) {
			soccerArr[i] = scanner.next();
		}
		
		String highestGoaler = null;
		int highestGoalDt = 0;
		String slowestPlayer = null;
		int slowestSpeed = 11;
		
		for (int k = 0; k < soccerArr.length; k++) {
			String soccerData = soccerArr[k];
			String words[] = soccerData.split(",");
			
			String name = words[0];
			String positions = words[1];
			int speed = Integer.parseInt(words[2]);
			int acceleration = Integer.parseInt(words[3]);
			int goalDetermin = Integer.parseInt(words[4]);
			
			if (positions.equals("FW") && highestGoalDt < goalDetermin) {
				highestGoalDt = goalDetermin;
				highestGoaler = name;
			}
			
			if ((positions.equals("DF") || positions.equals("MF")) && slowestSpeed > speed) {
				slowestSpeed = speed;
				slowestPlayer = name;
			}
		}
		LOGGER.debug(String.format("FW선수들중 가장 골결정력이 높은 사람은 %s 입니다.", highestGoaler));
		LOGGER.debug(String.format("DF와 MF선수들중 가장 느린 사람은 %s 입니다.", slowestPlayer));	}
*/
		// Array를 List로 변환시켜 내용을 유연히 추가하고 빼낼수 있도록 하기.
		
		Player[] playerArr2 = new Player[10];
		List<Player> playerList = new ArrayList<>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader("data/soccer1.dat"))) {
			String readLine = null;
			while ((readLine = reader.readLine()) != null) {
				String[] words = readLine.split(",");
				
				Player onePlayer = new Player();
				onePlayer.setName(words[0]);
				onePlayer.setPosition(words[1]);
				onePlayer.setSpeed(Integer.parseInt(words[2]));
				onePlayer.setAccel(Integer.parseInt(words[3]));
				onePlayer.setGoal(Integer.parseInt(words[4]));
				onePlayer.setHealth(Integer.parseInt(words[5]));
//				Player onePlayer1 = new Player(words[0],
//						words[1],
//						Integer.parseInt(words[2]),
//						Integer.parseInt(words[3]),
//						Integer.parseInt(words[4]),
//						Integer.parseInt(words[5])
//						);
				playerList.add(onePlayer);
			}
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
		}
		
		Player maxSpeedPlayer = null;
		Player lowGoalPlayer = null;
		for (Player onePlayer : playerList) {
			if (maxSpeedPlayer == null || maxSpeedPlayer.getSpeed() < onePlayer.getSpeed()) {
				maxSpeedPlayer = onePlayer;
			}
			
			if (lowGoalPlayer == null || lowGoalPlayer.getGoal() > onePlayer.getGoal()) {
				lowGoalPlayer = onePlayer;
			}
			
			LOGGER.debug(String.format("가장 빠른 플레이어는 %s이고 스피드는 %s입니다.", 
					maxSpeedPlayer.getName(), maxSpeedPlayer.getSpeed()));
			
			LOGGER.debug(String.format("가장 골 결정력이 낮은 플레이어는 %s이고 수치는 %s입니다.", 
					lowGoalPlayer.getName(), lowGoalPlayer.getGoal()));
			
		}
	}	
}