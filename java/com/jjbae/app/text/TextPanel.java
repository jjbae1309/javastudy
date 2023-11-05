package com.jjbae.app.text;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TextPanel extends JPanel {
	private static Logger LOGGER = LoggerFactory.getLogger(TextPanel.class);
	
	private JPanel jPanel_ChatPanel = new JPanel();
	private JPanel jPanel_Input = new JPanel();
	
	private JTextField jTextField_Chat = new JTextField();
	
	private JScrollPane jScrollPane_Text = new JScrollPane();
	
	private JTextArea jTextArea_Text = new JTextArea();
	
	private JComboBox jComboBox_Chat = new JComboBox();
	
	private JButton jButton_Chat = new JButton("전송");
	
	private DefaultTableModel tableModel = new DefaultTableModel();

	private GridBagLayout gridBagLayout = new GridBagLayout();
	
	public TextPanel() {
		initLayout();
		initPrefferedSize();
		initComponent();
		initEvent();
	}
	
	
	private void initLayout() {
		this.setLayout(gridBagLayout);
		jPanel_ChatPanel.setLayout(gridBagLayout);
		jPanel_Input.setLayout(gridBagLayout);
	}
	
	private void initPrefferedSize() {
		jComboBox_Chat.setPreferredSize(new Dimension(120, 30));
		jComboBox_Chat.setMinimumSize(new Dimension(120, 30));
		
		//jTextArea_Text.setPreferredSize(new Dimension(120, 22));
		jTextField_Chat.setPreferredSize(new Dimension(120, 30));
		jButton_Chat.setPreferredSize(new Dimension(120, 30));
	}
	
	private void initComponent() {	
		jTextArea_Text.setEditable(false);
		
		this.add(jPanel_ChatPanel, new GridBagConstraints(
				0, 0, 1, 1,
				1.0, 1.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
		this.add(jPanel_Input, new GridBagConstraints(
				0, 1, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
		jPanel_ChatPanel.add(jTextArea_Text, new GridBagConstraints(
				0, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
		jPanel_Input.add(jComboBox_Chat, new GridBagConstraints(
				0, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 5, 5, 5),
				0, 0));
		
		jPanel_Input.add(jTextField_Chat, new GridBagConstraints(
				1, 0, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5),
				0, 0));
		
		jPanel_Input.add(jButton_Chat, new GridBagConstraints(
				2, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5),
				0, 0));
		
		jPanel_ChatPanel.add(jScrollPane_Text, new GridBagConstraints(
				0, 0, 1, 1,
				1.0, 1.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0));
		
		jScrollPane_Text.getViewport().add(jTextArea_Text);
	}
	
	private void initEvent() {
		jButton_Chat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleInputMessage();
			}
		});
		
		jTextField_Chat.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					LOGGER.debug("KeyCode:" + e.getKeyCode());	
					handleInputMessage();
				}
			}
		});
	}
	
	private void handleInputMessage() {
		String msg = jTextField_Chat.getText();
		
		// 입력된 문자열이 존재하는지 확인한다.
		if (msg.length() > 0) {
			// 뉴라인을 붙여 입력내용을 출력한다.
			jTextArea_Text.append("[재준] :" + msg + "\n");
			
			// textField의 입력된 내용을 비운다.
			jTextField_Chat.setText("");
		}
	}
}
