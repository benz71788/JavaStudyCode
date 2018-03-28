package ex22_4_PreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCEx1_select_pro_depart {
	public static void main(String[] args) {
		//SQL�� �ۼ��ϱ� - ���������� ��ü�� �κ��� ?�� ó���Ѵ�.
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT P.NAME, P.PROFNO, D.DNAME, P.POSITION "); 
		sql.append("FROM PROFESSOR P INNER JOIN DEPARTMENT D ");
		sql.append("ON P.DEPTNO = D.DEPTNO");
		Connection conn = null;
		
		//SQL������ �̸� �����ϵǰ� ����ð� ���� �μ����� ���� ������ Ȯ���� �� �ִ�.
		//��, SQL������ Ʋ�� �̸� ������ ���� ���� ���߿� �����Ѵ�.
		//������ ?�� ��ġ�ȴ�.
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = ConnUtil.getConnection();
			
			//PreparedStatement ��ü ���
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
