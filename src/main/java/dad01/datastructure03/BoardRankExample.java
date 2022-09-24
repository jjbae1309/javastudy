package dad01.datastructure03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BoardRankExample {
	public static void main(String[] args) {
		List<Board> boardList = new ArrayList<>();
		
		Board board = new Board("배재준", "제목", "내용물", 10);
		Board board2 = new Board("배재율", "제목2", "내용물2", 20);
		Board board5 = new Board("철수", "제목5", "내용물5", 50);
		Board board3 = new Board("배수현", "제목3", "내용물3", 30);
		Board board4 = new Board("배로빈", "제목4", "내용물4", 40);
		
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
