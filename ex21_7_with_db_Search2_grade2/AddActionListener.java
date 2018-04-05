package ex21_7_with_db_Search2_grade2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddActionListener implements ActionListener{
	JTable table;
	JTextField nameText;
	JTextField korText;
	JTextField engText;
	JTextField mathText;
	AddActionListener(JTable table, JTextField nameText, JTextField korText, JTextField engText, JTextField mathText){
		this.table = table;
		this.nameText = nameText;
		this.korText = korText;
		this.engText = engText;
		this.mathText = mathText;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String[] data = new String[5];
		data[1] = nameText.getText();
		data[2] = korText.getText();
		data[3] = engText.getText();
		data[4] = mathText.getText();
		
		JdbcEx8 je = new JdbcEx8();
		data[0] = String.valueOf(je.infoInsert(data));
		
		Object[][] arr = je.infoSelect();
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		int row = table.getRowCount();

		model.addRow(arr[row]);
		nameText.setText("");
		korText.setText("");
		engText.setText("");
		mathText.setText("");
	}

}
