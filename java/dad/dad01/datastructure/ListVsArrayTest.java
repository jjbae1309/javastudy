package dad01.datastructure;

import java.util.ArrayList;
import java.util.List;

public class ListVsArrayTest {
	public static void main(String[] args) {
		try {
			int[] a = new int[5];
			a[0] = 10;
			a[1] = 20;
			a[2] = 30;
			a[3] = 40;
			a[4] = 50;
			a[5] = 60;
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("a[" + i + "]:" + a[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("범위를 넘어섰습니다.");
		}
		
		
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println("l[" + i + "]:" + l.get(i));

		}
	}
}
