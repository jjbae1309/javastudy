package com.jjbae.app.lesson.derby;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DerbyPanel extends JPanel {
	private static Logger LOGGER = (LoggerFactory.getLogger(DerbyPanel.class));
	
	private ImageIcon[] horseImageIcon;
	
	private int horseXPos = 100;
	private int horse2XPos = 100;
	private int horse3XPos = 100;
	private int horse4XPos = 100;
	
	private int horseYPos = 100;
	private int horse2YPos = 200;
	private int horse3YPos = 300;
	private int horse4YPos = 400;
	
	private int horseFrameNum;
	private int currentHorseFrame;
	
	public DerbyPanel() {
		initImage();
	}
	
	private void initImage() {
		horseImageIcon = new ImageIcon[12];
		for (int i = 0; i < horseImageIcon.length; i++) {
			horseImageIcon[i] = new ImageIcon("src/main/resources/image/horse/horse" + (i + 1) + ".png");
		}
		
		horseFrameNum = horseImageIcon.length;
	}
	
	 public void run() {
		 while (horseXPos < 1000) {
			 horseXPos += (int)(Math.random() * 10 + 1);
			 horse2XPos += (int)(Math.random() * 11 + 1);
			 horse3XPos += (int)(Math.random() * 12 + 1);
			 horse4XPos += (int)(Math.random() * 13 + 1);
			 
			 currentHorseFrame++;
			 if (currentHorseFrame >= horseFrameNum) {
				 currentHorseFrame = 0;
			 }
			 
			 repaint();
			 
			 try {
				 Thread.sleep(50);
			 }
			 catch (Exception ex) {}
		 }
	}
	@Override
	public void paintComponent(Graphics g) {
		LOGGER.debug("paint!!");
		
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.white);
		g2d.fillRect(0, 0, getWidth(), getHeight());
		
		g2d.drawImage(horseImageIcon[currentHorseFrame].getImage(), horseXPos, horseYPos, 120, 120, this);
		g2d.setFont(new Font("Dialog", Font.BOLD, 16));
		g2d.drawString("Robin", horseXPos + 30, horseYPos);
		
		g2d.drawImage(horseImageIcon[currentHorseFrame].getImage(), horse2XPos, horse2YPos, 120, 120, this);	
		g2d.drawImage(horseImageIcon[currentHorseFrame].getImage(), horse3XPos, horse3YPos, 120, 120, this);
		g2d.drawImage(horseImageIcon[currentHorseFrame].getImage(), horse4XPos, horse4YPos, 120, 120, this);
	}
}
