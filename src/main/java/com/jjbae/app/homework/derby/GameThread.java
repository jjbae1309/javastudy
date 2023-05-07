package com.jjbae.app.homework.derby;

public class GameThread extends Thread {
	private DerbyPanel derbyPanel;
	
	public GameThread(DerbyPanel panel) {
		this.derbyPanel = panel;
	}
	
	@Override
	public void run() {
		// horse 들 진행
		
		derbyPanel.repaint();
	}
}
