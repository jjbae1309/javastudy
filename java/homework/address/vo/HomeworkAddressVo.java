package homework.address.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class HomeworkAddressVo{
	/**
	 * 고유번호
	 */
	private int seqNum;
	
	/**
	 * 이름
	 */
	private String name;
	
	/**
	 * 전화번호1
	 */
	private String phoneNum;
	
	/**
	 * 전화번호2
	 */
	private String phoneNum2;
	
	/**
	 * 생년월일
	 */
	private String birth;
	
	/**
	 * 주소
	 */
	private String address;
	
	public int getSeqNum() {
		return seqNum;
		}
		
	public void setSeqNum(int seqNum) {
			this.seqNum = seqNum;
		}

	public String getName() {
			return name;
		}
		
	public void setName(String name) {
			this.name = name;
		}
		
	public String getPhoneNum() {
			return phoneNum;
		}
		
	public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}
		
	public String getPhoneNum2() {
			return phoneNum2;
		}

	public void setPhoneNum2(String phoneNum2) {
			this.phoneNum2 = phoneNum2;
		}

	public String getBirth() {
			return birth;
		}
		
	public void setBirth(String birth) {
			this.birth = birth;
		}
		
	public String getAddress() {
			return address;
		}
		
	public void setAddress(String address) {
			this.address = address;
		}
		
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
			
		
	}
}
