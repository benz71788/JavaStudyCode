package ex21_7_with_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcEx5 {
	
	public Object[][] infoselect() {
//		StringBuffer sql2 = new StringBuffer();
//		sql2.append("select count(name) from minfo ");
//		
//		
		StringBuffer sql = new StringBuffer();
		sql.append("insert into minfo ");
		sql.append("values(minfo_seq.nextVal, ?, ?, ?)");
		
		StringBuffer sql2 = new StringBuffer();
		sql.append("select * from  minfo");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Object[][] data = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			
			ResultSetMetaData rd = rs.getMetaData();
			data = new Object[2][rd.getColumnCount()];
			int i = 0;
			while(rs.next()){
				data[i][0] = rs.getInt(1);
				data[i][1] = rs.getString(2);
				data[i][2] = rs.getInt(3);
				data[i][3] = rs.getString(4);
				pstmt.setString(1, (String) data[i][1]);
				i++;
			};
			
			rs.close();
			pstmt.close();
			
			pstmt = conn.prepareStatement(sql2.toString());
			pstmt.executeUpdate();
			rs.next();
			
		} catch(ClassNotFoundException cnfe) {
			System.out.println(cnfe.getMessage());
			
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if(rs != null) {rs.close();}
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			
			try {
				if(pstmt != null) {pstmt.close();}
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			
			try {
				if(conn != null) {conn.close();}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return data;
	}

}
