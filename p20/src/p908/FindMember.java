package p908;

public class FindMember {
	String userid;
	String username;
	int userage;
	String useremail;
	
	public FindMember() {}
	
	public FindMember(String userid, String username, int userage, String useremail) {
		super();
		this.userid = userid;
		this.username = username;
		this.userage = userage;
		this.useremail = useremail;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUserage() {
		return userage;
	}
	public void setUserage(int userage) {
		this.userage = userage;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	
}