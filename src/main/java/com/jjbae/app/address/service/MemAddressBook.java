package com.jjbae.app.address.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jjbae.app.address.vo.AddressVo;

public class MemAddressBook implements AddressBookIf {
	private static Logger LOGGER = LoggerFactory.getLogger(MemAddressBook.class);
	
	private List<AddressVo> addressList = new ArrayList<>();
	
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
		return addressList;
	}

	@Override
	public int insert(AddressVo paramData) {
		// TODO Auto-generated method stub
		LOGGER.info("paramData:" + paramData);
		
		addressList.add(paramData);
		return 1;
	}

	@Override
	public int update(AddressVo paramData) {
		// TODO Auto-generated method stub
		
		// paramData 들어온 addressVo의 seqNum을 꺼낸다
		int paramSeq = paramData.getSeqNum();
		
		/*
		for (AddressVo oneAddress : addressList) {
			int oneSeq = oneAddress.getSeqNum();
		
			if (oneSeq == paramSeq) {
				addressList.set(oneSeq, paramData)
			}
		}
		*/
		
		// addresesList에 루프를 돈다
		for (int i = 0; i < addressList.size(); i++) {
			// addressVo를 하나씩 꺼낸다.
			AddressVo oneAddress = addressList.get(i);
			// oneAddress의 seqNum을 꺼낸다
			int oneSeq = oneAddress.getSeqNum();
			// paramSeq와 oneSeq가 같은지 비교
			if (oneSeq == paramSeq) {
				// addressList의 i번째 정보를 paramData로 변경
				addressList.set(i, paramData);
			}
		}
		
		return 1;
	}

	@Override
	public int delete(AddressVo paramData) {
		// TODO Auto-generated method stub
		int paramSeq = paramData.getSeqNum();
		
		int deleteIndex = -1;
		for (int i = 0; i < addressList.size(); i++) {
			AddressVo oneAddress = addressList.get(i);
			int oneSeq = oneAddress.getSeqNum();
			if (paramSeq == oneSeq) {
				deleteIndex = i;
				break;
			}
		}
		
		if (deleteIndex >= 0) {
			addressList.remove(deleteIndex);
		}
		
		return 0;
	}
	
	public void debugData() {
		for (int i = 0; i < addressList.size(); i++) {
			LOGGER.debug(addressList.get(i).toString());
		}
	}
}
