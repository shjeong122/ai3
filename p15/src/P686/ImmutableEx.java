package P686;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class ImmutableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> iList = List.of("A", "B", "C");
		System.out.println(iList.get(2));
		//수정 =>불가
		//iList.set(2,"d");
		//삭제 =>불가
		//iList.remove(0);
		//방법1
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		//방법2
		Set<Integer> co = Set.copyOf(hs);
		//삽입 =>불가
		//co.add(30);
		//삭제 =>불가
		//co.remove(10);
		//방법3
		List<Integer> alist = Arrays.asList(10,20,30,40);
		//삽입 =>불가
		//alist.add(50);
		//수정
		//alist.set(1, 100);
		//삭제
		//alist.remove(20);
		
		Set<String> ieSet = Set.of("A", "B", "C");
		Map<Integer, String> iMap = Map.of(
				1, "A",
				2, "B",
				3, "C"
				);
		
	}

}
