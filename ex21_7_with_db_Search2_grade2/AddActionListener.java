package ex21_7_with_db_Search2_grade2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddActionListener implements ActionListener{
	JTable table;
	JTextField nameText;
	JTextField korText;
	JTextField engText;
	JTextField mathText;
	AddActionListener(JTable table, JTextField nameText, JTextField korText, JTextField engText, JTextField mathText){
		this.table = table;
		this.nameText = nameText;
		this.korText = korText;
		this.engText = engText;
		this.mathText = mathText;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
	}

}
