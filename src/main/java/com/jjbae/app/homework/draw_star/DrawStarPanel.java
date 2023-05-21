package com.jjbae.app.homework.draw_star;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DrawStarPanel extends JPanel {
	private static Logger LOGGER = LoggerFactory.getLogger(DrawStarPanel.class);
	
	@Override
	public void paintComponent(Graphics g) {
		LOGGER.debug("paint!!");
		
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.white);
		g2d.fillRect(0, 0, getWidth(), getHeight());
		
		int[] xPos = {210, 175, 60, 150, 110, 210, 310, 270, 360, 245, 210};
		int[] yPos = {60, 160, 160, 225, 340, 270, 340, 225, 160, 160, 60};
		g2d.setColor(Color.black);
		g2d.drawPolygon(xPos, yPos, 11);

	}
}
