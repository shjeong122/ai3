package P647;

import java.util.List;
import java.util.Vector;

import P644.Board;
import p12.Member;

public class VectorEx {

	public static void main(String[] args) {
		List<Double> list1 = new Vector<Double>();
		
		//삽입
		list1.add(1.2);
		list1.add(2.2);
		list1.add(3.2);
		list1.add(1.2);
		
		//수정_인덱스3번 숫자 4.2
		list1.set(3, 4.2);
		
		//응용
		//합계
		double sum = 0;
		for(int i=0; i<list1.size(); i++) {
			sum += list1.get(i);
		}
		System.out.println(sum);
		
		//제일 큰수
		double max = -999.99;
		for(int i=0; i<list1.size(); i++) {
			if(max < list1.get(i)) {
				max = list1.get(i);
			}
		}
		System.out.println(max);
		
		//Board게시판 객체화
		List<Board> list2 = new Vector<Board>();
		list2.add(new Board("제목1", "내용1", "글쓴이1"));
		
		//다른 프로젝트 p12의 Member클래스 객체화(new)
		//방법1 p12프로젝트 압축(export)하고 build path로 연결
		
		List<Member> list3 = new Vector<Member>();
		list3.add(new Member("a10", "홍길동"));
		list3.add(new Member("a11", "김길동"));
		System.out.println(list3.get(1).getName());
		
		//방법2 모듈 사용하여 바로 불러와 사용
	}
}
