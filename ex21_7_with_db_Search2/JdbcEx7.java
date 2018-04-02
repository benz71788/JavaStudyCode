package ex21_7_with_db_Search2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class JdbcEx7 {
	
	public Object[][] infoSelect(){
		StringBuffer sql = new StringBuffer();
		sql.append("select * from minfo order by id ");
		
		StringBuffer sql_num = new StringBuffer();
		sql_num.append("select count(*) from minfo ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Object[][] data = null;
		int num = 0;
		try {
			conn = ConnUtil.getConnection();
			
			pstmt = conn.prepareStatement(sql_num.toString());
			
			rs = pstmt.executeQuery();
			rs.next();
			num = rs.getInt(1);
			rs.close();
			pstmt.close();
			
			data = new Object[num][4];
			int i = 0;
			System.out.println(sql.toString());
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
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
	
	public int infoInsert(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into minfo ");
		sql.append("values(minfo_seq.nextval, ?, ?, ?)");
		
		StringBuffer sql_num = new StringBuffer();
		sql_num.append("select minfo_seq.currval from dual ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, args[1]);
			pstmt.setInt(2, Integer.valueOf(args[2]));
			pstmt.setString(3, args[3]);
			
			result = pstmt.executeUpdate();
			System.out.println(result + "행이 추가되었습니다.");
			pstmt.close();
			
			pstmt = conn.prepareStatement(sql_num.toString());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt(1);
			}
			
			
		} catch(SQLException se) {
			System.out.println(se.getMessage());
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
	
	public void infoDelete(Object num) {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from minfo ");
		sql.append("where id = ? ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ConnUtil.getConnection();
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setObject(1, num);
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "개의 행이 삭제 되었습니다.");
			
			
		} catch(SQLException se) {
			System.out.println(se.getMessage());
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
	}
	
	public int infoUpdate(Object[] args){
		StringBuffer sql = new StringBuffer();
		sql.append("update minfo ");
		sql.append("set name = ?, age = ?, gender = ? ");
		sql.append("where id = ?");
		
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, args[1].toString());
			pstmt.setInt(2, Integer.parseInt(args[2].toString()));
			pstmt.setString(3, args[3].toString());
			pstmt.setInt(4, Integer.parseInt(args[0].toString()));
			
			result = pstmt.executeUpdate();
			System.out.println(result + "행이 수정되었습니다.");
			
		} catch(SQLException se) {
			System.out.println(se.getMessage());
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
	
	public Object[][] infoSearch(Map<String, String> map) {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from minfo ");
		sql.append("where " + map.get("col_name") + " like '%" + map.get("input_word") + "%' ");
		sql.append("order by id asc");
		
		StringBuffer sql_num = new StringBuffer();
		sql_num.append("select count(*) from minfo ");
		sql_num.append("where " + map.get("col_name") + " like '%" + map.get("input_word") + "%' ");
		
		Object[][] result = null;
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
			rs.close();
			pstmt.close();
			
			result = new Object[row][4];
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			int i = 0;
			while(rs.next()) {
				result[i][0] = rs.getInt(1);
				result[i][1] = rs.getString(2);
				result[i][2] = rs.getInt(3);
				result[i][3] = rs.getString(4);
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
		return result;
	}
}
