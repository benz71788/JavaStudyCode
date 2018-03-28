package ex22_3_insert_delete_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample4_Oracle_update {
	public static void main(String[] args) {
		//"A1000" "고급 핸드폰" 100 "LG"
		if(args.length != 2) {
			System.out.println("제조사과 상품코드를 입력하세요");
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
			 * INSERT, UPDATE, DELETE 문을 실행하는 메서드는 executeUpdate()이다.
			 * executeUpdate()의 리턴값은 INSERT, UPDATE, DELETE 수행된 row의 수이다.
			 */
			
			/*
			 * 1.직접 데이터를 입력하는 경우
			 * 	insert into goodsinfo(code, name, price, maker)
			 * 	values('10001', '디지털 TV, 350000, 'LG');
			 * 
			 * 2.변수를 이용해서 입력한ㄴ 경우
			 * 	insert into goodsinfo(code, name, price, maker)
			 * 	values('args[0]', 'args[1]', args[2], 'args[3]');
			 */
			
			int rowNum = stmt.executeUpdate("update goodsinfo " 
											+ "set maker='" + args[0] + "' " 
											+ "where code='" + args[1] + "'");
			System.out.println(rowNum + "행이 수정되었습니다.");
			
		} catch(ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			
			try {
				if(stmt != null) {stmt.close();}
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			
			try {
				if(conn != null) {conn.close();}	//4단계 : 연결을 끊는다.
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
