package com.jjbae.app.text;

import javax.swing.UIManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextMain {
	private static Logger LOGGER = LoggerFactory.getLogger(TextMain.class);
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		TextFrame jFrame = new TextFrame();
		jFrame.setSize(600, 400);
		jFrame.setVisible(true);
	}
}
