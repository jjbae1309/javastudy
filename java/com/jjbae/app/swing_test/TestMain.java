package com.jjbae.app.swing_test;

import javax.swing.UIManager;

public class TestMain {
	public static void main(String[] args) {
		// default LookAndFeel --> nimbus LookAndFeel
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		TestFrame testFrame = new TestFrame();
		testFrame.setSize(1280, 720);
		testFrame.setVisible(true);
	}
}
