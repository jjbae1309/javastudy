package dad.dad01.datastructure;

import chap07.sec03.exam02.Animal;
import chap07.sec03.exam02.Cat;
import chap07.sec03.exam02.Dog;
import chap07.sec03.exam02.Tiger;

public class ArrayTest {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Tiger();
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].sound();
		}
	}
}
