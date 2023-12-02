package com.jjbae.app.clock;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.UIManager;

public class ClockMain {
	public static void main(String[] args) {	
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		Dimension scrDim = Toolkit.getDefaultToolkit().getScreenSize();
		int xPos = (scrDim.width - ClockFrame.FRAME_WIDTH) / 2;
		int yPos = (scrDim.height - ClockFrame.FRAME_HEIGHT) / 2;
		
		ClockFrame clockFrame = new ClockFrame();
		clockFrame.setBounds(new Rectangle(xPos, yPos, ClockFrame.FRAME_WIDTH, ClockFrame.FRAME_HEIGHT));
		clockFrame.setVisible(true);
	}
}
