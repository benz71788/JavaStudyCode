package ex21_7_DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveActionListener implements ActionListener{

	JTable table;
	RemoveActionListener(JTable table){
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow();
		
		if(row == -1) {
			return;
		}
		DefaultTableModel model =
				(DefaultTableModel) table.getModel();

		System.out.println("急琶等 青= " + row);
		model.removeRow(row);
		
//		if(model.getRowCount() != 0) {
//			System.out.println("急琶等 青= " + row);
//			model.removeRow(row);
//		}
		
	}
}
