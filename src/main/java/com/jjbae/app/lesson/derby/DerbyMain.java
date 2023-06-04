package com.jjbae.app.lesson.derby;

import java.awt.Dimension;
import java.awt.Toolkit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jjbae.app.homework.draw_star.DrawStarFrame;

public class DerbyMain {
	private static Logger LOGGER = LoggerFactory.getLogger(DerbyMain.class);
	
	public static void main(String[] args) {		
//		DerbyGame derbyGame = new DerbyGame();
//		derbyGame.run();
		
		Dimension scrDim = Toolkit.getDefaultToolkit().getScreenSize();
				
		int xPos = (scrDim.width - DrawStarFrame.WIDTH) / 2;
		int yPos = (scrDim.height - DrawStarFrame.HEIGHT) / 2;
				
		DerbyFrame frame = new DerbyFrame();
		frame.setBounds(xPos, yPos, DrawStarFrame.WIDTH, DrawStarFrame.HEIGHT);
		frame.setVisible(true);
		
		frame.run();
		
		LOGGER.debug("activeCount:" + Thread.activeCount());
	}
}
