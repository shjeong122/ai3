package P644;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.naming.directory.SearchControls;

public class ArrayListEx {

	public static void main(String[] args) {
		List<Board> list1 = new ArrayList<Board>();
		
		//삽입
		list1.add(new Board("제목1", "내용1", "홍길동"));
		list1.add(new Board("제목2", "내용2", "글쓴이2"));
		list1.add(new Board("제목3", "내용3", "글쓴이3"));
		list1.add(new Board("제목4", "내용4", "홍길동"));
		list1.add(new Board("제목5", "내용5", "글쓴이5"));
		
		//검색
		System.out.println(list1.get(2)); //주소출력
		//주소(참조변수)  -> 제목과 글쓴이 출력으로 변경
		//toString() 재정의, Board에 Override
		
		//내용5 출력
		//getcontent
		String searchContent = list1.get(4).getContent();
		System.out.println(searchContent);
		
		//글쓴이1 출력
		String searchWriter = list1.get(0).getWriter();
		System.out.println(searchWriter);

		//"제목2"를 "게시판2" 수정하기
		list1.get(1).setSubject("게시판2");
		
		String searchSubject = list1.get(1).getSubject();
		System.out.println(searchSubject);
		
		//전체 객체량 카운트
		int count = list1.size();
		System.out.println(count);
		
		//글쓴이 중 홍길동 찾기
		System.out.println( list1.get(0).getWriter().equals("홍길동"));
		System.out.println( list1.get(1).getWriter().equals("홍길동"));
		System.out.println( list1.get(2).getWriter().equals("홍길동"));
		System.out.println( list1.get(3).getWriter().equals("홍길동"));
		System.out.println( list1.get(4).getWriter().equals("홍길동"));
		
		//글쓴이 홍길동 게시판 삭제
		for(int i=0; i<list1.size(); i++) {
			if(list1.get(i).getWriter().equals("홍길동")) {
				list1.remove(i);
			}
		}
		System.out.println("---------------");
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}
}
