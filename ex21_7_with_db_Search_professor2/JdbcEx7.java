package ex21_7_with_db_Search_professor2;
import java.sql.*;

import javax.swing.JComboBox;
import javax.swing.JTextField;
public class JdbcEx7 {	
	public  Object[][] infoselect() {
		StringBuffer sql = new StringBuffer();
		StringBuffer sqlcount = new StringBuffer();
		sql.append("select * from  minfo order by id");
		sqlcount.append("select count(*) from  minfo");
		Object a[][] = null;
		Connection conn = null;
		int row;
		PreparedStatement pstmt = null;		
		ResultSet rs = null;
		try {
			 conn = ConnUtil.getConnection();
			 
			 //PreparedStatement 객체 얻기
			 pstmt = conn.prepareStatement(sqlcount.toString());			 
			
			 //쿼리 실행 - row 수 구해오기
			rs = pstmt.executeQuery();
			rs.next();
			row = rs.getInt(1);
			rs.close();
			pstmt.close();
			
			//row수 만큼 배열의 행을 만듬
			a = new Object[row][4];
			
			int i=0;			
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while(rs.next()){				
				a[i][0]=rs.getInt(1);
				a[i][1]= rs.getString(2);
				a[i][2]=rs.getInt(3);
				a[i][3]=rs.getString(4);	
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
		}//finally end
		return a;
	}//infoselect end
	
	
	public  int infoinsert(String args[]) {
		//SQL문 작성하기 - 실제값으로 대체될 부분을 ?로 처리한다.
		StringBuffer sql = new StringBuffer();
		sql.append("insert into minfo ");
		sql.append("values(minfo_seq.nextval, ?, ?, ?)");	
		
		StringBuffer sql_id = new StringBuffer();
		sql_id.append("select minfo_seq.currval from dual");
		
		Connection conn = null;		
		PreparedStatement pstmt = null;	
		ResultSet rs = null;
		int result = 0;
		try {
			 conn = ConnUtil.getConnection();
			 
			 pstmt = conn.prepareStatement(sql.toString());			 
			 pstmt.setString(1,  args[1]);
			 pstmt.setInt(2,  Integer.parseInt(args[2]));
			 pstmt.setString(3,  args[3]);			 
			 
			 //쿼리 실행
			result = pstmt.executeUpdate();
			System.out.println(result + "개의 행이 추가 되었습니다.");
			 pstmt.close();
			 
			pstmt=conn.prepareStatement(sql_id.toString());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				 result= rs.getInt(1);
			}
			
		} catch (SQLException se) {
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
	
	public  void infodelete(Object id) {
		//SQL문 작성하기 - 실제값으로 대체될 부분을 ?로 처리한다.
		StringBuffer sql = new StringBuffer();
		sql.append("delete minfo ");
		sql.append("where id = ?");
		
		Connection conn = null;
		PreparedStatement pstmt = null;		
		
		try {
			 conn = ConnUtil.getConnection();
			 
			 //PreparedStatement 객체 얻기
			 pstmt = conn.prepareStatement(sql.toString());
			 
			 //입력 매개 변수(?)에  대체될 실제값 지정하기
			pstmt.setObject(1,  id);			 
			
			 //쿼리 실행
			int result = pstmt.executeUpdate();
			System.out.println(result + "개의 행이 삭제 되었습니다.");
		} catch (SQLException se) {
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
	}//infodelete end
	
	public  int update(Object args[]) {
		//SQL문 작성하기 - 실제값으로 대체될 부분을 ?로 처리한다.
		StringBuffer sql = new StringBuffer();
		sql.append("update minfo ");
		sql.append("set name=? , age=?, gender=? ");	
		sql.append("where id = ? ");	
		
		
		Connection conn = null;		
		PreparedStatement pstmt = null;	
		int result = 0;
		try {
			 conn = ConnUtil.getConnection();
			 
			 pstmt = conn.prepareStatement(sql.toString());			 
			 pstmt.setString(1,  args[1].toString());
			 pstmt.setInt(2,  Integer.parseInt(args[2].toString()));
			 pstmt.setString(3,  args[3].toString());			 
			 pstmt.setInt(4, Integer.parseInt(args[0].toString()));
			 
			 //쿼리 실행
			result = pstmt.executeUpdate();
			System.out.println(result + "개의 행이 갱신 되었습니다.");
			
		} catch (SQLException se) {
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
	public  Object[][] search(String searchdata) {
		StringBuffer sql = new StringBuffer();
		StringBuffer sqlcount = new StringBuffer();
		sqlcount.append("select count(*) from  minfo where " + searchdata);
		sql.append("select * from  minfo where " + searchdata);
		
		Object a[][] = null;
		Connection conn = null;
		PreparedStatement pstmt = null;		
		ResultSet rs = null;
		int row;
		try {
			 conn = ConnUtil.getConnection();
			 
			 //PreparedStatement 객체 얻기
			 pstmt = conn.prepareStatement(sqlcount.toString());			 
			
			 //쿼리 실행 - row 수 구해오기
			rs = pstmt.executeQuery();
			rs.next();
			row = rs.getInt(1);
			rs.close();
			pstmt.close();
			
			//row수 만큼 배열의 행을 만듬
			a = new Object[row][4];
			
			int i=0;			
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while(rs.next()){				
				a[i][0]=rs.getInt(1);
				a[i][1]= rs.getString(2);
				a[i][2]=rs.getInt(3);
				a[i][3]=rs.getString(4);	
				i++;
			}		
		} catch (SQLException se) {
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
		return a;
	}	
	
}
