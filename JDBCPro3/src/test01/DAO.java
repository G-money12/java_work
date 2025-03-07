package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class DAO {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	public void selectOne(int bno) {
		String sql="select * from board where bno=?";
		try {
			getConnect();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, bno);
			rs=ps.executeQuery();
			if(rs.next()) {
				int dbbno=rs.getInt("bno");
				String title=rs.getString("title");
				String content=rs.getString("content");
				String writer=rs.getString("writer");
				Timestamp postdate=rs.getTimestamp("postdate");
				System.out.printf("%d %s %s %s",dbbno,title,content,writer);
				System.out.println(postdate);
				
			}
	}catch(Exception ex) {
		System.out.println("데이터 처리오류");
		ex.printStackTrace();
	}finally {
		closeDB();
	}

}
	
	public void delete(int bno) {			// 4. 삭제
		String sql="delete from board where bno=?";
		try {
			getConnect();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, bno);
			int n=ps.executeUpdate();
			System.out.println(n+"개의 데이터가 삭제 되었습니다.");
		}catch(Exception ex) {
			System.out.println("데이터 삭제 오류");
			ex.printStackTrace();
		}finally {
			closeDB();
		}
	}
	
	private void getConnect() {				//  연결
		String driverName="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/sampledb";
		String id="G";
		String pw="1234";
		try {
			Class.forName(driverName);
			conn=DriverManager.getConnection(url,id,pw);
			System.out.println("DB연결 성공");
		}catch(Exception ex) {
			System.out.println("DB연결 오류");
			ex.printStackTrace();
		}
		
	}
	private void closeDB() {              
		try {
			if(rs!=null)rs.close();		// rs가 생성되어있으면, close
			if(ps!=null)ps.close();		// ps가 생성되어있으면, close
			if(conn!=null)conn.close(); // conn이 생성되었으면, close
		}catch(Exception e) {}
	}
	
	public void update(String title, String content, int bno) {			// 3. 수정
		String sql="update board set title=?, content=? where bno=?"; 
		try {
			getConnect();		// 
			ps=conn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, bno);
			int n=ps.executeUpdate();
			System.out.println(n+"개의 데이터가 수정되었습니다.");
		}catch(Exception ex) {
			System.out.println("데이터 처리오류");
			ex.printStackTrace();
		}finally {
			closeDB();
		}
	
	}
	
	
	public void insert(String title, String content, String writer) {		// 1. 입력
		String sql="insert into board(title,content,writer) values(?,?,?)"; 
		try {
			getConnect();		// 
			ps=conn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, writer);
			int n=ps.executeUpdate();
			System.out.println(n+"개의 데이터가 추가되었습니다.");
		}catch(Exception ex) {
			System.out.println("데이터 처리오류");
			ex.printStackTrace();
		}finally {
			closeDB();
		}
	
	}
	
	public void selectAll(){				// 출력
		String sql="select * from board";
				
		try {
			getConnect();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				int bno=rs.getInt("bno");
				String title=rs.getString("title");
				String content=rs.getString("content");
				String writer=rs.getString("writer");
				Timestamp postdate=rs.getTimestamp("postdate");
				System.out.printf("%d %s %s %s",bno,title,content,writer);
				System.out.println(postdate);
				
			}
		}catch(Exception ex) {
			System.out.println("데이터 처리오류");
			ex.printStackTrace();
		}finally {
			closeDB();
		}
	}
}
