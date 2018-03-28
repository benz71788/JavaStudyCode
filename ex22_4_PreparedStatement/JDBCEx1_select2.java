package ex22_4_PreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCEx1_select2 {
	public static void main(String[] args) {
		//SQL�� �ۼ��ϱ� - ���������� ��ü�� �κ��� ?�� ó���Ѵ�.
		StringBuffer sql = new StringBuffer();
		sql.append("select * from professor");
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
			for(int i = 1; i <= 8; i++) {
				if(i == 4 || i == 7) System.out.print("\t");
				System.out.print(rd.getColumnName(i) + "\t");
			}
			System.out.println("\n-----------------------------------------------------------"
					+ "---------------------------------");
			while(rs.next()) {
				int profNo = rs.getInt(1);
				String name = rs.getString(2);
				String eName = rs.getString(3);
				String pos = rs.getString(4);
				int sal = rs.getInt(5);
				String hire = rs.getString(6);
				int age = rs.getInt(7);
				int deptno = rs.getInt(8);
				
				System.out.printf("%d\t %s\t %s\t %s\t\t %d\t %s\t %d\t %d\t",
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