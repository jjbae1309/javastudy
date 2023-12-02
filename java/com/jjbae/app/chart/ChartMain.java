package com.jjbae.app.chart;

import javax.swing.UIManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChartMain {
	private static Logger LOGGER = LoggerFactory.getLogger(ChartMain.class);
		
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		ChartFrame jFrame = new ChartFrame();
		jFrame.setSize(600, 400);
		jFrame.setVisible(true);
	}
}
