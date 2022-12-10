package dad03.test;

import java.math.BigDecimal;

public class MultiplyTest {
	public static void main(String[] args) {
		BigDecimal total = new BigDecimal(1);
			
		for (int i = 1; i <= 100; i++) {
			total = total.multiply(new BigDecimal(i));
		}
		
		System.out.println(total);
		
		System.out.println("int min=" + Integer.MIN_VALUE);
		System.out.println("int max=" + Integer.MAX_VALUE);
		System.out.println("long max=" + Long.MAX_VALUE);
		
		//char ch = 97;
		//char ch = 0x61;
		//char ch = 0141;
		//char ch = 0b01100001;
		char ch = 'a';
		System.out.println("ch:" + ch);
		
		if (ch == 0x61) {
			System.out.println("같다");
		}
		
		System.out.println(String.format("%s", ch));
		System.out.println(String.format("0x%x", (int)ch));
		System.out.println(String.format("0x%s", Integer.toHexString(ch)));
		System.out.println(String.format("%s", Integer.toBinaryString(ch)));
		System.out.println(String.format("0%o", (int)ch));
		
		
//		String str = "Hello World";
//		for (int i = 0; i < str.length(); i++) {
//			System.out.print(String.format("%x", (int)str.charAt(i)));
//		}
		
		String str2 = "안녕하세요";
		
		for (int i = 0; i < str2.length(); i++) {
			System.out.print(String.format("%x", (int)str2.charAt(i)));
		}
		
		System.out.println();
		System.out.println(str2);
	}
}
