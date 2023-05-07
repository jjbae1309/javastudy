package com.jjbae.app.homework.derby;

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
	
	//private Thread gameThread = null;
//	private GameThread gameThread = null;
	
	private int horseXPos = 100;
	private int horse2XPos = 100;
	private int horse3XPos = 100;
	private int horse4XPos = 100;
	
	private int horseYPos = 100;
	private int horse2YPos = 200;
	private int horse3YPos = 300;
	private int horse4YPos = 400;
	
	public DerbyPanel() {
		initImage();
	}
	
	// 이미지 초기화
	private void initImage() {
		//horseImageIcon = new ImageIcon("image/horse1.png");
		horseImageIcon = new ImageIcon("src/main/resources/image/horse1.png");
	}
	
	public void run() {
		while (horseXPos < 1000) {
			horseXPos += (int)(Math.random() * 10 + 1);
			horse2XPos += (int)(Math.random() * 11 + 1);
			horse3XPos += (int)(Math.random() * 12 + 1);
			horse4XPos += (int)(Math.random() * 13 + 1);

			
			repaint();
			
			try {
				Thread.sleep(10);
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
		
//		g2d.setColor(Color.blue);
//		g2d.drawRect(100, 100, 100, 100);
//		g2d.setColor(Color.red);
//		g2d.setStroke(new BasicStroke(2.0f));
//		g2d.drawRect(200, 200, 100, 100);
//		g2d.setColor(Color.green);
//		g2d.drawOval(300, 300, 100, 100);
//
//		int xPos[] = {100, 200, 300, 250, 150};
//		int yPos[] = {100, 50, 100, 200, 200};
//		
//		g2d.setColor(Color.black);
//		g2d.drawPolygon(xPos, yPos, 5);
//		
//		g2d.setFont(new Font("배달의민족 주아", Font.BOLD, 50));
//		g2d.drawString("Over the horizon", 100, 200);
		
//		int[] xPos = {100, 120, 150, 120, 100, 80, 50, 80};
//		int[] yPos = {50, 80, 80, 110, 150, 110, 80, 80};
//		int[] xPos = {100, 120, 150, 120, 100, 80, 50, 80};
//		int[] yPos = {50, 80, 80, 110, 150, 110, 80, 80};
//		g2d.setColor(Color.black);
//		g2d.drawPolygon(xPos, yPos, 8);
		
		g2d.drawImage(horseImageIcon.getImage(), horseXPos, horseYPos, 120, 120, this);
		g2d.drawImage(horseImageIcon.getImage(), horse2XPos, horse2YPos, 120, 120, this);
		g2d.drawImage(horseImageIcon.getImage(), horse3XPos, horse3YPos, 120, 120, this);
		g2d.drawImage(horseImageIcon.getImage(), horse4XPos, horse4YPos, 120, 120, this);
	}
}
