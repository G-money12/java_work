package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/testdb";
		String id="Ji";
		String pw="1234";
		String driverName="com.mysql.cj.jdvc.Driver";
		String sql="insert into member(name,id,pw) values('길동','user1111','1234')";
		Connection conn=null;
		Statement st=null;
		try {
			Class.forName(driverName);
			conn=DriverManager.getConnection(url,id,pw);
			st=conn.createStatement();
			int n=st.executeUpdate(sql);
			System.out.println(n+"개의 데이터를 추가했습니다.");
		}catch(Exception ex) {
			System.out.println("데이터처리 오류");
			ex.printStackTrace();
		}finally {
			try {
				st.close();
				conn.close();
				
			}catch(Exception ex) {}
		}
	}

}
