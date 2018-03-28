package ex22_4_PreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx1_select {
	public static void main(String[] args) {
		//SQL문 작성하기 - 실제값으로 대체될 부분을 ?로 처리한다.
		StringBuffer sql = new StringBuffer();
		sql.append("select * from professor");
		Connection conn = null;
		
		//SQL문장이 미리 컴파일되고 실행시간 동안 인수값을 위한 공간을 확보할 수 있다.
		//즉, SQL쿼리의 틀을 미리 생성해 놓고 값을 나중에 지정한다.
		//값들이 ?로 대치된다.
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = ConnUtil.getConnection();
			
			//PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			System.out.println("PROFNO\t NAME\t ENAME\t\t POSITION\t SAL\t HIREDATE\t\t AGE\t DEPTNO\t");
			System.out.println("-----------------------------------------------------------"
					+ "-------------------------------------");
			while(rs.next()) {
				int profNo = rs.getInt(1);
				String name = rs.getString(2);
				String eName = rs.getString(3);
				String pos = rs.getString(4);
				int sal = rs.getInt(5);
				String hire = rs.getString(6);
				int age = rs.getInt(7);
				int deptno = rs.getInt(8);
				
				System.out.printf("%d\t %s\t %s\t %s\t \t%d\t %s\t %d\t %d\t",
						profNo, name, eName, pos, sal, hire, age, deptno);
				System.out.println();
			}
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if(rs != null) rs.close();
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if(pstmt != null) pstmt.close();
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if(conn != null) conn.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
