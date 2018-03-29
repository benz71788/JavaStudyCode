//���� ��ư�� ó���ϴ� ������ Ŭ����
package ex21_7_with_db_professor;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

class RemoveActionListener implements ActionListener {
	JTable table;

	RemoveActionListener(JTable table) {
		this.table = table;
	}

	public void actionPerformed(ActionEvent e) {
		// ������ ���� ���ؿɴϴ�.
		int row = table.getSelectedRow();

		if (row == -1)
			return;

		DefaultTableModel model = (DefaultTableModel) table.getModel();

		Object index = model.getValueAt(row, 0);

		// DB���� �޼ҵ� ȣ���մϴ�.
		JdbcEx5 je = new JdbcEx5();
		je.infodelete(index);
		System.out.println("���õ� ��=" + row);

		model.removeRow(row); // ���õ� ���� ���̺�� ���� �����մϴ�.
		// model.removeRow(2); //���õ� ���� ���̺�� ���� �����մϴ�.
	}
}
