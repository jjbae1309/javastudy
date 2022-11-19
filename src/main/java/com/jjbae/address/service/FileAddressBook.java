package com.jjbae.address.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jjbae.address.vo.AddressVo;

public class FileAddressBook implements AddressBookIf {
	private static Logger LOGGER = LoggerFactory.getLogger(FileAddressBook.class);
	 
	private String fileName;
	private List<AddressVo> addressList = new ArrayList<>();
	
	public FileAddressBook(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public int getNewSeqNum() {
		// addressList가 값이 있으면 
		if (addressList.size() > 0) {
			// addressList의 마지막 주소정보를 꺼낸다
			AddressVo addressVo = addressList.get(addressList.size() - 1);
			// 마지막 주소정보의 고유번호를 꺼낸다
			int seqNum = addressVo.getSeqNum();
			// 고유번호에 1 더한값을 리턴한다
			return seqNum + 1;
		}
		// addressList가 값이 없으면 1을 반환한다. 최초값은 1.
		else {
			return 1;
		}
	}
	
	@Override
	public List<AddressVo> select(AddressVo paramData) {
		// TODO Auto-generated method stub
		LOGGER.debug("+++ select");
		
		File file = new File(fileName);

/*		
		BufferedReader reader = null;
		try {
			// addressList를 비운다.
			addressList.clear();

			// 파일에서 데이터를 읽어와서, 한줄마다 AddressVo를 만든다.
			// 만든 AddressVo를 addressList에 넣는다.
			reader = new BufferedReader(new FileReader(file));
		}
		catch (IOException ioe) {
			
		}
		finally {
			try {
				reader.close();
			}
			catch (IOException ioe) {
				
			}
		}
*/
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			// addressList를 비운다.
			addressList.clear();

			// 파일에서 데이터를 읽어와서, 한줄마다 AddressVo를 만든다.
			// 만든 AddressVo를 addressList에 넣는다.
			String oneLine = null;
			while ((oneLine = reader.readLine()) != null) {
				LOGGER.debug("oneLine : " + oneLine);
				
				AddressVo oneAddress = new AddressVo();
				oneAddress.setSeqNum(getNewSeqNum());
				
				String[] words = oneLine.split(",");
				oneAddress.setName(words[0]);
				oneAddress.setPhoneNum(words[1]);
				oneAddress.setPhoneNum2(words[2]);
				oneAddress.setBirth(words[3]);
				oneAddress.setAddress(words[4]);
				
				addressList.add(oneAddress); 
			}
			
			LOGGER.debug("addressList:" + addressList);
		}
		catch (IOException ioe) {
			LOGGER.error(ioe.getMessage(), ioe);
		}
		
		LOGGER.debug("--- select");
		
		// addressList를 반환한다.
		return addressList;
	}

	private void writeFile() {
		File file = new File(fileName);
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			//for (int i = 0; i < addressList.size(); i++) {
			//	AddressVo oneAddress = addressList.get(i);
			for (AddressVo oneAddress : addressList) {
				String oneLine = oneAddress.getName() + "," +
								oneAddress.getPhoneNum() + "," +
								oneAddress.getPhoneNum2() + "," +
								oneAddress.getBirth() + ", " + 
								oneAddress.getAddress();
				
				writer.write(oneLine + "\n");
			}
		}
		catch (IOException ioe) {
			LOGGER.error(ioe.getMessage(), ioe);
		}
	}
	
	@Override
	public int insert(AddressVo paramData) {
		// TODO Auto-generated method stub
		
		// 1. addressList에 추가하고자 하는 AddressVo를 담는다.
		addressList.add(paramData);
		
		// 2. 파일에 addressList를 write한다.
		writeFile();
		
		return 0;
	}

	@Override
	public int update(AddressVo paramData) {
		// TODO Auto-generated method stub
		
		// 1.
		// addressList를 루프를 돌며, AddressVo를 하나씩 꺼낸다.
		// 하나씩 꺼낸 AddressVo의 SeqNum와 paramData의 seqNum와 동일한 걸 찾는다.
		// 해당 위치의 AddressVo를 paramData로 바꾼다.
		
		// 2. 파일에 addressList를 write한다.
		
		return 0;
	}

	@Override
	public int delete(AddressVo paramData) {
		// TODO Auto-generated method stub
		
		// 1.
		// addressList를 루프를 돌며, AddressVo를 하나씩 꺼낸다.
		// 하나씩 꺼낸 AddressVo의 SeqNum와 paramData의 seqNum와 동일한 걸 찾는다.
		// 해당 위치의 AddressVo를 삭제한다.
		
		// 2. 파일에 addressList를 write한다.
		
		return 0;
	}
	
	public static void main(String[] args) {
		FileAddressBook addressBook = new FileAddressBook("data/address.txt");
		addressBook.select(null);
	}
}
