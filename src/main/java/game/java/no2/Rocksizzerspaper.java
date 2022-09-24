package game.java.no2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Rocksizzerspaper {
	public static void main(String[] args) throws IOException {
		int comWin = 0;
		int humanWin = 0;
		
		for (int i = 0; i < 3; i++) {
			//0~2�� ���� �߻�
			Random r = new Random();
			int computer = Math.abs(r.nextInt() % 3); //������ ���ؼ� 3���� ���� ��������
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			String user;
			System.out.println("����, ����, �� �� �ϳ��� �����ϼ���.(���� = a ���� = b �� = c)");
			user = in.readLine();

			if (user.equals("a")) {
				if (computer == 0) 
					System.out.println("���º�!");
				else if (computer == 1) {
					System.out.println("��ǻ�� �¸�!");
					comWin ++;
				}
				else if(computer == 2) {
					System.out.println("��� �¸�!");
					humanWin++;
				}
			}
			else if (user.equals("b")) {
				if(computer == 0) {
					System.out.println("��� �¸�!");
					humanWin++;
				}
				if(computer == 1) System.out.println("���º�!");
				if(computer == 2) {
					System.out.println("��ǻ�� �¸�!");
					comWin++;
				}

			}
			else if (user.equals("c")) {
				if(computer == 0) {
					System.out.println("��ǻ�� �¸�!");
					comWin++;
				}
				if(computer == 1) {
					System.out.println("��� �¸�!");
					humanWin++;
				}
				if(computer == 2) System.out.println("���º�!");

			}
		}
		
		if (comWin > humanWin) {
			System.out.println("��ǻ�Ͱ� ������� �¸�. �¸�Ƚ��:" + comWin);
		}
		else if (comWin < humanWin) {
			System.out.println("����� ��ǻ�Ϳ��� �¸�. �¸�Ƚ��:" + humanWin);
		}
		else {
			System.out.println("�����ϴ�.");
		}
	}
}
