package com.jjbae.address.main;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddressBookPanel extends JPanel {
	private JLabel jLabel_Name = new JLabel("이름");
	private JTextField jTextField_Name = new JTextField();
	private JLabel jLabel_Phone1 = new JLabel("전화번호1");
	private JTextField jTextField_Phone1 = new JTextField();
	private JLabel jLabel_Phone2 = new JLabel("전화번호2");
	private JTextField jTextField_Phone2 = new JTextField();
	private JLabel jLabel_Birth = new JLabel("생년월일");
	private JTextField jTextField_Birth = new JTextField();
	private JLabel jLabel_Address = new JLabel("주소");
	private JTextField jTextField_Address = new JTextField();
	private JButton jButton_Add = new JButton("생성");
	
	public AddressBookPanel() {
		initComponent();
	}
	
	private void initComponent() {
		this.setLayout(new GridBagLayout());
		jLabel_Name.setPreferredSize(new Dimension(100, 22));
	
		// 배치를 위한 설정
		// GridBagConstraints(x, y, width, height (위치, 차지하는 격자크기)
		//                   weightx, weighty, (가중치)
		//                   anchor, fill, (채우는 기준, 어떻게 채울지)
		//                   new Insets(top, left, bottom, right),
		//                   gridx, gridy)
		
		
		this.add(jLabel_Name, new GridBagConstraints(0, 0, 1, 1, 
				0.0, 0.0, 
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0));
		
		this.add(jTextField_Name, new GridBagConstraints(1, 0, 1, 1, 
				1.0, 0.0, 
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0));
		
		this.add(jLabel_Phone1, new GridBagConstraints(0, 1, 1, 1,
				0.0, 0.0, 
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0));
		this.add(jTextField_Phone1, new GridBagConstraints(1, 1, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0));
		/*
		this.add(jLabel_Phone2);
		this.add(jTextField_Phone2);
		this.add(jLabel_Birth);
		this.add(jTextField_Birth);
		this.add(jLabel_Address);
		this.add(jTextField_Address);
		this.add(jButton_Add);
		*/
	}
}
