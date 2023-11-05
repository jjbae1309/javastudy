package com.jjbae.app.address_book;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddressBookPanel extends JPanel {
	// 필드
	private JPanel jPanel_Input = new JPanel();
	private JPanel jPanel_Command = new JPanel();
	private JPanel jPanel_Result = new JPanel();
	
	private JLabel jLabel_Name = new JLabel("이름");
	private JTextField jTextField_Name = new JTextField();
	private JLabel jLabel_Phone = new JLabel("전화번호");
	private JTextField jTextField_Phone = new JTextField();
	private JLabel jLabel_Address = new JLabel("주소");
	private JTextField jTextField_Address = new JTextField();
	
	private JButton jButton_Add = new JButton("추가");
	private JButton jButton_Change = new JButton("수정");
	private JButton jButton_Delete = new JButton("삭제");
	
	private JScrollPane jScrollPane_Result = new JScrollPane();
	
	private JTable jTable_Result = new JTable();
	private DefaultTableModel tableModel = new DefaultTableModel();
	
	private GridBagLayout gridBagLayout = new GridBagLayout();
	
	// 생성자
	public AddressBookPanel() {
		// 레이아웃을 설정한다.
		initLayout();
		// 기본 사이즈를 설정한다.
		initPreferredSize();
		// 컴포넌트 배치를 설정한다.
		initComponent();
		// 테이블 관련 설정한다.
		initTable();
		// 이벤트 관련 설정한다.
		initEvent();
		// 테스트
//		initTestData();
		
	}
	
	/**
	 * 레이아웃을 GridBagLayout으로 설정한다.
	 */
	private void initLayout() {
		this.setLayout(gridBagLayout);
		jPanel_Input.setLayout(gridBagLayout);
		jPanel_Command.setLayout(gridBagLayout);
		jPanel_Result.setLayout(gridBagLayout);
	}
		
	/**
	 * 기본 사이즈를 설정한다.
	 */
	private void initPreferredSize() {
		jLabel_Name.setPreferredSize(new Dimension(100, 22));
		jLabel_Phone.setPreferredSize(new Dimension(100, 22));
		jLabel_Address.setPreferredSize(new Dimension(100, 22));
		
		jTextField_Name.setPreferredSize(new Dimension(100, 22));
		jTextField_Phone.setPreferredSize(new Dimension(100, 22));
		jTextField_Address.setPreferredSize(new Dimension(100, 22));

		jButton_Add.setPreferredSize(new Dimension(120, 22));
		jButton_Change.setPreferredSize(new Dimension(120, 22));
		jButton_Delete.setPreferredSize(new Dimension(120, 22));
	}
	
	// 메소드
	private void initComponent() {
		jLabel_Name.setFont(new Font("DialogInput", getFont().BOLD, 20));
		jLabel_Name.setForeground(Color.red);
		
		this.add(jPanel_Input, new GridBagConstraints(
				0, 0, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
		this.add(jPanel_Command, new GridBagConstraints(
				0, 1, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
		this.add(jPanel_Result, new GridBagConstraints(
				0, 2, 1, 1,
				1.0, 1.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
		jPanel_Input.add(jLabel_Name, new GridBagConstraints(
				0, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0));
		
		jPanel_Input.add(jTextField_Name, new GridBagConstraints(
				1, 0, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 0, 5, 5),
				0, 0));
		
		jPanel_Input.add(jLabel_Phone, new GridBagConstraints(
				0, 1, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 5, 5, 5),
				0, 0));
		
		jPanel_Input.add(jTextField_Phone, new GridBagConstraints(
				1, 1, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5),
				0, 0));
		
		jPanel_Input.add(jLabel_Address, new GridBagConstraints(
				0, 2, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 5, 5, 5),
				0, 0));
		
		jPanel_Input.add(jTextField_Address, new GridBagConstraints(
				1, 2, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5),
				0, 0));
	
		jPanel_Command.add(jButton_Add, new GridBagConstraints(
				0, 0, 1, 1,
				1.0, 0.0,
				GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
				new Insets(0, 5, 5, 5),
				0, 0));
		jPanel_Command.add(jButton_Change, new GridBagConstraints(
				1, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5),
				0, 0));
		jPanel_Command.add(jButton_Delete, new GridBagConstraints(
				2, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5),
				0, 0));
/*
		jPanel_Command.add(jButton_Add, new GridBagConstraints(
				0, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 5, 5, 5),
				0, 0));
		jPanel_Command.add(jButton_Change, new GridBagConstraints(
				1, 0, 1, 1,
				1.0, 0.0,
				GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
				new Insets(0, 0, 5, 5),
				0, 0));
		jPanel_Command.add(jButton_Delete, new GridBagConstraints(
				2, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5),
				0, 0));
*/				
		
		jPanel_Result.add(jScrollPane_Result, new GridBagConstraints(
				0, 0, 1, 1,
				1.0, 1.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
		jScrollPane_Result.getViewport().add(jTable_Result);
	}
	
	private void initTable() {
		Vector<String> columns = new Vector<>();
		columns.add("번호");
		columns.add("이름");
		columns.add("전화번호");
		columns.add("주소");
		
		tableModel.setColumnIdentifiers(columns);
		
		/*
		String[] columns = { "번호", "이름", "전화번호", "주소" };
		tableModel.setColumnIdentifiers(columns);
		*/
		
		jTable_Result.setModel(tableModel);
	}
	
	private void initEvent() {
		jButton_Add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(AddressBookPanel.this, "추가 버튼을 눌렀습니다.");
			}
		});
		
		jButton_Change.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(AddressBookPanel.this, "수정 버튼을 눌렀습니다.");
			}
		});
		
		jButton_Delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(AddressBookPanel.this, "삭제 버튼을 눌렀습니다.");
			}
		});
	}
	
	private void initTestData() {
		for (int i = 0; i < 100; i++) {
			Object[] oneData = { "1", "홍길동", "010-0000-0000", "서울" };

			tableModel.addRow(oneData);
		}
	}
}
