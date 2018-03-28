package ex22_4_PreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCEx1_delete {
	public static void main(String[] args) {
		//SQL�� �ۼ��ϱ� - ���������� ��ü�� �κ��� ?�� ó���Ѵ�.
		StringBuffer sql = new StringBuffer();
		sql.append("delete from professor ");
		sql.append("where profno = ?");
		
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
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "���� ���� �����Ǿ����ϴ�.");
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
