package com.jjbae.app.lesson.derby;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class DerbyFrame extends JFrame {
	
	private DerbyPanel derbyPanel = new DerbyPanel();
	
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
