package com.jjbae.app.address.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jjbae.app.address.vo.AddressVo;

public class DBAddressBook implements AddressBookIf {
	private static Logger LOGGER = LoggerFactory.getLogger(DBAddressBook.class);
	
	private String driverName;
	private String url;
	private String user;
	private String password;
	
	private Connection conn; 
	
	public DBAddressBook(String driverName, String url, String user, String password) {
		try {
			this.driverName = driverName;
			this.url = url;
			this.user = user;
			this.password = password;
			
			initConnection();
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
		}
	}
	
	private void initConnection() throws Exception {
		Class.forName(driverName);
		//new org.mariadb.jdbc.Driver();
		
		conn = DriverManager.getConnection(url, user, password);
	}
	
	
	@Override
	public int getNewSeqNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AddressVo> select(AddressVo paramData) {
		// TODO Auto-generated method stub
		List<AddressVo> result = new ArrayList<>();
		
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			
			String sql = "select * from address_book";
			
			ResultSet resultSet = stmt.executeQuery(sql);
			while (resultSet.next()) {
				//String seqNum = resultSet.getString(1);
				int seqNum 			= resultSet.getInt("SEQ_NUM");
				String name 		= resultSet.getString("NAME");
				String phoneNumber 	= resultSet.getString("PHONE_NUMBER");
				String phoneNumber2 = resultSet.getString("PHONE_NUMBER2");
				String birth 		= resultSet.getString("BIRTH");
				String address 		= resultSet.getString("ADDRESS");
				
				LOGGER.debug(String.format("seqNum:%s, name:%s, phoneNumber:%s,"
						 + " phoneNumber2:%s, birth:%s, address:%s", 
						 seqNum, name, phoneNumber, phoneNumber2, birth, address ));
				
				AddressVo addressVo = new AddressVo();
				addressVo.setSeqNum(seqNum);
				addressVo.setName(name);
				addressVo.setPhoneNum(phoneNumber);
				addressVo.setPhoneNum2(phoneNumber2);
				addressVo.setBirth(birth);
				addressVo.setAddress(address);
				
				result.add(addressVo);
			}
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
		}
		
		return result;
	}

	@Override
	public int insert(AddressVo paramData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(AddressVo paramData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(AddressVo paramData) {
		// TODO Auto-generated method stub
		return 0;
	}

}
