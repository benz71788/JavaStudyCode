package ex21_7_with_db_Search2_grade2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JdbcEx8 {
	
	public Object[][] infoSelect(){
		StringBuffer sql = new StringBuffer();
		sql.append("select * from gradecard ");
		sql.append("order by no asc ");
		
		StringBuffer sql_num = new StringBuffer();
		sql_num.append("select count(*) from gradecard ");
		
		Object[][] data = null;
		int row = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnUtil.getConnection();
		
			pstmt = conn.prepareStatement(sql_num.toString());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				row = rs.getInt(1);
			}
			pstmt.close();
			rs.close();
			
			data = new Object[row][8];
			
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			int i = 0;
			while(rs.next()) {
				for(int j = 0; j < data[i].length; j++) {
					data[i][j] = rs.getObject(j+1);
				}
				i++;
			}
		} catch (SQLException se) {
			se.printStackTrace();
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
	
	public int infoInsert(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into gradecard(no, name, kor, eng, mat) ");
		sql.append("values(gradecard_seq.nextval, ?, ?, ?, ?) ");
		
		StringBuffer sql_num = new StringBuffer();
		sql_num.append("select gradecard_seq.currval from dual ");
		
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnUtil.getConnection();
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, args[1]);
			pstmt.setInt(2, Integer.parseInt(args[2]));
			pstmt.setInt(3, Integer.parseInt(args[3]));
			pstmt.setInt(4, Integer.parseInt(args[4]));
			
			result = pstmt.executeUpdate();
			System.out.println(result + "행이 추가되었습니다.");
			pstmt.close();
			
			pstmt = conn.prepareStatement(sql_num.toString());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt(1);
			}
		} catch (SQLException se) {
			se.printStackTrace();
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
		
		return result;
	}
	
	public int infoDelete(Object row) {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from gradecard ");
		sql.append("where no = ? ");
		
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setObject(1, row);
			result = pstmt.executeUpdate();
			System.out.println(result + "행이 삭제되었습니다.");
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
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
		return result;
	}
}
