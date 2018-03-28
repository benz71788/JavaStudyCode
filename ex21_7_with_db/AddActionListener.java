package ex21_7_with_db;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddActionListener implements ActionListener{
	
	JTable table;
	JTextField nameText;
	JTextField ageText;
	JTextField sexText;
	
	AddActionListener(JTable table, JTextField nameText, 
			JTextField ageText, JTextField sexText){
		this.table = table;
		this.nameText = nameText;
		this.ageText = ageText;
		this.sexText = sexText;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		StringBuffer sql = new StringBuffer();
		sql.append("insert into minfo ");
		sql.append("values(minfo_seq.nextval, ?, ?, ?)");
		
		StringBuffer sql2 = new StringBuffer();
		sql2.append("select minfo_seq.currval from dual ");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, nameText.getText());
			pstmt.setString(2, ageText.getText());
			pstmt.setString(3, sexText.getText());
			
			pstmt.executeUpdate();
			
			pstmt.close();
			
			pstmt = conn.prepareStatement(sql2.toString());
			rs = pstmt.executeQuery();
			rs.next();
			int num = rs.getInt(1);
			
			DefaultTableModel model =
					(DefaultTableModel) table.getModel();
			
			Object[] rowData = {num,
								nameText.getText(), 
								ageText.getText(),
								sexText.getText()};
			
			model.addRow(rowData);
			
			
		} catch(ClassNotFoundException cnfe) {
			System.out.println(cnfe.getMessage());
			
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally {

			try {
				if(pstmt != null) {pstmt.close();}
			} catch(SQLException se) {
				System.out.println(se.getMessage());
			}
			
			try {
				if(conn != null) {conn.close();}
			} catch(Exception ee) {
				System.out.println(ee.getMessage());
			}
		}

	}

}
