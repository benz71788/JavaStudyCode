package ex21_7_with_db_Search2_grade2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DelActionListener implements ActionListener{
	JTable table;
	DelActionListener(JTable table){
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int row = table.getSelectedRow();
		Object num = model.getValueAt(row, 0);
		JdbcEx8 je = new JdbcEx8();
		je.infoDelete(num);
		
		
		model.removeRow(row);
		
	}
}
