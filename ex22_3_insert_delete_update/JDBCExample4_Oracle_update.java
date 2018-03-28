package ex22_3_insert_delete_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample4_Oracle_update {
	public static void main(String[] args) {
		//"A1000" "��� �ڵ���" 100 "LG"
		if(args.length != 2) {
			System.out.println("������� ��ǰ�ڵ带 �Է��ϼ���");
			return;
		}
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracl:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			
			/*
			 * INSERT, UPDATE, DELETE ���� �����ϴ� �޼���� executeUpdate()�̴�.
			 * executeUpdate()�� ���ϰ��� INSERT, UPDATE, DELETE ����� row�� ���̴�.
			 */
			
			/*
			 * 1.���� �����͸� �Է��ϴ� ���
			 * 	insert into goodsinfo(code, name, price, maker)
			 * 	values('10001', '������ TV, 350000, 'LG');
			 * 
			 * 2.������ �̿��ؼ� �Է��Ѥ� ���
			 * 	insert into goodsinfo(code, name, price, maker)
			 * 	values('args[0]', 'args[1]', args[2], 'args[3]');
			 */
			
			int rowNum = stmt.executeUpdate("update goodsinfo " 
											+ "set maker='" + args[0] + "' " 
											+ "where code='" + args[1] + "'");
			System.out.println(rowNum + "���� �����Ǿ����ϴ�.");
			
		} catch(ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			
			try {
				if(stmt != null) {stmt.close();}
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			
			try {
				if(conn != null) {conn.close();}	//4�ܰ� : ������ ���´�.
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
