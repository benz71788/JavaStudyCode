package ex21_7_with_db_Search2_grade2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnUtil {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		return DriverManager.getConnection(url, "scott", "tiger");
	}
}
