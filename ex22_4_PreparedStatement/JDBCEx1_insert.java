package ex22_4_PreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCEx1_insert {
	public static void main(String[] args) {
		//SQL�� �ۼ��ϱ� - ���������� ��ü�� �κ��� ?�� ó���Ѵ�.
		StringBuffer sql = new StringBuffer();
		sql.append("insert into professor ");
		sql.append("values(?, ?, ?, ?, ?, sysdate, ?, ?)");
		
		Connection conn = null;
		
		//SQL������ �̸� �����ϵǰ� ����ð� ���� �μ����� ���� ������ Ȯ���� �� �ִ�.
		//��, SQL������ Ʋ�� �̸� ������ ���� ���� ���߿� �����Ѵ�.
		//������ ?�� ��ġ�ȴ�.
		PreparedStatement pstmt = null;
		
		try {
			conn = ConnUtil.getConnection();
			
			//PreparedStatement ��ü ���
			pstmt = conn.prepareStatement(sql.toString());
			
			/*
			 * �Ķ���� ����
			 * ������ ?(���ε� ����)�� ��ü�� ������ �����ϱ�
			 * �Է� �Ű����� : SQL������ ? ���ڷ� ǥ�õ� �Է� �׸��� ����Ų��.
			 * �Է� �Ű������� Ÿ���� �������̸� setInt()�� ȣ��
			 * setInt()�� ù��° �Ű� ������ ?�� ������ ���ڷ� ��Ÿ����.
			 * �ι�° �Ű� ������ ������ ���̴�.
			 */
			
			pstmt.setInt(1, 9923);
			
			//�Է� �Ű������� Ÿ���� ���ڿ��̸� setString()�� ȣ��
			pstmt.setString(2, "ȫ�浿");
			pstmt.setString(3, "gildong");
			pstmt.setString(4, "���ӱ���");
			pstmt.setInt(5, 450);
			pstmt.setInt(6, 40);
			pstmt.setInt(7, 23);
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "���� ���� �߰��Ǿ����ϴ�.");
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally {
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
