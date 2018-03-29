package ex21_7_with_db_Search_professor2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	public void actionPerformed(ActionEvent arg0) {
		JdbcEx7 je = new JdbcEx7();
		int index = combo.getSelectedIndex();
		String column[] = {"id","name","age","gender"};
		String searchdata = column[index] + " like" + "'%" + input.getText() + "%'";
		
		System.out.println(searchdata);
		Object data[][] = je.search(searchdata);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
	
		int rowcount = table.getRowCount();
		
		for(int i=rowcount -1; i>=0; i--) {
			model.removeRow(i);
		}
		for(int i=0; i<data.length;i++)
			model.addRow(data[i]);;
	}
	
}
