package game.java.no3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class TimesTable {
	public static void main(String[] args) throws IOException {
		
		int x, y;
		Random r = new Random();
			
		for (int i = 0; i < 4; i++) {
			if (args.length == 1) { //�μ��� ������ �μ��� �� ������ ���� ����
				//x = Integer.valueOf(args[0]).intValue();
				x = Integer.parseInt(args[0]);
				//�μ��� STring ���̹Ƿ� ���� Ŭ������ ����Ͽ� int������ ����ȯ
			} 
			else {
				x = Math.abs (r.nextInt() % 9) + 1;
			}
			
			y = Math.abs(r.nextInt() % 9) + 1;
			
			int num = x * y;
			
			System.out.println();
			System.out.println("* ������ " + x + "�ܿ� ���� �����Դϴ�.('x'�� ����)");
			System.out.println();
			
			System.out.println(x + " * " + y +" = ");
			
			BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
			String user;
			user = in.readLine();//Ű����κ��� �Է�
			
			if ("x".equals(user)) {
				break;
			}
			
			//int inputNum = new Integer(user).intValue();
			int inputNum = Integer.parseInt(user);
			//Ű���忡�� �Է¹��� ���� String ���̹Ƿ� ����Ŭ������ ����Ͽ� int������ ��ȯ
			
			if (num == inputNum) {
				System.out.println("�¾ҽ��ϴ�.");
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�. ������ "+ num + " �Դϴ�.");
			}
		}
		
		System.out.println("����Ǿ����ϴ�.");
	}
}
