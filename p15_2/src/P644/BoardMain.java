package P644;

import java.util.ArrayList;
import java.util.Iterator;

public class BoardMain {

	public static void main(String[] args) {
		// 베열 단점 - 크기 고정되면 고칠 수 없다. 
		// 삭제 등으로 인해 값이 지워진 빈 공간을 찾기 어려움 
		// 보완 : 크기 가변적, 비워진 공간 발생 시 당겨와 채우기
		// =>List
		
		//1단계 ArrayList 객체화
		ArrayList<String> aList1 = new ArrayList<String>();
		
		//2단계 ArrayList 값 넣기
		aList1.add("a");
		aList1.add("b");
		aList1.add("c");
		aList1.add("d");
		aList1.add("e");
		
		//찾기 _"d"
		boolean r = aList1.contains("d");
		System.out.println(r);
		
		//전체 자료 수 
		int count = aList1.size();
		System.out.println(count);
		
		//인쇄_"b" 해당 인덱스번호 1
		System.out.println(aList1.get(1));
		//인쇄_"e"해당 인덱스번호 4
		System.out.println(aList1.get(4));
	
		//전체 출력_반복문 사용
		System.out.println("---------------");
		for(int i=0; i<aList1.size(); i++) {
			System.out.print(aList1.get(i));
		}
		System.out.println();
		
		//전체 출력_iterator() 반복자 사용
		System.out.println("---------------");
		Iterator <String> it = aList1.iterator();
		while( it.hasNext() ) {  //반복할게 있으면 true, 아니면 false
			String e = it.next() ;
			System.out.print( e );
		}
		System.out.println();
		
		//추가_"c"
		aList1.add("c");
		
		System.out.println("---------------");
		it = aList1.iterator();
		while( it.hasNext() ) {  //반복할게 있으면 true, 아니면 false
			String e = it.next() ;
			System.out.print( e );
		}
		System.out.println();
		
		//추가_5번 인덱스에 "f" 추가
		aList1.add(5,"f");
		
		System.out.println("---------------");
		it = aList1.iterator();
		while( it.hasNext() ) {  //반복할게 있으면 true, 아니면 false
			String e = it.next() ;
			System.out.print( e );
		}
		System.out.println();
		
		//수정_"a"를 "1"로 
		aList1.set(0, "1");
		
		System.out.println("---------------");
		it = aList1.iterator();
		while( it.hasNext() ) {  //반복할게 있으면 true, 아니면 false
			String e = it.next() ;
			System.out.print( e );
		}
		System.out.println();
		
		//삭제
		aList1.remove(6);
		
		System.out.println("---------------");
		it = aList1.iterator();
		while( it.hasNext() ) {  //반복할게 있으면 true, 아니면 false
			String e = it.next() ;
			System.out.print( e );
		}
		System.out.println();

	}

}
