package ex22_4_PreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCEx1_select_pro_depart {
	public static void main(String[] args) {
		//SQL문 작성하기 - 실제값으로 대체될 부분을 ?로 처리한다.
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT P.NAME, P.PROFNO, D.DNAME, P.POSITION "); 
		sql.append("FROM PROFESSOR P INNER JOIN DEPARTMENT D ");
		sql.append("ON P.DEPTNO = D.DEPTNO");
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
			
			ResultSetMetaData rd = rs.getMetaData();
			for(int i = 1; i <= 4; i++) {
				if(i == 4) System.out.print("\t");
				System.out.print(rd.getColumnName(i) + "\t");
			}
			System.out.println("\n------------------------------------------");
			while(rs.next()) {
				String name = rs.getString(1);
				int profno = rs.getInt(2);
				String dname = rs.getString(3);
				String pos = rs.getString(4);
				
				System.out.printf("%s\t%d\t%s\t%s\t",
						name, profno, dname, pos);
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
