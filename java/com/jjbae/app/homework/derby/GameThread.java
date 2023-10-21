package com.jjbae.app.homework.derby;

import com.jjbae.app.homework.draw_star.DrawStarPanel;

public class GameThread extends Thread {
	private DrawStarPanel derbyPanel;
	
	public GameThread(DrawStarPanel panel) {
		this.derbyPanel = panel;
	}
	
	@Override
	public void run() {
		// horse 들 진행
		
		derbyPanel.repaint();
	}
}
