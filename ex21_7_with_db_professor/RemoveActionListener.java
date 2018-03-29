//삭제 버튼을 처리하는 리스너 클래스
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
		// 선택한 행을 구해옵니다.
		int row = table.getSelectedRow();

		if (row == -1)
			return;

		DefaultTableModel model = (DefaultTableModel) table.getModel();

		Object index = model.getValueAt(row, 0);

		// DB삭제 메소드 호출합니다.
		JdbcEx5 je = new JdbcEx5();
		je.infodelete(index);
		System.out.println("선택된 행=" + row);

		model.removeRow(row); // 선택된 행을 테이블로 부터 삭제합니다.
		// model.removeRow(2); //선택된 행을 테이블로 부터 삭제합니다.
	}
}
