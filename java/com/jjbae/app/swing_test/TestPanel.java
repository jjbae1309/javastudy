package com.jjbae.app.swing_test;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

public class TestPanel extends JPanel {
	// 멤버 필드
	private RedPanel redPanel = new RedPanel();
	private BluePanel bluePanel = new BluePanel();
	private GreenPanel greenPanel = new GreenPanel();
	private YellowPanel yellowPanel = new YellowPanel();
	
	// 생성자
	public TestPanel() {
		initComponent();	
	}
	
	// 메소드
	private void initComponent() {
/* BorderLayout example
		this.setLayout(new BorderLayout());
		
		redPanel.setPreferredSize(new Dimension(100, 200));
		bluePanel.setPreferredSize(new Dimension(100, 100));
		greenPanel.setPreferredSize(new Dimension(200, 100));
//		this.setBackground(Color.red);
		this.add(redPanel, BorderLayout.CENTER);
		this.add(bluePanel, BorderLayout.SOUTH);
		this.add(greenPanel, BorderLayout.WEST);
*/
/* gridLayout
		JPanel dummyPanel1 = new JPanel();
		dummyPanel1.setBackground(Color.yellow);

		JPanel dummyPanel2 = new JPanel();
		dummyPanel2.setBackground(Color.cyan);

		JPanel dummyPanel3 = new JPanel();
		dummyPanel3.setBackground(Color.white);

		JPanel dummyPanel4 = new JPanel();
		dummyPanel4.setBackground(Color.black);

		
		this.setLayout(new GridLayout(2, 2));
		this.add(redPanel);
		this.add(bluePanel);
		this.add(greenPanel);
		this.add(dummyPanel1);
		this.add(dummyPanel2);
		this.add(dummyPanel3);
		this.add(dummyPanel4);
*/
		
		greenPanel.setPreferredSize(new Dimension(200, 300));
		greenPanel.setMinimumSize(new Dimension(200, 300));
		
		redPanel.setPreferredSize(new Dimension(500, 200));
		bluePanel.setPreferredSize(new Dimension(500, 100));
		
		yellowPanel.setPreferredSize(new Dimension(200, 100));
		yellowPanel.setMinimumSize(new Dimension(200, 100));
		
		this.setLayout(new GridBagLayout());
		
		
/*		this.add(greenPanel, new GridBagConstraints(
				0, 0, 1, 2,
				0.0, 1.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0
				));
		this.add(bluePanel, new GridBagConstraints(
				1, 0, 1, 1,
				1.0, 1.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0
				));
		this.add(redPanel, new GridBagConstraints(
				1, 1, 1, 1,
				1.0, 0.0, 
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0
				));
	
*/
		this.add(redPanel, new GridBagConstraints(
				0, 0, 1, 1,
				1.0, 1.0, 
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0,0
				));
		this.add(bluePanel, new GridBagConstraints(
				1, 0, 1, 1,
				1.0, 1.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0,0
				));
		this.add(greenPanel, new GridBagConstraints(
				0, 1, 2, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0,0));
		this.add(yellowPanel, new GridBagConstraints(
				2, 0, 1, 2,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0,0
				));
	}
}
