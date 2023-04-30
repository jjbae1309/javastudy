package game.java.chap04;

public class ConditionTest {
	public static void main(String[] args) {
		int hour, min, sec;
		
		hour = 13;
		min = 30;
		sec = 25;
		
		String ampm;
		ampm = ( hour >= 12) ? "PM" : "AM";
		hour = ( hour >= 12) ? (hour - 12) : hour;
		
		System.out.println(ampm + " " + hour + ":" + min + ":" + sec); 
	}
}
