package com.jjbae.app.swing_test;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

public class TestPanel2 extends JPanel {
	// 필드
	private RedPanel redPanel = new RedPanel();
	private BluePanel bluePanel = new BluePanel();
	private GreenPanel greenPanel = new GreenPanel();
	private YellowPanel yellowPanel = new YellowPanel();
	
	// 생성자
	public TestPanel2() {
		initComponent();
	}
	
	// 메소드
	private void initComponent() {
		this.setLayout(new GridBagLayout());
		
		bluePanel.setPreferredSize(new Dimension(100, 200));
		greenPanel.setPreferredSize(new Dimension(100, 200));
		yellowPanel.setPreferredSize(new Dimension(200, 100));
		
		this.add(bluePanel, new GridBagConstraints(
				0, 0, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
		this.add(redPanel, new GridBagConstraints(
				0, 1, 1, 1,
				1.0, 1.0, 
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
		this.add(greenPanel, new GridBagConstraints(
				0, 2, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
		this.add(yellowPanel, new GridBagConstraints(
				1, 0, 1, 3,
				0.0, 1.0, 
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0)); 
		
		
	}
}
