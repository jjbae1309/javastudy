package dad01.datastructure04;

import java.util.HashMap;
import java.util.Map;

public class BoardManager {
	private Map<Integer, Board> boardRepo = new HashMap<>();
	
	public BoardManager() {
		initData();
	}
	
	
	private void initData() {
		Board b1 = new Board(10001, "����", "����1", "5", 1);
		Board b2 = new Board(10002, "����2", "����2", "4",2);
		Board b3 = new Board(10003, "����3", "����3", "3", 3);
		Board b4 = new Board(10004, "����4", "����4", "2", 4);
		Board b5 = new Board(10005, "����5", "����5", "1", 5);
		
		boardRepo.put(b1.getBoardId(), b1);
		boardRepo.put(b2.getBoardId(), b2);
		boardRepo.put(b3.getBoardId(), b3);
		boardRepo.put(b4.getBoardId(), b4);
		boardRepo.put(b5.getBoardId(), b5);
	}
	public Board search(int id) {
		return boardRepo.get(id);
	}
	
	public static void main(String[] args) {
		BoardManager manager = new BoardManager();
		Board b = manager.search(10001);
		System.out.println(b.getBoardId() + b.getWriter());
	}
}
