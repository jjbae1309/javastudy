package chap04.sec01.exam04;

import java.util.HashSet;
import java.util.Set;

public class LottoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set numData = new HashSet();
		
		//for (int i = 0; i < 6; i++) {
		int i = 0;
		// 6번의 루프를 돈다.(반복을 한다.)
		while (i < 6) {
			// 1 ~ 45 사이의 값을 발생시킨다.
			int num = (int) (Math.random() * 45) + 1;
			System.out.println(num);
		
			// 집합(Set)에 값이 이미 존재하는지 확인한다.
			if (numData.contains(num)) {
				continue;
			}
			else { // 집합(Set)에 값이 존재하지 않는다면
				numData.add(num);
			}
			
			i++;
		}
		
		System.out.println(numData);
	}

}
