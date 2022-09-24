package jj01.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dad01.datastructure03.Land;

public class LandExample {
	public static void main(String[] args) {
		List<Land> landList = new ArrayList<>();
		
		Land land = new Land("ȫ�浿", 120, 86);
		Land land1 = new Land("������", 23, 92);
		Land land2 = new Land("������", 30, 59);
		
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


