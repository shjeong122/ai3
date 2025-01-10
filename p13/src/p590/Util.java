package p590;

import p589.Pair;

public class Util<K,V> {
//방법1 Pair와 자식 모두 허용, 다른객체는 못받아
//	public static <K,V> V getValue(Pair <K, V> p, K k) {
//		if(p.getKey() == k) {
//			return p.getValue();
//		}else {
//		return null; //나이 반환
//	}
//}
	//방법2 첫번째 매개변수를 위한 Pair와 Pair 자식으로 
				//제네릭자료타입			     리턴타입 메소드명
	public static <P extends Pair<K, V>, K, V>  V   getValue(P p, K k) {
		if(p.getKey() == k) {
			return p.getValue();
		}else {
		return null; //나이 반환

}
}
}