package dad01.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatastructureTest {
	public static void main(String[] args) {
		/*
		List<Animal> animals = new ArrayList();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Tiger());
		
		for (int i = 0; i < animals.size(); i++) {
			animals.get(i).sound();
		}
		*/
		
		List<Integer> numbers = new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		Map<Integer, String> map = new HashMap();
		map.put(1, "배수현");
		map.put(2, "배재준");
		map.put(3, "배재율");
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
	}
}
