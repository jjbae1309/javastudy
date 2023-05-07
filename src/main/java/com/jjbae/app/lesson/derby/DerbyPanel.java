package com.jjbae.app.lesson.derby;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

public class DerbyPanel extends JPanel {
	private static Logger LOGGER = LoggerFactory.getLogger(DerbyPanel.class);
		
	private ImageIcon horseImageIcon;
		
	private Thread gameThread = null;
		
	private int horseXPos = 100;
		
	public DerbyPanel() {
		initImage();
	}
	
	private void initImage() {
		horseImageIcon = new ImageIcon("src/main/resources/image/horse1.png");
	}
	
	public void run() {
		gameThread = new Thread() {
			public void run() {
				while (horseXPos < 1000) {
					horseXPos++;
					repaint();
						
					try {
						Thread.sleep(10);
					}
					catch (Exception ex) {}
				}
			}
		};
	
		gameThread.start();
		}
		
	@Override
	public void paintComponent(Graphics g) {
		LOGGER.debug("paint!!");
			
		Graphics2D g2d = (Graphics2D)g;
			
		g2d.setColor(Color.white);
		g2d.fillRect(0, 0, getWidth(), getHeight());
	
		int[] xPos = {100, 120, 150, 120, 100, 80, 50, 80};
		int[] yPos = {50, 80, 80, 110, 150, 110, 80, 80};
		g2d.setColor(Color.black);
	
		g2d.drawImage(horseImageIcon.getImage(), horseXPos, 100, 120, 120, this);
	}
}
