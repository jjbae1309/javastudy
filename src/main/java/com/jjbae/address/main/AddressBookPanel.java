package com.jjbae.address.main;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jjbae.address.service.AddressBookIf;
import com.jjbae.address.service.DBAddressBook;
import com.jjbae.address.vo.AddressVo;

public class AddressBookPanel extends JPanel {
	private static Logger LOGGER = LoggerFactory.getLogger(AddressBookPanel.class);
	
	//private AddressBookIf addressBook = new MemAddressBook();
	//private AddressBookIf addressBook = new FileAddressBook("data/address.txt");
	private AddressBookIf addressBook = new DBAddressBook("org.mariadb.jdbc.Driver",
			"jdbc:mariadb://localhost:3306/jjbae", "root", "qowowns1!");
	
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
	
	private JScrollPane jScrollPane_Address = new JScrollPane();
	private JTable jTable_Address = new JTable();
	
	private DefaultTableModel tableModel = new DefaultTableModel();
	
	private Vector<String> columnIdentifiers = new Vector();
	private Vector dataVector = new Vector();
	
	public AddressBookPanel() {
		initComponent();
		initTable();
		initEvent();
		
		//initData();
		reloadTable();
	}
	
	/**
	 * UI 컴포넌트 설정 및 배치
	 */
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
		
		this.add(jLabel_Phone2, new GridBagConstraints(0, 2, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0));
		
		this.add(jTextField_Phone2, new GridBagConstraints(1, 2, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, 
				new Insets(5, 5, 5, 5),
				0, 0));
		
		this.add(jLabel_Birth, new GridBagConstraints(0, 3, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER,  GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0));
		
		this.add(jTextField_Birth, new GridBagConstraints(1, 3, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0));

		this.add(jLabel_Address, new GridBagConstraints(0, 4, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0));
		this.add(jTextField_Address, new GridBagConstraints(1, 4, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0));
		this.add(jButton_Add, new GridBagConstraints(1, 5, 1, 1,
				0.0, 0.0,
				GridBagConstraints.EAST, GridBagConstraints.NONE,
				new Insets(5, 5, 5, 5),
				0, 0));
		this.add(jScrollPane_Address, new GridBagConstraints(0, 6, 2, 1,
				1.0, 1.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0));
		
		jScrollPane_Address.getViewport().add(jTable_Address);
	}
	
	/**
	 * 테이블에 대한 설정
	 */
	private void initTable() {
//		Vector<String> columnData = new Vector();
//		columnData.add("번호");
//		columnData.add("이름");
//		columnData.add("전화번호");
//		
//		tableModel.setColumnIdentifiers(columnData);
		
		columnIdentifiers.add("번호");
		columnIdentifiers.add("이름");
		columnIdentifiers.add("전화번호");
		columnIdentifiers.add("주소");	
		
		jTable_Address.setModel(tableModel);
	}
	
	/**
	 * 이벤트 처리를 정의
	 */
	private void initEvent() {
		jButton_Add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LOGGER.debug("버튼 클릭");
				
				String name = jTextField_Name.getText();
				String phone1 = jTextField_Phone1.getText();
				String phone2 = jTextField_Phone2.getText();
				String birth = jTextField_Birth.getText();
				String address = jTextField_Address.getText();
				
				AddressVo addressVo = new AddressVo();
				addressVo.setSeqNum(addressBook.getNewSeqNum());
				addressVo.setName(name);
				addressVo.setPhoneNum(phone1);
				addressVo.setPhoneNum2(phone2);
				addressVo.setBirth(birth);
				addressVo.setAddress(address);
				
				addressBook.insert(addressVo);
				
				//addressBook.debugData();
				
				reloadTable();
			}
		});
	}
	
	/**
	 * MemAddressBook에서 address 정보를 불러와 루프를 돌면서
	 * oneDataVector에 생성&add 후, 다시 dataVector에 add한다.
	 */
	private void reloadTable() {
		dataVector.clear();
		
		List<AddressVo> addressList = addressBook.select(null);
		for (AddressVo oneAddress : addressList) {
			Vector oneDataVector = new Vector();
			oneDataVector.add(oneAddress.getSeqNum());
			oneDataVector.add(oneAddress.getName());
			oneDataVector.add(oneAddress.getPhoneNum());
			oneDataVector.add(oneAddress.getAddress());
			
			dataVector.add(oneDataVector);
		}
		
		tableModel.setDataVector(dataVector, columnIdentifiers);
		
//		Vector oneDataVector = new Vector();
//		oneDataVector.add("1");
//		oneDataVector.add("배재준");
//		oneDataVector.add("010-0000-0000");
//		
//		dataVector.add(oneDataVector);	
//		
//		oneDataVector = new Vector();
//		oneDataVector.add("2");
//		oneDataVector.add("배재율");
//		oneDataVector.add("010-0000-0000");
//		
//		dataVector.add(oneDataVector);
//		
//		
//		tableModel.setDataVector(dataVector, columnIdentifiers);
	}
}
