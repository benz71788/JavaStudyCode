package ex21_7_with_db_Search2_grade;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class WindowExample extends JFrame{
	WindowExample(){
		super("참가자 명단 프로그램");
		setPreferredSize(new Dimension(700, 300));
		setLocation(500, 400);
		Container contentPane = getContentPane();
		
		String[] colNames = {"번호", "이름", "국어", "영어", "수학", "합계", "평균", "학점"};
	    
	    Object[][] data;
		
		JdbcEx7 je = new JdbcEx7();
		data = je.infoselect();
		
		DefaultTableModel model =
				new DefaultTableModel(colNames, 0);
		
		JTable table = new JTable(model);
		
		for(int i = 0; i < data.length; i++) {
			model.addRow(data[i]);
		}
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel jp = new JPanel();
		JPanel panel = new JPanel();
		
		JLabel nameLabel = new JLabel("이름");
		JLabel korLabel = new JLabel("국어");
		JLabel engLabel = new JLabel("영어");
		JLabel mathLabel = new JLabel("수학");
		
		JTextField nameText = new JTextField(6);
		JTextField korText = new JTextField(3);
		JTextField engText = new JTextField(3);
		JTextField mathText = new JTextField(3);
		
		JButton addButton = new JButton("추가");
		JButton delButton = new JButton("삭제");
		JButton updButton = new JButton("수정");
		
		JTextField input = new JTextField(20);
	    JButton search = new JButton("검색어");
	    JComboBox<String> combo = new JComboBox<String>(colNames);
	    
	    jp.add(combo);
	    jp.add(input);
	    jp.add(search);
		
		panel.add(nameLabel);
		panel.add(nameText);
		panel.add(korLabel);
		panel.add(korText);
		panel.add(engLabel);
		panel.add(engText);
		panel.add(mathLabel);
		panel.add(mathText);
		
		panel.add(addButton);
		panel.add(delButton);
		panel.add(updButton);
		
		contentPane.add(jp, BorderLayout.NORTH);
		
		contentPane.add(panel, BorderLayout.SOUTH);
		
		search.addActionListener(new SearchActionListener(table, input, combo));
		
		addButton.addActionListener(new AddActionListener(table, nameText, korText, engText, mathText));
		
		delButton.addActionListener(new RemoveActionListener(table));
		
		updButton.addActionListener(new UpdateActionListener(table));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
