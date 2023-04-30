package com.jjbae.app.homework.derby;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class DerbyFrame extends JFrame {
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	
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
		// Frame의 윈도우 관련 이벤트 등록
		this.addWindowListener(new WindowAdapter() {
			// Frame의 닫을 때 이벤트 처리 재정의
			@Override
			public void windowClosing(WindowEvent e) {
				// 프로세스 종료
				System.exit(0);
			}
		});
	}
}