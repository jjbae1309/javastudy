package chap04.sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재 시각: " + time + " 시]");
		
		switch(time) {
		case 8:
			System.out.println("일어납니다");
		case 9:
			System.out.println("아침을 먹습니다");
		case 10:
			System.out.println("방학특강 숙제를 합니다");
		default:
			System.out.println("특강수업을 들읍니다");
			
		}
	}
}
