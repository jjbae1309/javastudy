package chap04.sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[���� �ð�: " + time + " ��]");
		
		switch(time) {
		case 8:
			System.out.println("�Ͼ�ϴ�");
		case 9:
			System.out.println("��ħ�� �Խ��ϴ�");
		case 10:
			System.out.println("����Ư�� ������ �մϴ�");
		default:
			System.out.println("Ư�������� �����ϴ�");
			
		}
	}
}