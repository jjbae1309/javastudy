package chap04.sec01.exam04;

import java.util.HashSet;
import java.util.Set;

public class LottoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set numData = new HashSet();
		
		//for (int i = 0; i < 6; i++) {
		int i = 0;
		// 6���� ������ ����.(�ݺ��� �Ѵ�.)
		while (i < 6) {
			// 1 ~ 45 ������ ���� �߻���Ų��.
			int num = (int) (Math.random() * 45) + 1;
			System.out.println(num);
		
			// ����(Set)�� ���� �̹� �����ϴ��� Ȯ���Ѵ�.
			if (numData.contains(num)) {
				continue;
			}
			else { // ����(Set)�� ���� �������� �ʴ´ٸ�
				numData.add(num);
			}
			
			i++;
		}
		
		System.out.println(numData);
	}

}
