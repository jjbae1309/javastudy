package dad01.datastructure04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseballManager {
	private Map<Integer, BaseballPlayer> playerMap = new HashMap<>();  
	
	public BaseballManager() {
		initData();
	}
	
	private void initData() {
		BaseballPlayer p1 = new BaseballPlayer(1, "이대호", 10, "롯데", 424, 140);
		BaseballPlayer p2 = new BaseballPlayer(2, "피렐라", 63, "삼성", 432, 149);
		BaseballPlayer p3 = new BaseballPlayer(3, "이정후", 51, "키움", 439, 146);
		BaseballPlayer p4 = new BaseballPlayer(4, "소크라테스", 30, "기아", 380, 125);
		BaseballPlayer p5 = new BaseballPlayer(5, "전준우", 8, "롯데", 360, 118);
		
		playerMap.put(p1.getId(), p1);
		playerMap.put(p2.getId(), p2);
		playerMap.put(p5.getId(), p5);
		playerMap.put(p3.getId(), p3);
		playerMap.put(p4.getId(), p4);
	}
	
	public void printPlayerRanks() {
		List<BaseballPlayer> list =  new ArrayList(playerMap.values());
		Collections.sort(list, Collections.reverseOrder());
		for (BaseballPlayer b : list) {
			System.out.println(b);
		}
	}
	
	public BaseballPlayer searchPlayer(int id) {
		return playerMap.get(id);
	}
	
	public static void main(String[] args) {
		BaseballManager baseballManager = new BaseballManager();
		baseballManager.printPlayerRanks();
		
		System.out.println("=======================================");
		
		BaseballPlayer p = baseballManager.searchPlayer(3);
		System.out.println(p);
	}
}
