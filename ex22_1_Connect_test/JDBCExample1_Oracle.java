package ex22_1_Connect_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample1_Oracle {
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//1�ܰ� : JDBC ����̹��� �ε��Ѵ�.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2�ܰ� : DB�� �����Ѵ�.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "scott";
			String password	 = "tiger";
			conn = DriverManager.getConnection(url, username, password);
			//3�ܰ� : �޽��� ��� ��ɹ����� ��ü
			System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
			
			//4�ܰ� : DB������ ���´�.
			conn.close();
		} catch(ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		}
	}

}
