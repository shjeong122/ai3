package yamyam;

import java.sql.*;
import java.util.*;

//dao
public class BoardDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	private ConnectionPoolBean pool;
	
	public void setPool(ConnectionPoolBean pool) {
		this.pool = pool;
	}
	
	public List<BoardDTO> makeList(ResultSet rs) throws SQLException {
		List<BoardDTO> list = new ArrayList<>();
		
		while(rs.next()) {
			BoardDTO dto = new BoardDTO();
			
			dto.setNum(rs.getInt("num"));
			dto.setWriter(rs.getString("writer"));
			dto.setTitle(rs.getString("title"));
			dto.setWriteDate(rs.getString("writeDate"));
			dto.setContent(rs.getString("content"));

			list.add(dto);
		}
		return list;
	}
	
	public List<BoardDTO> ListBoard() throws SQLException{
		try {			
        sql = "select * from board";
		ps = con.prepareStatement(sql); 	// sql 문의 결과를 가져옴
		ResultSet rs = ps.executeQuery();	// rs 쿼리 문의 결과를 담음	
		
		List<BoardDTO> list = makeList(rs);
		return list;
		
		}finally{
			if (rs != null) rs.close();
			if (ps != null) ps.close();
			if (con != null) pool.returnConnection(con);
		}
	}
}