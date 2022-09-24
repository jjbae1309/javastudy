package dad01.datastructure03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BoardRankExample {
	public static void main(String[] args) {
		List<Board> boardList = new ArrayList<>();
		
		Board board = new Board("������", "����", "���빰", 10);
		Board board2 = new Board("������", "����2", "���빰2", 20);
		Board board5 = new Board("ö��", "����5", "���빰5", 50);
		Board board3 = new Board("�����", "����3", "���빰3", 30);
		Board board4 = new Board("��κ�", "����4", "���빰4", 40);
		
		boardList.add(board);
		boardList.add(board2);
		boardList.add(board5);
		boardList.add(board3);
		boardList.add(board4);
		
		for (Board b : boardList) {
			System.out.println(b);
			
		}
		
		Collections.sort(boardList, Collections.reverseOrder());
		
		System.out.println("-------------------------------------");
		
		for (Board b : boardList) {
			System.out.println(b);
		}
	}
}
