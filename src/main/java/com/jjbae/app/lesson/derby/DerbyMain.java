package com.jjbae.app.lesson.derby;

import java.awt.Dimension;
import java.awt.Toolkit;

public class DerbyMain {
	public static void main(String[] args) {
		Dimension scrDim = Toolkit.getDefaultToolkit().getScreenSize();
		
		int xPos = (scrDim.width - DerbyFrame.WIDTH) / 2;
		int yPos = (scrDim.height - DerbyFrame.HEIGHT) / 2;
		
		DerbyFrame frame = new DerbyFrame();
		frame.setBounds(xPos, yPos, DerbyFrame.WIDTH, DerbyFrame.HEIGHT);
		frame.setVisible(true);
		
		frame.run();
	}
}
