package chap04.sec02.exam10;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { //2�� ���� �������� 0�� �ƴҰ��, �� Ȧ���� ���
				continue;
			}
			
			System.out.println(i);
		}
	}
}
