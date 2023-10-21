package com.jjbae.app.homework.draw_star;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class DrawStarFrame extends JFrame {
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	
	private DrawStarPanel drawStarPanel = new DrawStarPanel();
	
	public DrawStarFrame() {
		initComponent();
		initEvent();
	}
	
	private void initComponent() {
		this.setContentPane(drawStarPanel);
		this.setTitle("별 그리기");
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