package ex21_7_DefaultTableModel2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddActionListener implements ActionListener{
	
	JTable table;
	JTextField nameText;
	JTextField ageText;
	JTextField sexText;
	
	AddActionListener(JTable table, JTextField nameText, 
			JTextField ageText, JTextField sexText){
		this.table = table;
		this.nameText = nameText;
		this.ageText = ageText;
		this.sexText = sexText;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model =
				(DefaultTableModel) table.getModel();
		
		Object[] rowData = {nameText.getText(), 
							ageText.getText(),
							sexText.getText()};
		
		model.addRow(rowData);
		
//		int rowNum = model.getRowCount();
//		
//		int colNum = model.getColumnCount();
//		
//		for(int i = 0; i < rowNum; i++) {
//			model.addRow(rowData[i]);
//		}
	}

}
