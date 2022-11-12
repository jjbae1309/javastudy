package dad03.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\jjbae\\OneDrive\\바탕 화면\\재준 코딩 스터디.txt");
		File file2 = new File("C:\\Users\\jjbae\\OneDrive\\바탕 화면\\재준아 공부 좀 하자.txt");
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String oneLine = null;
			while ((oneLine = reader.readLine()) != null) {
				//System.out.println("oneLine:" + oneLine);
				writer.write(oneLine + "\n");
			}
			
			writer.close();
		}
		catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
