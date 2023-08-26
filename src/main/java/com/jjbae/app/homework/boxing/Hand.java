package com.jjbae.app.homework.boxing;

public enum Hand {
	LEFT,
	RIGHT;
	
	public static Hand getHand(String handStr) {
		if (handStr.equalsIgnoreCase("RIGHT")) 
			return RIGHT;
		else if (handStr.equalsIgnoreCase("LEFT"))
			return LEFT;
		else
			return null;
	}
}
