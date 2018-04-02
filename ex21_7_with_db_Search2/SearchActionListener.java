package ex21_7_with_db_Search2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SearchActionListener implements ActionListener{
	JTable table;
	JTextField input;
	JComboBox<String> combo;
	SearchActionListener(JTable table, JTextField input, JComboBox<String> combo){
		this.table = table;
		this.input = input;
		this.combo = combo;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		String[] col_names = {"id", "name", "age", "gender"};
		int index = combo.getSelectedIndex();
		Map<String, String> map = new HashMap<String, String>();
		map.put("col_name", col_names[index]);
		map.put("input_word", input.getText());
		
		JdbcEx7 je = new JdbcEx7();
		Object[][] data = je.infoSearch(map);
		
		int rowCount = model.getRowCount();
		for(int i = rowCount - 1; i >= 0; i--) {
			model.removeRow(i);
		}
		
		for(int i = 0; i < data.length; i++) {
			model.addRow(data[i]);
		}
	}

}
