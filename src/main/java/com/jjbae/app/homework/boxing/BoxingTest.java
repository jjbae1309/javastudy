package com.jjbae.app.homework.boxing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoxingTest {
	private static Logger LOGGER = LoggerFactory.getLogger(BoxingTest.class);
	
	public static void main(String[] args) {
		/*
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("data/boxer.dat")); 
			
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
		}
		finally {
			if (reader != null) {
				try {
					reader.close();
				}
				catch (Exception ex) {
					LOGGER.error(ex.getMessage(), ex);
				}
			}
		}
		*/
		
		try (BufferedReader reader = new BufferedReader(new FileReader("data/boxer.dat"))) {
			String readLine = null;

//			while (true) {
//				readLine = reader.readLine();
//				if (readLine == null) {
//					break;
//				}
//			}
			List<Boxer> boxerList = new ArrayList<>();
			while ((readLine = reader.readLine()) != null) {
				String[] words = readLine.split(",");
				Boxer boxer = new Boxer(
						words[0],
						Gender.getGender(words[1]),
						Integer.parseInt(words[2]),
						Integer.parseInt(words[3]),
						Hand.getHand(words[4]),
						Integer.parseInt(words[5]),
						Integer.parseInt(words[6])
						);
				boxerList.add(boxer);
			}
			
			// 1. 몸무게가 제일 많이 나가는 사람
			// 2. 나이가 제일 어린 사람
			// 3. 전체 복서의 평균 체력
			Boxer maxWeightBoxer = null;
			Boxer youngestBoxer = null;
			int totalHealth = 0;
			float healthAvg = 0;
			for (Boxer oneBoxer : boxerList) {
				LOGGER.debug(oneBoxer.toString());
				
				if (maxWeightBoxer == null || maxWeightBoxer.getWeight() < oneBoxer.getWeight()) {
					maxWeightBoxer = oneBoxer;
				}
				
				if (youngestBoxer == null || youngestBoxer.getAge() > oneBoxer.getAge()) {
					youngestBoxer = oneBoxer;
				}
				
				totalHealth = totalHealth + oneBoxer.getHealth();
			}
			
			healthAvg = (float)totalHealth / boxerList.size();
			
			LOGGER.debug(String.format("가장 체중이 많이 나가는 선수는 %s입니다.", maxWeightBoxer.getName()));
			LOGGER.debug(String.format("가장 나이가 어린 선수는 %s입니다.", youngestBoxer.getName()));
			LOGGER.debug(String.format("복서들의 평균 체력은 %s입니다.", healthAvg));
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
		}
	}
}
