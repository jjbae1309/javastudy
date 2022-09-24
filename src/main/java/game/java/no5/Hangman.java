package game.java.no5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hangman {
	
	protected String hiddenString;
	StringBuffer outputString;
	StringBuffer inputString;
	int remainder;
	int failed;
	
	public Hangman() throws IOException { 
		hiddenString = "exception";
	}
	
	public int playGame() throws IOException {
		outputString = new StringBuffer();
		
		for (int i = 0; i < hiddenString.length(); i++) {
			outputString.append('_');
		//	outputString = outputString + "_"; // concat
		}
		
		inputString = new StringBuffer();
		
		remainder = hiddenString.length();
		failed = 0;
		
		System.out.println("\n�ܾ�("+ hiddenString.length() + "����" + ") : " + outputString);
		
		drawMan();
		
		do {
			char a = readChar();
			checkChar(a);
			//checkChar(readChar());
			System.out.println("\n�ܾ�("+ hiddenString.length() + "����" + ") : " + outputString);
			drawMan();
		}
		while ((remainder > 0) && (failed < 6));
		
		return failed;
	}
	
	public void checkChar(char guess) {
		boolean already = false;
		for (int i = 0; i < inputString.length(); i++) {
			if(inputString.charAt(i) == guess) {
				System.out.println("\n�̹� �Է��� �����Դϴ�! �ٽ� �Է����ּ���,");
				already = true;
			}
		}
		
		//if(!already) {
		if (already == false) {
			inputString.append(guess);
			boolean success = false;
			for (int i = 0; i < hiddenString.length(); i++) {
				if(hiddenString.charAt(i) == guess) {
					outputString.setCharAt(i, guess);
					remainder--;
					success = true;
				}
			}
			if(!success) failed++;
		}
	}

	public void drawMan() {
		System.out.println("  ����������");
		System.out.println("  ��   ��");

		switch(failed) {
		case 0:
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("      | ");
			System.out.println("      |");
			System.out.println("      |");
			break;
		case 1:
			System.out.println("  ��   |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("      | ");
			System.out.println("      |");
			System.out.println("      |");
			break;
		case 2:
			System.out.println("  ��   |");
			System.out.println(" ����   |");
			System.out.println("      |");
			System.out.println("      | ");
			System.out.println("      |");
			System.out.println("      |");
			break;
		case 3:
			System.out.println("  ��   |");
			System.out.println(" ����   |");
			System.out.println("  |   |");
			System.out.println("      | ");
			System.out.println("      |");
			System.out.println("      |");
			break;
		case 4:
			System.out.println("  ��   |");
			System.out.println(" ������  |");
			System.out.println("  |   |");
			System.out.println("      | ");
			System.out.println("      |");
			System.out.println("      |");
			break;
		case 5:
			System.out.println("  ��   |");
			System.out.println(" ������  |");
			System.out.println("  |   |");
			System.out.println(" ������  | ");
			System.out.println(" |    |");
			System.out.println("      |");
			break;
		case 6:
			System.out.println("  ��   |");
			System.out.println(" ������  |");
			System.out.println("  |   |");
			System.out.println(" ������  | ");
			System.out.println(" | |  |");
			System.out.println("      |");
			break;
		}
	}


	public char readChar() throws IOException { 
		// �ܼ�(stdin)�κ��� ���ڿ��� �Է¹޴� ���
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String user;

		System.out.print("1 ���ڸ� �Է��ϼ���:");
		// newline(����)������ ���ڿ��� �Է¹޴´�.
		user = in.readLine();
		// ���ڿ� �� ù �ѱ��ڸ� �����ؼ� �����Ѵ�.
		return user.charAt(0);
	}
}