package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverName="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/sampledb";
		String id="G";
		String pw="1234";
		Connection conn=null;
		Statement st=null;
		String sql="update board set title='수정제목',content='수정내용' where bno=3";	
																	// where 조건
		String sql2="delete from board where bno=3";
		try {
			Class.forName(driverName);
			conn=DriverManager.getConnection(url,id,pw);
			st=conn.createStatement();
			int n=st.executeUpdate(sql2);
				
		}catch(Exception ex) {
			System.out.println("DB 오류");
			ex.printStackTrace();			// 개발시 붙여놓고 개발후에는 주석처리 
		}finally {
			try {
				st.close();
				conn.close();
				
			}catch(Exception e) {}
		}
	}

}
