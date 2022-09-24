package game.java.no4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class BaseballGame {
	public static void playGame() throws IOException {
		int x, y, z;
		Random r = new Random();
		x = Math.abs(r.nextInt() % 9) + 1;
		
		do {
			y = Math.abs(r.nextInt() % 9) + 1;

		} while (y == x); //x���� y���� ���� �ʵ���(�ٸ� ������)�ݺ��Ѵ�.
		
		do {
			z = Math.abs (r.nextInt() % 9) + 1;
		}
		while ((z == x) || (z == y));
		System.out.println(x + ", " + y + ", " + z);
		
		playGame(x, y, z);
	}
	
	public static int playGame(int x, int y, int z) throws IOException {
		int count;
		int strike, ball;
		
		int[] usr = new int[3];
		int[] com = {x, y, z};
		
		System.out.println("���� �߱� ����");
		
		count = 0;
		strike = 3;
		
		do {
			count++;
			
			do {
				System.out.println("\n ī��Ʈ: " + count);
				
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				String user;
				
				System.out.print("1��° ����:");
				user = in.readLine();
				usr[0] = Integer.parseInt(user);
				
				System.out.print("2��° ����:");
				user = in.readLine();
				usr[1] = Integer.parseInt(user);
				
				System.out.print("3��° ����:");
				user = in.readLine();
				usr[2] = Integer.parseInt(user);
				
				if ((usr[0] == 0) || (usr[1] == 0) || (usr[2] == 0)) {
					System.out.println("0�� �Է����� ������.�ٽ� �Է����ּ���");
				}
				else if ((usr[0] > 9) || (usr[1] > 9) || (usr[2] > 9)) {
					System.out.println("1���� 9������ ������ �ϳ��� �Է����ּ���.");
				}
				else if ((usr[0] == usr[1]) || (usr[1] == usr[2]) || (usr[0] == usr[2])) {
					System.out.println("��� �ٸ� ���� �Է����ּ���.");
				}
			}
			while ((usr[0] == 0) || (usr[1] == 0) || (usr[2] == 0) ||
					(usr[0] > 9) || (usr[1] > 9) || (usr[2] > 9) ||
					(usr[0] == usr[1]) || (usr[1] == usr[2]) || (usr[0] == usr[2]));
			
			strike = ball = 0;
			
			if(usr[0] == com[0]) strike++;
			if(usr[1] == com[1]) strike++;
			if(usr[2] == com[2]) strike++;
			
			if(usr[0] == com[1]) strike++;
			if(usr[0] == com[2]) strike++;
			if(usr[1] == com[0]) strike++;
			if(usr[1] == com[2]) strike++;
			if(usr[2] == com[0]) strike++;
			if(usr[2] == com[1]) strike++;
			
			System.out.println("strike: " + strike +"ball : " + ball);
			
		}
		while ((strike < 3) && (count < 11));
		
		return count;
	}


	public static void main(String[] args) throws IOException {
		playGame();
		int result;
		
		if(args.length == 3) {
			int x = Integer.valueOf(args[1]).intValue();
			int y = Integer.valueOf(args[2]).intValue();
			
			result = playGame(x, y, z);
		}
		else {
			result = playgame();
		}
		
		System.out.println();
		if (result <= 2);
		System.out.println("�� ���߾��");
	}
		else if (result <= 5) {
			System.out.println("���߾��!");
		}
		else if (result <= 9) {
			System.out.println("�����̳׿�");
		}
		else if (result <= 5) {
			System.out.println("���߾��!");
	}
}
