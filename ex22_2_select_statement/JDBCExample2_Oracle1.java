package ex22_2_select_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2_Oracle1 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1단계: JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2단계: DB에 연결한다.
			String url = "jdbc:oracl:thin:@localhost:1521:xe";
			String username = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url, username, password);
			
			/*
			 * 데이터 베이스에 있는 테이블의 데이터를 읽어오기 위해 Statement 객체가 필요
			 * 2단계에서 얻은 Connection 객체에 대해 createStatement 메소드를 호출해서 얻는다.
			 */
			stmt = conn.createStatement();
			
			/*
			 * Statement 타입은 java.sql 패키지에 속하는 인터페이스 이름으로
			 * select문을 실행하는 executeQuery라는 메소드가 있다.
			 * 이 메소드에 파라미터로 select 문장을 넘겨주어야 한다.
			 * 이 메소드는 파라미터로 넘겨준 select 문을 데이터 베이스로 보내서 실행하고
			 * 그 결과로 ResultSet 객체를 리턴한다.
			 */
			String select_sql = "select code, name, price, maker from goodsinfo";
			rs = stmt.executeQuery(select_sql);
			System.out.println("번호 상품코드 \t  상품명\t\t\t가격     제조사");
			System.out.println("----------------------------------");
			
			/*
			 * ResultSet 객체로부터 select문의 실행 결과를 얻기 위해서는 먼저
			 * next() 메소드를 호출해야 한다.
			 * rs.next() - 실행 결과의 다음 행 위치로 이동하는 메소드로 결과값은 
			 * boolean으로 실제로 행을 읽어 왔는지 여부이다.
			 */
			
			int i = 0;
			while(rs.next()) {	//더이상 읽을 데이터가 없을 때까지 반복
				//getString("code") : 컬럼 code 값을 String 형으로 리턴하는 메소드이다.
				String code = rs.getString("code");
				String name = rs.getString("name");
				
				//getInt("price") : 컬럼 price 값을 int 형으로 리턴하는 메소드이다.
				int price = rs.getInt("price");
				String maker = rs.getString("maker");
				
				System.out.printf("%-5d%-7s\t %-10s \t %10d \t %-5s \n", ++i, code, name, price, maker);
			}
		} catch(ClassNotFoundException cnfe) {
			System.out.println("해당클래스를 찾을 수 없습니다." + cnfe.getMessage());
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
				if(conn != null) {conn.close();}	//4단계 : 연결을 끊는다.
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
