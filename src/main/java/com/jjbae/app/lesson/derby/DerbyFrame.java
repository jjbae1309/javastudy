package com.jjbae.app.lesson.derby;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import com.jjbae.app.homework.draw_star.DrawStarPanel;

public class DerbyFrame extends JFrame {
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	
	private DrawStarPanel derbyPanel = new DrawStarPanel();
	
	public DerbyFrame() {
		initComponent();
		initEvent();
	}
	
	public void run() {
		derbyPanel.run();
	}
	
	private void initComponent() {
		this.setContentPane(derbyPanel);
	}
	
	private void initEvent() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});	
	}
}
