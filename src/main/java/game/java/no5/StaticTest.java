package game.java.no5;

public class StaticTest {
	
	MyClass[] mc = new MyClass[10];
	
	for (int i = 0; i < 10; i++) {
		mc[i] = new MyClass();
		System.out.println("MyClass instanceÀÇ ¼ö: " + mc[0].getObjectNum() + "°³");
		}
	}
}

class MyClass{
	static int object_num = 0;
	
	public Myclass() {
		
		object_num++;
		
		public static int getobjectNum() {
			
			return object_num;
		}
	}
}