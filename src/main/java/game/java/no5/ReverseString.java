package game.java.no5;

import java.io.*;

public class ReverseString {
	public static void main(String[] args) throws IOException {
		System.out.println("�Ųٷ� ������ ���ڿ��� �Է����ּ���");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
	}
}
