package com.jjbae.app.swing_test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NaverPanel extends JPanel {
	private JTextField jTextField_SearchWord = new JTextField();
	private JPanel jPanel_Buttons = new JPanel();
	
	private JButton jButton_Mail = new JButton();
	private JButton jButton_Cafe = new JButton();
	private JButton jButton_Blog = new JButton();
	
	public NaverPanel() {
		initComponent();
	}
	
	private void initComponent() {
		this.setLayout(new GridBagLayout());
		jPanel_Buttons.setLayout(new GridBagLayout());
		
		this.setBackground(Color.white);
		jPanel_Buttons.setBackground(Color.white);
		
		jTextField_SearchWord.setPreferredSize(new Dimension(100, 50));
		
		jButton_Mail.setPreferredSize(new Dimension(50, 50));
		jButton_Cafe.setPreferredSize(new Dimension(50, 50));
		jButton_Blog.setPreferredSize(new Dimension(50, 50));
		
		jButton_Mail.setIcon(new ImageIcon("data/images/mail.png"));
		
		this.add(jTextField_SearchWord, new GridBagConstraints(
			0, 0, 1, 1,
			1.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 100, 0, 100),
			0, 0
		));
		
		this.add(jPanel_Buttons, new GridBagConstraints(
				0, 1, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 100, 0, 100),
				0, 0
			));
		
		jPanel_Buttons.add(jButton_Mail, new GridBagConstraints(
				0, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(10, 10, 10, 10),
				0, 0
			));
		
		jPanel_Buttons.add(jButton_Cafe, new GridBagConstraints(
				1, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(10, 10, 10, 10),
				0, 0
			));
		
		jPanel_Buttons.add(jButton_Blog, new GridBagConstraints(
				2, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(10, 10, 10, 10),
				0, 0
			));
	}
}
