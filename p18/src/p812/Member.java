package p812;

import java.io.Serializable;

public class Member implements Serializable{
		private String id;
		private String name;
		private int score;
		
		private static final long serialVersionUID = -123456789L;
		public Member(String id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		@Override
		public String toString() {

		return id + " " + name;
		}
}
