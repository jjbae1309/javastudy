package com.jjbae.app.homework.derby;

public class DerbyGame {
	public void run() {
		Horse horse1 = new Horse();
		horse1.setName("로빈");
		horse1.setSpeed(9);
		
		Horse horse2 = new Horse();
		horse2.setName("베트맨");
		horse2.setSpeed(10);
		
		int horse1Total = 0;
		int horse2Total = 0;
		for (int i = 0; i < 10; i++) {
			horse1Total = horse1Total + horse1.getSpeed();
			horse2Total = horse2Total + horse2.getSpeed();
			
			for (int j = 0; j < horse1Total; j++) {
				System.out.print("A");
			}
			
			System.out.println();
			
			for (int j = 0; j < horse2Total; j++) {
				System.out.print("B");
			}
			
			System.out.println();
			
			try {
				Thread.sleep(1000);
			}
			catch (Exception ex) {
				
			}
		}
	}
}
