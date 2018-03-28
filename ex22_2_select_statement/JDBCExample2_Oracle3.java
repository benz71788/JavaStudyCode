package ex22_2_select_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2_Oracle3 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1�ܰ�: JDBC ����̹��� �ε��Ѵ�.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2�ܰ�: DB�� �����Ѵ�.
			String url = "jdbc:oracl:thin:@localhost:1521:xe";
			String username = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url, username, password);
			
			/*
			 * ������ ���̽��� �ִ� ���̺��� �����͸� �о���� ���� Statement ��ü�� �ʿ�
			 * 2�ܰ迡�� ���� Connection ��ü�� ���� createStatement �޼ҵ带 ȣ���ؼ� ��´�.
			 */
			stmt = conn.createStatement();
			
			/*
			 * Statement Ÿ���� java.sql ��Ű���� ���ϴ� �������̽� �̸�����
			 * select���� �����ϴ� executeQuery��� �޼ҵ尡 �ִ�.
			 * �� �޼ҵ忡 �Ķ���ͷ� select ������ �Ѱ��־�� �Ѵ�.
			 * �� �޼ҵ�� �Ķ���ͷ� �Ѱ��� select ���� ������ ���̽��� ������ �����ϰ�
			 * �� ����� ResultSet ��ü�� �����Ѵ�.
			 */
			String select_sql = "select code, name, price, maker from goodsinfo where name = 'Disital TV'";
			rs = stmt.executeQuery(select_sql);
			System.out.println("��ȣ ��ǰ�ڵ� \t  ��ǰ��\t\t\t����     ������");
			System.out.println("----------------------------------");
			
			/*
			 * ResultSet ��ü�κ��� select���� ���� ����� ��� ���ؼ��� ����
			 * next() �޼ҵ带 ȣ���ؾ� �Ѵ�.
			 * rs.next() - ���� ����� ���� �� ��ġ�� �̵��ϴ� �޼ҵ�� ������� 
			 * boolean���� ������ ���� �о� �Դ��� �����̴�.
			 */
			
			int i = 0;
			while(rs.next()) {	//���̻� ���� �����Ͱ� ���� ������ �ݺ�
				//getString("code") : �÷� code ���� String ������ �����ϴ� �޼ҵ��̴�.
				String code = rs.getString(1);	//1: ù��° �÷�
				String name = rs.getString(2);	//2: �ι�° �÷�
				
				//getInt("price") : �÷� price ���� int ������ �����ϴ� �޼ҵ��̴�.
				int price = rs.getInt(3);
				String maker = rs.getString(4);
				
				System.out.printf("%-5d%-7s\t %-10s \t %10d \t %-5s \n", ++i, code, name, price, maker);
			}
		} catch(ClassNotFoundException cnfe) {
			System.out.println("�ش�Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if(rs != null) {rs.close();}
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			
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
