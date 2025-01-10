package p908;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DBConn {

	public static void main(String[] args) {
		// 데이터베이스 연결
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mydb";
		String userid = "root";
		String passwd = "1234";
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		PreparedStatement pstm = null; 
		ResultSet rs = null;
		
		try {
			Class.forName(driver); //2단계 : 드라이버 로딩
			conn = DriverManager.getConnection(url, userid, passwd); //3단계 : 연결하기
			System.out.println("연결 성공");
			
			int menu = 0;
			while(menu != 6) {
				System.out.println("메뉴 선택(1.삽입, 2.수정, 3.삭제, 4.전체보기, 5검색보기, 6종료)");
				menu = sc.nextInt();
				switch(menu) {
					case 1 :
							System.out.println("아이디를 입력하세요");
							String id = sc.next();
							System.out.println("비밀번호를 입력하세요");
							String pw = sc.next();
							System.out.println("나이를 입력하세요");
							int age = sc.nextInt();
							System.out.println("이메일을 입력하세요");
							String email = sc.next();
									
							//String inserSql = "insert into member values('a100', 'abcd', 10, 'abcd@naver.com')";
							String inserSql = "insert into member values(?, ?, ?, ?)"; //?개수만큼 값이 지정되어야 한다.		
							
							pstm = conn.prepareStatement(inserSql);
							pstm.setString(1, id);
							pstm.setString(2, pw);
							pstm.setInt(3, age);
							pstm.setString(4, email);
							int r = pstm.executeUpdate(); //데이터베이스 sql문장이 전달되어 실행하기(번개 누르기)
							System.out.println(r + "행이 삽입 되었습니다.");
							break;
					case 2 : System.out.println("수정할 아이디를 입력하세요");
							String uid = sc.next();
							System.out.println("수정할 나이를 입력하세요");
							int uage = sc.nextInt();
							String updateSql = "update member set userage = ? where userid = ?" ;
							pstm = conn.prepareStatement(updateSql);
							pstm.setInt(1, uage);
							pstm.setString(2, uid);
							int rr = pstm.executeUpdate();
							System.out.println(rr + "행을 수정했습니다.");
							break;
					case 3 : System.out.println("삭제할 아이디를 입력하세요");
							String delid = sc.next();
							String delSql = "delete from member where userid=?";
							pstm = conn.prepareStatement(delSql);
							pstm.setString(1, delid);
							int rrr = pstm.executeUpdate();
							System.out.println(rrr + "행을 삭제했습니다");
							break;
					case 4 : //String selectSql = "select * from member";
							String selectSql = "select * from member order by userage asc";
							pstm = conn.prepareStatement(selectSql);
							rs = pstm.executeQuery();
							List<Member> memberList = new ArrayList<>();
							while(rs.next()) {
								
								Member member = new Member();
								member.setUserid(rs.getString("userid"));
								//member 객체안에 setUserid() 메소드 호출하여서 값을 넣는다.
								//rs,getString("userid") 설명
								//rs는 데이터베이스에서 결과로 받아서 getString("데이터베이스의 컬럼명")에 있는 값을 가지고 온다.
								//										****************중요
								member.setUsername(rs.getString("username"));
								member.setUserage(rs.getInt("userage"));
								member.setUseremail(rs.getString("useremail"));
								
								memberList.add(member);
							}
							System.out.println("데이터베이스 안에 모든 자료들");
							for(int i=0;i<memberList.size();i++) {
								System.out.printf("%-6s%-6s%-6s%-10s", 
										memberList.get(i).getUserid(),
										memberList.get(i).getUsername(),
										memberList.get(i).getUserage(),
										memberList.get(i).getUseremail());
								/*System.out.print( memberList.get(i).getUserid()+ " ");
								System.out.print( memberList.get(i).getUsername()+ " ");
								System.out.print( memberList.get(i).getUserage()+ " ");
								System.out.print( memberList.get(i).getUseremail()+ " ");*/
								System.out.println();
							}
							break;
					case 5 : System.out.println("검색할 아이디를 입력하세요");//a100 => a100만 출력
							String findid = sc.next();
							String findidSql = "select * from member where userid=?";
							pstm = conn.prepareStatement(findidSql);
							pstm.setString(1, findid);
							rs = pstm.executeQuery();
						
							List<FindMember> fmemberList = new ArrayList<>();
							while(rs.next()) {
								
								FindMember fmember = new FindMember();
								fmember.setUserid(rs.getString("userid"));
								//member 객체안에 setUserid() 메소드 호출하여서 값을 넣는다.
								//rs,getString("userid") 설명
								//rs는 데이터베이스에서 결과로 받아서 getString("데이터베이스의 컬럼명")에 있는 값을 가지고 온다.
								//										****************중요
								fmember.setUsername(rs.getString("username"));
								fmember.setUserage(rs.getInt("userage"));
								fmember.setUseremail(rs.getString("useremail"));
								
								fmemberList.add(fmember);
							}
							System.out.println("데이터베이스 안에 " + findid + " 자료 출력");
							for(int i=0;i<fmemberList.size();i++) {
							System.out.printf("%-6s%-6s%-4s%-10s", 
									fmemberList.get(i).getUserid(),
									fmemberList.get(i).getUsername(),
									fmemberList.get(i).getUserage(),
									fmemberList.get(i).getUseremail());
									System.out.println();
							}
							break;
							}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn !=null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
