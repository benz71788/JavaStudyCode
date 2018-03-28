package ex21_6_with_db.copy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.TableModel;

public class PrintActionListener implements ActionListener{

	JTable table;
	PrintActionListener(JTable table){
		this.table = table;
	}
	
	//��� ��ư Ŭ���� �߻��ϴ� �̺�Ʈ ó�� �޼ҵ��̴�.
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//���̺��� ��(���̺��� ������ ����� ��ü)�� �����´�.
		TableModel model = table.getModel();
		
		//���� ���� ���� �����´�.
		int rowNum = model.getRowCount();
		
		//���� ���� ���� �����´�.
		int colNum = model.getColumnCount();
		
		//���� �� ��ŭ �ݺ��Ѵ�.
		//getColumnName(col) : col��° �÷� �̸��� �����´�.
		for(int col = 0; col < colNum; col++) {
			String colName = model.getColumnName(col);
			System.out.print(colName + "\t");
		}
		System.out.println();
		
		//getValueAt(row, col) : row��, col���� ��ġ�� ���� �����´�.
		for(int row = 0; row < rowNum; row++) {
			for(int col = 0; col < colNum; col++) {
				Object obj = model.getValueAt(row, col);
				System.out.print(obj + "\t");
			}
			System.out.println();
		}
	}

}
