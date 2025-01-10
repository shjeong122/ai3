package P690;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {
		// Board 객체를 리스트로 만들어 리턴
		//1.리스트 생성
		List<Board> list1 = new ArrayList<>();
		
		//2. 객체 생성
		Board b1 = new Board("제목1", "내용1");
		Board b2 = new Board("제목2", "내용2");
		Board b3 = new Board("제목3", "내용3");
		
		//3. 리스트안에 board 객체 생성 주소 넣는다.
		list1.add(b1);
		list1.add(b2);
		list1.add(b3);
		
		//4. 리스트 객체 주소를 리턴한다.
		return list1;
	}
	
}
