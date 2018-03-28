package ex21_7_DefaultTableModel2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class RemoveActionListener implements ActionListener{

	JTable table;
	JTextField nameText;
	JTextField ageText;
	JTextField sexText;
	Object[] rowData = new Object[3];
	ArrayList<Object> list = new ArrayList<Object>();
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
		
		for(int i = 0; i < 3; i++) {
			System.out.println(model.getValueAt(row, i));
			rowData = new Object[]{model.getValueAt(row, i)};			
		}
		
		nameText = (JTextField) model.getValueAt(row, 0);
		ageText = (JTextField) model.getValueAt(row, 1);
		sexText = (JTextField) model.getValueAt(row, 2);
		
		System.out.println("急琶等 青= " + row);
		model.removeRow(row);
		
//		if(model.getRowCount() != 0) {
//			System.out.println("急琶等 青= " + row);
//			model.removeRow(row);
//		}
		
	}
}
