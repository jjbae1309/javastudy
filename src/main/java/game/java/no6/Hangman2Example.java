package game.java.no6;

import java.io.IOException;

public class Hangman2Example {
	public static void main(String[] args) throws IOException {
		String filePath = args[0];
		System.out.println("filePath:" + filePath);
		
		Hangman2 hangman2 = new Hangman2(filePath);
		int result = hangman2.playGame();
		
		System.out.println();
		if (result <= 2) {
			System.out.println("참 잘했어요");	
				}
		else if (result <= 3) {
			System.out.println("잘했어요");
		}
		else if (result <= 4) {
			System.out.println("보통이네요");
		}
		else {
			System.out.println("분발하세요");
		}
	}
}
