package chap07.sec02.homework;

public class LoginExample {
	public static void main(String[] args) {
		Controller controller = new Controller();
		
		controller.setService(new MemberService());
		controller.service.login(); //��� ���: __________________________________________
	
		controller.setService(new AService());
		controller.service.login(); //��� ���:___________________________________
	}
}
