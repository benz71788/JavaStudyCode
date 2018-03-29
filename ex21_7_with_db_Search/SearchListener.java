package ex21_7_with_db_Search;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SearchListener implements ActionListener{

	JTable table;
	JTextField input;
	JComboBox<String> combo;
	
	SearchListener(JTable table, JTextField input, JComboBox<String> combo){
		this.table = table;
		this.input = input;
		this.combo = combo;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		int num = combo.getSelectedIndex();
		Object col = table.getColumnName(num);
		Object row = input.getText();
		
		if(col.equals("번호")) {
			col = "id";
		} else if(col.equals("이름")) {
			col = "name";
		} else if(col.equals("나이")) {
			col = "age";
		} else if(col.equals("성별")) {
			col = "gender";
		}
		
		JdbcEx7 js = new JdbcEx7();
		Object[][] data = js.search(col, row);
		
		for(int i = table.getRowCount() - 1; i >= 0; i--) {
			model.removeRow(i);
		}
		for(int i=0; i<data.length;i++) {
            model.addRow(data[i]);
		}
	}
}
