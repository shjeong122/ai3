package P679;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//동전넣기
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//동전 꺼내기
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원"); //마지막부터 꺼낸다.
		}
	}
}
