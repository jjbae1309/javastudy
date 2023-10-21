package dad01.datastructure02;

public class WrapperExample {
	public static void main(String[] args) {
		String a = "1234";
		String b = "5678";
		
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		
		int cc = aa + bb;
		
		String c = Integer.toString(cc);
		
		System.out.println(cc);
		
		System.out.println(c + "(" + c.getClass().getName() + ")");
	}
}