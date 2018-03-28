package ex21_6_with_db.copy;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class WindowExample extends JFrame{
	
	WindowExample(){
		super("참가자 명단 프로그램");
		setPreferredSize(new Dimension(400, 200));
		setLocation(500, 400);
		Container contentPane = getContentPane();
		
		String[] colNames = {"DEPTNO", "DEPTNAME", "COLLEAGE", "LOC"};
		
		Object[][] data;
		
		JdbcEx4 je = new JdbcEx4();
		data = je.getData();
		
		JTable table = new JTable(data, colNames);
		
		JButton button = new JButton("출력");
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		button.addActionListener(new PrintActionListener(table));
		
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		contentPane.add(button, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);

		
	}	
	public static void main(String[] args) {
		new WindowExample();
	}

}
