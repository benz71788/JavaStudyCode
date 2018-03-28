package ex21_7_DefaultTableModel2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class UpdateActionListener implements ActionListener{
	JTable table;
	UpdateActionListener(JTable table){
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		DefaultTableModel model =
				(DefaultTableModel) table.getModel();
		
		RemoveActionListener listener = new RemoveActionListener(table);
//		System.out.println(listener.rowData);
		
		Object[] rowData = {listener.nameText.getText(),
						listener.ageText.getText(),
						listener.sexText.getText()};
		model.addRow(rowData);
	
//		if(model.getRowCount() != 0) {
//			System.out.println("선택된 행= " + row);
//			model.removeRow(row);
//		}

	}
}
