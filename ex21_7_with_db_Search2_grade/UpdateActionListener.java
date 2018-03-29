package ex21_7_with_db_Search2_grade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class UpdateActionListener implements ActionListener{
	JTable table;
	UpdateActionListener(JTable table){
		this.table = table;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow();
		int col = table.getColumnCount();
		if(row == -1) {
			return;
		}
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		Object[] data = new Object[col];
		for(int i = 0; i < col; i++) {
			data[i] = model.getValueAt(row, i);
		}
		
		JdbcEx7 jd = new JdbcEx7();
		jd.update(data);
		
		Object[][] arr = jd.infoselect();
		
		int rowcount = table.getRowCount();
		
		for(int i = rowcount -1; i >= 0; i--) {
			model.removeRow(i);
		}
		
		for(int i = 0; i < arr.length; i++) {
			model.addRow(arr[i]);
		}

	}

}
