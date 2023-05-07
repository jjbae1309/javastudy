package com.jjbae.app.lesson.derby;

import java.awt.Dimension;
import java.awt.Toolkit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jjbae.app.homework.derby.DerbyFrame;

public class DerbyMain {
	private static Logger LOGGER = LoggerFactory.getLogger(DerbyMain.class);
	
	public static void main(String[] args) {
		LOGGER.debug("main start");
		
//		DerbyGame derbyGame = new DerbyGame();
//		derbyGame.run();
		
		Dimension scrDim = Toolkit.getDefaultToolkit().getScreenSize();
				
		int xPos = (scrDim.width - DerbyFrame.WIDTH) / 2;
		int yPos = (scrDim.height - DerbyFrame.HEIGHT) / 2;
				
		DerbyFrame frame = new DerbyFrame();
		frame.setBounds(xPos, yPos, DerbyFrame.WIDTH, DerbyFrame.HEIGHT);
		frame.setVisible(true);
		
		frame.run();
		
		LOGGER.debug("activeCount:" + Thread.activeCount());
	}
}
