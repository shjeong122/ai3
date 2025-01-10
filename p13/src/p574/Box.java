package p574;

public class Box<T> {
	public T content;

	public boolean compare(Box<T> box11) {
		if(this.content.equals(box11.content)) {return true;}
		else {return false;}
	}
	
}
