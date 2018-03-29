package ex21_7_with_db_Search2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddActionListener implements ActionListener{
	JTable table;
	JTextField nameText;
	JTextField ageText;
	JTextField sexText;
	AddActionListener(JTable table, JTextField nameText, JTextField ageText, JTextField sexText){
		this.table = table;
		this.nameText = nameText;
		this.ageText = ageText;
		this.sexText = sexText;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		Object[] data = {nameText.getText(),
						ageText.getText(),
						sexText.getText()
		};
	}
}
