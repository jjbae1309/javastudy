package game.java.no1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Today_luckGame {
	public static void main(String[] args) {
		
		Date  today = new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy�� mm�� dd���� ");
		System.out.print(dateForm.format(today));
		
		Random r = new Random();
		int randomNum = Math.abs(r.nextInt() % 100)+1;
		System.out.println("������(100) : " + randomNum + "%");
		
		
	}
}
	