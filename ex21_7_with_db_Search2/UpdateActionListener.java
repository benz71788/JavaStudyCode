package ex21_7_with_db_Search2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UpdateActionListener implements ActionListener{
	JTable table;
	UpdateActionListener(JTable table){
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		int row = table.getSelectedRow();
		int col = table.getColumnCount();
		if(row == -1) {
			return;
		}
		
		Object[] data = new Object[col];
		for(int i = 0; i < col; i++) {
			data[i] = model.getValueAt(row, i);
		}
		
		JdbcEx7 je = new JdbcEx7();
		int num = je.infoUpdate(data);
	}

}
