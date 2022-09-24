package game.java.no6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import game.java.no5.Hangman;

public class Hangman2 extends Hangman {
	private String[] words = {
			"influenza",
			"fever",
			"cancer",
			"poison",
			"victim",
			"physician",
			"clinic",
			"symptom",
			"medicine",
			"drug",
			"hygiene"
	};
	
	private String[] meaning = {
			"독감",
			"열",
			"암",
			"독",
			"환자",
			"내과의사",
			"진료소",
			"징후",
			"의학",
			"약",
			"위생학"
	};
	
	public Hangman2() throws IOException {
		Random r = new Random();
		int randomNum = Math.abs( r.nextInt() % words.length);
		
		hiddenString = words[randomNum];
		/*
		words[0] --> influenza
		words[1] --> fever
		...
		words[10] --> hygiene
		*/
		
		System.out.println("randomNum:" + randomNum + ", hiddenString:" + hiddenString);
	}
	
	public Hangman2(String filePath) throws IOException {
		initWords(filePath);
		
		Random r = new Random();
		int randomNum = Math.abs( r.nextInt() % words.length);
		
		hiddenString = words[randomNum];
		/*
		words[0] --> influenza
		words[1] --> fever
		...
		words[10] --> hygiene
		*/
		
		System.out.println("randomNum:" + randomNum + ", hiddenString:" + hiddenString);
	}
	
	private void initWords(String filePath) {
		List<String> wordList = new ArrayList();
		List<String> meaningList = new ArrayList();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String readLine = null;
			while ((readLine = reader.readLine()) != null) {
				System.out.println("readLine:" + readLine);
				
				String[] oneWords = readLine.split(",");
				if (oneWords.length == 2) {
					meaningList.add(oneWords[0]);
					wordList.add(oneWords[1]);
				}
			}
			
			words = new String[wordList.size()];
			meaning = new String[meaningList.size()];
			
			wordList.toArray(words);
			meaningList.toArray(meaning);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	/*
	@Override
	public char readChar() throws IOException { 
		return 'a';
	}
	*/
}
