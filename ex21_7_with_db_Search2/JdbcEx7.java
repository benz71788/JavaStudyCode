package ex21_7_with_db_Search2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ex21_7_with_db_professor.ConnUtil;

public class JdbcEx7 {
	
	public Object[][] infoSelect(){
		StringBuffer sql = new StringBuffer();
		sql.append("select * from minfo ");
		
		StringBuffer sql_num = new StringBuffer();
		sql_num.append("select count(*) from minfo ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Object[][] data = null;
		try {
			conn = ConnUtil.getConnection();
			
			pstmt = conn.prepareStatement(sql_num.toString());
			rs = pstmt.executeQuery();
			int num = rs.getInt(1);
			rs.close();
			pstmt.close();
			
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			data = new Object[num][4];
			int i = 0;
			while(rs.next()) {
				data[i][0] = rs.getInt(1);
				data[i][1] = rs.getString(2);
				data[i][2] = rs.getInt(3);
				data[i][3] = rs.getString(4);
				i++;
			}
			
			
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
		return data;
	}
}
