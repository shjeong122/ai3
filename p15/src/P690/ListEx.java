package P690;

import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		//제목2-내용2
		//제목3-내용3
		}

	}

}
