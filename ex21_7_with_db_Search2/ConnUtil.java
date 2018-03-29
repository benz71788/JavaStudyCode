package ex21_7_with_db_Search2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnUtil {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없다." + cnfe.getMessage());
		}
	}
	public static Connection getConnection() throws SQLException{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		return DriverManager.getConnection(url, "scott", "tiger");
	}

}
