package dad01.datastructure03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LandRankExample {
	public static void main(String[] args) {
		List<Land> landList = new ArrayList<>();
		
		Land land = new Land("홍길동", 10, 8);
		Land land1 = new Land("배재준", 20, 9);
		Land land2 = new Land("배재율", 30, 29);
		
		landList.add(land);
		landList.add(land1);
		landList.add(land2);
		
		for (Land l : landList) {
			System.out.println(l);
		}
		
		Collections.sort(landList, Collections.reverseOrder());
		
		System.out.println("-----------------------------------");
		
		for (Land l : landList) {
			System.out.println(l);
		}
		
		
	}
}
