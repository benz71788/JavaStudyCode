package ex21_7_with_db_Search2;

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
		try {
			conn = ConnUtil.getConnection();
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
		
		Object[][] data = null;
		
		return data;
	}
}
