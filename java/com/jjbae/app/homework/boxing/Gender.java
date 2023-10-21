package com.jjbae.app.homework.boxing;

public enum Gender {
	MALE,
	FEMALE;
	
	public static Gender getGender(String genderStr) {
		if (genderStr.equalsIgnoreCase("MALE")) 
			return MALE;
		else if (genderStr.equalsIgnoreCase("FEMALE"))
			return FEMALE;
		else
			return null;
	}
}
