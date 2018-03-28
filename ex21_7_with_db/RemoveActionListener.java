package ex21_7_with_db;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class RemoveActionListener implements ActionListener{
	
	JTable table;
	RemoveActionListener(JTable table){
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from minfo ");
		sql.append("where id = ? ");

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			int row = table.getSelectedRow();
			if(row == -1) {
				return;
			}

			DefaultTableModel model =
					(DefaultTableModel) table.getModel();
			
			int num = (int)model.getValueAt(row, 0);

			model.removeRow(row);
			
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, num);

			pstmt.executeUpdate();

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
