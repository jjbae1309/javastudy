package com.jjbae.app.homework.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMain11_20 {
	private static Logger LOGGER = LoggerFactory.getLogger(TestMain11_20.class);
	public static void main(String[] args) {
		/**
		 * 11단계.
		 * 사용자 인풋으로 축구 선수의 수를 입력 받고,
		 * 갯수만큼 "이름,포지션(FW, MF, DF, GK),속력,가속력,골결정력(0~10)" 입력받는다.
		 * 
		 * FW중 골결정력이 가장 높은 사람
		 * MF나 DF중에 속력이 가장 느린 사람
		 * 출력한다.
		 */
/*		
		System.out.print("축구선수의 수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int soccerNum = scanner.nextInt();
		String[] soccerArr = new String[soccerNum];
		System.out.print("이름,포지션,속력,가속력,골결정력을 차례대로 입력해주세요");

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
		
			// 포지션이 FW이면서, 골결정력이 직전 최고 결정력보다 크다면
			if (positions.equals("FW") && highestGoalDt < goalDetermin) {
				highestGoalDt = goalDetermin;
				highestGoaler = name;
			}
			
			// 포지션이 DF이거나 MF이면서, 속도가 직전 최소 속도보다 낮다면
			if ((positions.equals("DF") || positions.equals("MF")) && slowestSpeed > speed) {
				slowestSpeed = speed;
				slowestPlayer = name;
			}
		}
		LOGGER.debug(String.format("FW선수들중 가장 골결정력이 높은 사람은 %s 입니다.", highestGoaler));
		LOGGER.debug(String.format("DF와 MF선수들중 가장 느린 사람은 %s 입니다.", slowestPlayer));
*/		
		/**
		 * 12단계. Scanner를 통해 매번 직접 입력하는게 불편.
		 * soccer.dat 파일에 입력데이터를 넣고, 해당 파일을 읽어 들여 데이터를 입력받는다.
		 */
/*
		String[] soccerArr = null;
		try (BufferedReader reader = new BufferedReader(new FileReader("data/soccer.dat"))) {
			int soccerNum = Integer.parseInt(reader.readLine());
			
			soccerArr = new String[soccerNum];
			
			for (int i = 0; i < soccerNum; i++) {
				soccerArr[i] = reader.readLine();
				LOGGER.debug(soccerArr[i]);
			}
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
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
		
			// 포지션이 FW이면서, 골결정력이 직전 최고 결정력보다 크다면
			if (positions.equals("FW") && highestGoalDt < goalDetermin) {
				highestGoalDt = goalDetermin;
				highestGoaler = name;
			}
			
			// 포지션이 DF이거나 MF이면서, 속도가 직전 최소 속도보다 낮다면
			if ((positions.equals("DF") || positions.equals("MF")) && slowestSpeed > speed) {
				slowestSpeed = speed;
				slowestPlayer = name;
			}
		}
		LOGGER.debug(String.format("FW선수들중 가장 골결정력이 높은 사람은 %s 입니다.", highestGoaler));
		LOGGER.debug(String.format("DF와 MF선수들중 가장 느린 사람은 %s 입니다.", slowestPlayer));
*/		
		/**
		 * 12단계. soccer.dat 파일에 입력데이터를 넣고, 해당 파일을 읽어 들여 데이터를 입력받는다.
		 * 첫번째 라인에서 축구 선수의 수를 입력 받고,
		 * 갯수만큼 "이름,포지션(FW, MF, DF, GK),속력,가속력,골결정력(0~10)" 입력받는다.
		 * 선수별로 속력,가속력,골결정력 합을 구하고
		 * 각 포지션별 합이 가장 높은사람을 출력한다.
		 * ex) FW 배수현(30)
		 *     MF 배재준(29)
		 *     DF 배재율(27)
		 *     GK 홍길동(28)
		 */
		
//		Player p = new Player();
//		p.setName("배재준");
//		p.setPosition("FW");
//		p.setSpeed(6);
//		p.setAccel(7);
//		p.setGoal(8);
//		
//		LOGGER.debug("p = " + p);
		
		//1. Player 정보를 담는다.
/*		Player[] playerArr = null;
		try (BufferedReader reader = new BufferedReader(new FileReader("data/soccer.dat"))) {
			int soccerNum = Integer.parseInt(reader.readLine());
			
			playerArr = new Player[soccerNum];
			
			for (int i = 0; i < soccerNum; i++) {
				String[] data = reader.readLine().split(",");
				
				playerArr[i] = new Player();
				playerArr[i].setName(data[0]);
				playerArr[i].setPosition(data[1]);
				
				int speed = Integer.parseInt(data[2]);
				int accel = Integer.parseInt(data[3]);
				int goal = Integer.parseInt(data[4]);
				int total = speed + accel + goal;
				
				playerArr[i].setSpeed(speed);
				playerArr[i].setAccel(accel);
				playerArr[i].setGoal(goal);
				playerArr[i].setTotal(total);
				
				LOGGER.debug("p = " + playerArr[i]);
			}
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
		}

		// 2. 루프를 돌면서 포지션별 합이 가장 높은 사람을 찾는다.
		int fwMax = 0;
		int mfMax = 0;
		int dfMax = 0;
		int gkMax = 0;
		
		Player fwPlayer = null;
		Player mfPlayer = null;
		Player dfPlayer = null;
		Player gkPlayer = null;
		
		for (int k = 0; k < playerArr.length; k++) {
			Player onePlayer = playerArr[k];
			
			if (onePlayer.getPosition().equals("FW") && fwMax < onePlayer.getTotal()) {	
				fwPlayer = onePlayer;
				fwMax = onePlayer.getTotal();
			}
			else if (onePlayer.getPosition().equals("MF") && mfMax < onePlayer.getTotal()) {
				mfPlayer = onePlayer;
				mfMax = onePlayer.getTotal();
			}
			else if (onePlayer.getPosition().equals("DF") && dfMax < onePlayer.getTotal()) {
				dfPlayer = onePlayer;
				dfMax = onePlayer.getTotal();
			}
			else if (onePlayer.getPosition().equals("GK") && gkMax < onePlayer.getTotal()) {
				gkPlayer = onePlayer;
				gkMax = onePlayer.getTotal();
			}
		}
		LOGGER.debug(String.format("FW %s(%s)", fwPlayer.getName(), fwMax));
		LOGGER.debug(String.format("MF %s(%s)", mfPlayer.getName(), mfMax));
		LOGGER.debug(String.format("DF %s(%s)", dfPlayer.getName(), dfMax));
		LOGGER.debug(String.format("GK %s(%s)", gkPlayer.getName(), gkMax));
*/
		// 숙제
		// 1) soccer.dat에 HP(체력)을 추가한다.
		// 2) 10명의 데이터를 입력한다.
		// 3) 합(total)을 구할때 속력, 가속력, 골결정력, 체력의 합을 구한다.
		// 4) 포지션별 total의 평균을 구한다.
/*		
		Player[] playerArr = null;
		try (BufferedReader reader = new BufferedReader(new FileReader("data/soccer.dat"))) {
			int soccerNum = Integer.parseInt(reader.readLine());
			
			playerArr = new Player[soccerNum];
			for (int i = 0; i < playerArr.length; i++) {
				String[] data = reader.readLine().split(",");
				
				playerArr[i] = new Player();
				playerArr[i].setName(data[0]);
				playerArr[i].setPosition(data[1]);
				
				int speed = Integer.parseInt(data[2]);
				int accel = Integer.parseInt(data[3]);
				int goal = Integer.parseInt(data[4]);
				int health = Integer.parseInt(data[5]);
				int total = speed + accel + goal + health;
				
				playerArr[i].setSpeed(speed);
				playerArr[i].setAccel(accel);
				playerArr[i].setGoal(goal);
				playerArr[i].setTotal(total);
				playerArr[i].setHealth(health);
				LOGGER.debug("p = " + playerArr[i]);
			}
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
		}
		int fwTotal = 0;
		int mfTotal = 0;
		int dfTotal = 0;
		int gkTotal = 0;
		
		int fwPlayer = 0;
		int mfPlayer = 0;
		int dfPlayer = 0;
		int gkPlayer = 0;
		
		for (int k = 0; k < playerArr.length; k++) {
			Player onePlayer = playerArr[k];
			
			if (onePlayer.getPosition().equals("FW")) {
				fwPlayer++;
				fwTotal = fwTotal + playerArr[k].getTotal();
			}
			else if (onePlayer.getPosition().equals("MF")) {
				mfPlayer++;
				mfTotal = mfTotal + playerArr[k].getTotal();
			}
			else if (onePlayer.getPosition().equals("DF")) {
				dfPlayer++;
				dfTotal = dfTotal + playerArr[k].getTotal();
			}
			else if (onePlayer.getPosition().equals("GK")) {
				gkPlayer++;
				gkTotal = gkTotal + playerArr[k].getTotal();
			}
		}
		
		LOGGER.debug(String.format("fw의 총점 평균은 %s입니다.", fwTotal / fwPlayer));
		LOGGER.debug(String.format("mf의 총점 평균은 %s입니다.", mfTotal / mfPlayer));
		LOGGER.debug(String.format("df의 총점 평균은 %s입니다.", dfTotal / dfPlayer));
		LOGGER.debug(String.format("gk의 총점 평균은 %s입니다.", gkTotal / gkPlayer));
*/		
		/**
		 * 13단계. Array를 List로 바꾼다.
		 */
/*		
		//Player[] playerArr2 = new Player[10];
		List<Player> playerList = new ArrayList<>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader("data/soccer1.dat"))) {
			String readLine = null;
			while ((readLine = reader.readLine()) != null) {
				String[] words = readLine.split(",");
				
//				Player onePlayer = new Player();
//				onePlayer.setName(words[0]);
//				onePlayer.setPosition(words[1]);
//				onePlayer.setSpeed(Integer.parseInt(words[2]));
//				onePlayer.setAccel(Integer.parseInt(words[3]));
//				onePlayer.setGoal(Integer.parseInt(words[4]));
//				onePlayer.setHealth(Integer.parseInt(words[5]));
				Player onePlayer = new Player(words[0], 
						words[1], 
						Integer.parseInt(words[2]),
						Integer.parseInt(words[3]),
						Integer.parseInt(words[4]),
						Integer.parseInt(words[5])
						);

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
		}
		
		LOGGER.debug(String.format("가장 빠른 플레이어는 %s이고 스피드는 %s입니다.", 
				maxSpeedPlayer.getName(), maxSpeedPlayer.getSpeed()));
		
		LOGGER.debug(String.format("가장 골 결정력이 낮은 플레이어는 %s이고 수치는 %s입니다.", 
				lowGoalPlayer.getName(), lowGoalPlayer.getGoal()));
*/		
//		List<BaseballPlayer> playerList = new ArrayList<>();
		
		// STEP1. 파일에서 읽어서 담는다.
/*		try (BufferedReader reader = new BufferedReader(new FileReader("data/baseball.dat"))) {
			String readLine = null;
			while ((readLine = reader.readLine()) != null) {
				String[] data = readLine.split(",");
				
				BaseballPlayer onePlayer = new BaseballPlayer(
						data[0], 
						data[1],
						Integer.parseInt(data[2]), 
						Integer.parseInt(data[3]));
				
				playerList.add(onePlayer);
			}
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
		}
		
		// STEP2. 담은 내용을 출력한다.
		for (BaseballPlayer onePlayer : playerList) {
			LOGGER.debug(String.format("[%s]%s %.3f", onePlayer.getPosition(), onePlayer.getName(), onePlayer.getAvg()));
		}
		
*/		
		/**
		 * 숙제. baseball.dat에 삼진, 포볼수 추가
		 * 1) 삼진율, 출루율=(안타수 + 포볼수) / (타수 + 포불수)을 구한다.
		 * 2) 타율이 제일 높은 선수를 출력한다.
		 */
		
		List<BaseballPlayer> playerList = new ArrayList<>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader("data/baseball.dat"))) {
			String readLine = null;
			while ((readLine = reader.readLine()) != null) {
				String[] data = readLine.split(",");
				
				BaseballPlayer onePlayer = new BaseballPlayer(
						data[0],
						data[1],
						Integer.parseInt(data[2]),
						Integer.parseInt(data[3]),
						Integer.parseInt(data[4]),
						Integer.parseInt(data[5]));
					
				playerList.add(onePlayer);
			}

		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
		}
		
		BaseballPlayer bestHitter = null;
		for (BaseballPlayer onePlayer : playerList) {
			if (bestHitter.getAvg() < onePlayer.getAvg()) {
			
			}
		}
		LOGGER.debug("타율이 가장 높은 선수는 %s 입니다.", bestHitter);
	}
}
