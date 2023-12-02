package com.jjbae.app.chart;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ChartFrame extends JFrame {
	private ChartPanel chartPanel = new ChartPanel();
	
	public ChartFrame() {
		init();
	}
	
	private void init() {
		this.setTitle("차트표");
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setContentPane(chartPanel);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(ChartFrame.this, "종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		});
	}
}
