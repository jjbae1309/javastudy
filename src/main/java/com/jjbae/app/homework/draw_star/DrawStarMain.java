package com.jjbae.app.homework.draw_star;

import java.awt.Dimension;
import java.awt.Toolkit;

public class DrawStarMain {
	public static void main(String[] args) {
//		DerbyGame derbyGame = new DerbyGame();
//		derbyGame.run();
		
		// 화면 크기
		Dimension scrDim = Toolkit.getDefaultToolkit().getScreenSize();
		
		int xPos = (scrDim.width - DrawStarFrame.WIDTH) / 2;
		int yPos = (scrDim.height - DrawStarFrame.HEIGHT) / 2;
		
		DrawStarFrame frame = new DrawStarFrame();
		frame.setBounds(xPos, yPos, DrawStarFrame.WIDTH, DrawStarFrame.HEIGHT);
		frame.setVisible(true);
	}
}
