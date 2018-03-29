package ex21_7_with_db_professor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
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
		TableModel model = table.getModel();
		
		Object[] data = new Object[col];
		for(int i = 0; i < col; i++) {
			data[i] = model.getValueAt(row, i);
		}
		
		JdbcEx5 jd = new JdbcEx5();
		jd.update(data);

	}

}
