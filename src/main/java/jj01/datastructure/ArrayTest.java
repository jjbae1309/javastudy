package jj01.datastructure;
//만들어둔 animal 끌어다가 쓰기
import chap07.sec03.exam02.Animal;
import chap07.sec03.exam02.Cat;
import chap07.sec03.exam02.Dog;
import chap07.sec03.exam02.Tiger;

public class ArrayTest {
	public static void main(String[] args) {
		//3개짜리 array생성
		Animal[] animals = new Animal[3];
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Tiger();
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].sound();
		}
	}
}
