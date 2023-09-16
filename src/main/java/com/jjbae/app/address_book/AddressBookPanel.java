package com.jjbae.app.address_book;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddressBookPanel extends JPanel {
	// 필드
	private JLabel jLabel_Name = new JLabel("이름");
	private JTextField jTextField_Name = new JTextField();
	private JLabel jLabel_Address = new JLabel("주소");
	private JTextField jTextField_Address = new JTextField();
	// 생성자
	public AddressBookPanel() {
		init();
	}
	
	// 메소드
	private void init() {
		this.setLayout(new GridBagLayout());
		
		// 크기를 지정
		jLabel_Name.setPreferredSize(new Dimension(80, 22));
		jTextField_Name.setPreferredSize(new Dimension(120, 22));
		jLabel_Address.setPreferredSize(new Dimension(80, 22));
		jTextField_Address.setPreferredSize(new Dimension(120, 22));

		this.add(jLabel_Name, new GridBagConstraints(
				0, 0, 1, 1,
				0.0, 1.0, 
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0
				));
		this.add(jTextField_Name, new GridBagConstraints(
				1, 0, 1, 1,
				1.0, 1.0, 
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0
				));
		this.add(jLabel_Address, new GridBagConstraints(
				0, 1, 1, 1,
				0.0, 1.0, 
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0
				));
		this.add(jTextField_Address, new GridBagConstraints(
				1, 1, 1, 1,
				1.0, 1.0, 
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0
				));
	}
}
