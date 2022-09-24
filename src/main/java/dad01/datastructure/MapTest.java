package dad01.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		/*
		Map<Integer, Integer> m = new HashMap<>();
		
		m.put(1, 10);
		m.put(2, 20);
		m.put(3, 30);
		m.put(1, 100);
		m.put(5, 50);
		m.put(4, 40);
		
		Set<Integer> keySet = m.keySet();
		Iterator<Integer> iter = keySet.iterator();
		while (iter.hasNext()) {
			int key = iter.next();
			
			System.out.println("m[" + key + "]:" + m.get(key));
		}
		*/
		
		Map<String, Integer> m = new HashMap<>();
		
		m.put("아이스아메리카노", 5000);
		m.put("화이트초코릿", 5500);
		m.put("포도쥬스", 6000);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String menu = null;
		try {
			while ((menu = br.readLine()) != null) {
				if (m.containsKey(menu)) {
					System.out.println(menu + "은 " + m.get(menu) + "입니다.");
				}
				else {
					System.out.println(menu + "는 존재하지 않는 메뉴입니다");
				}
			}
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
