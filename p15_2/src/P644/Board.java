package P644;

public class Board {
	private String subject;
	private String content;
	private String writer;
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	//주소출력(참조변수) -> 제목, 글쓴이 출력으로 재정의
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return subject + " " + writer;
	}
}
