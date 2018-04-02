package ex21_7_with_db_Search2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DeleteActionListener implements ActionListener{
	JTable table;
	DeleteActionListener(JTable table){
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow();
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		
		Object index = model.getValueAt(row, 0);
		
		JdbcEx7 je = new JdbcEx7();
		je.infoDelete(index);
		
		System.out.println("삭제된 행은 " + index + "행 입니다.");
		
		model.removeRow(row);
	}

}
