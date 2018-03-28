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
	
	//출력 버튼 클릭시 발생하는 이벤트 처리 메소드이다.
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//테이블의 모델(테이블의 내용이 저장된 객체)을 가져온다.
		TableModel model = table.getModel();
		
		//모델의 행의 수를 가져온다.
		int rowNum = model.getRowCount();
		
		//모델의 열의 수를 가져온다.
		int colNum = model.getColumnCount();
		
		//열의 수 만큼 반복한다.
		//getColumnName(col) : col번째 컬럼 이름을 가져온다.
		for(int col = 0; col < colNum; col++) {
			String colName = model.getColumnName(col);
			System.out.print(colName + "\t");
		}
		System.out.println();
		
		//getValueAt(row, col) : row행, col열에 위치한 값을 가져온다.
		for(int row = 0; row < rowNum; row++) {
			for(int col = 0; col < colNum; col++) {
				Object obj = model.getValueAt(row, col);
				System.out.print(obj + "\t");
			}
			System.out.println();
		}
	}

}
