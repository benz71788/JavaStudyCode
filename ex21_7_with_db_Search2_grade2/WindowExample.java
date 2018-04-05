package ex21_7_with_db_Search2_grade2;

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
		super("학업 관리 프로그램");
		setPreferredSize(new Dimension(700, 300));
		setLocation(500, 400);
		Container contentPane = getContentPane();
		
		String[] colNames = {"번호", "이름", "국어", "영어", "수학", "합계", "평균", "등급"};
		
		Object[][] data;
		
		JdbcEx8 je = new JdbcEx8();
		data = je.infoSelect();
		
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		
		JTable table = new JTable(model);
		
		for(int i = 0; i < data.length; i++) {
			model.addRow(data[i]);
		}
		
		JScrollPane scroll = new JScrollPane(table);
		
		contentPane.add(scroll, BorderLayout.CENTER);
		
		JPanel upJp = new JPanel();
		JPanel downJp = new JPanel();
		
		JLabel nameLabel = new JLabel("이름");
		JLabel korLabel = new JLabel("국어");
		JLabel engLabel = new JLabel("영어");
		JLabel mathLabel = new JLabel("수학");
		
		JTextField nameText = new JTextField(7);
		JTextField korText = new JTextField(3);
		JTextField engText = new JTextField(3);
		JTextField mathText = new JTextField(3);
		
		JButton addButton = new JButton("추가");
		JButton delButton = new JButton("삭제");
		JButton updButton = new JButton("수정");
		
		JButton searchButton = new JButton("검색");
		JTextField searchText = new JTextField(20);
		JComboBox<String> combo = new JComboBox<String>(colNames);
		
		upJp.add(combo);
		upJp.add(searchText);
		upJp.add(searchButton);
		
		downJp.add(nameLabel);
		downJp.add(nameText);
		
		downJp.add(korLabel);
		downJp.add(korText);
		
		downJp.add(engLabel);
		downJp.add(engText);
		
		downJp.add(mathLabel);
		downJp.add(mathText);
		
		downJp.add(addButton);
		downJp.add(delButton);
		downJp.add(updButton);
		
		contentPane.add(upJp, BorderLayout.NORTH);
		contentPane.add(downJp, BorderLayout.SOUTH);
		
		addButton.addActionListener(new AddActionListener(table, nameText, korText, engText, mathText));
		delButton.addActionListener(new DelActionListener(table));
//		updButton.addActionListener(new UpdateActionListener(table));
//		searchButton.addActionListener(new SearchActionListener(table, searchText, combo));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
