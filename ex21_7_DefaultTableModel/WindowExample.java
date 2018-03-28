package ex21_7_DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

//테이블에 행을 추가/삭제하는 윈도우 프로그램
//테이블의 추가는 DefaultTableModel1 클래스의 addRow 메소드와
//insertRow메소드를 호출한다.
//테이블에 있는 특정 행을 삭제하기 위해서는 DefaultTableModel 클래스의
//removeRow 메소드를 사용한다.
public class WindowExample extends JFrame{
	
	WindowExample(){
		super("참가자 명단 프로그램");
		setPreferredSize(new Dimension(400, 200));
		setLocation(500, 400);
		Container contentPane = getContentPane();
		
		//테이블 생성해서 contentPane에 추가하낟.
		String colNames[] = {"이름", "나이", "성별"};
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		
		JTable table = new JTable(model);
		
		//contentPane에 JScrollPane을 BorderLayout.CENTER로 배치한다.
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		
		//패널, TextField, Button 생성한다.
		JPanel panel = new JPanel();
		
		JTextField nameText = new JTextField(6);
		JTextField ageText = new JTextField(3);
		JTextField sexText = new JTextField(2);
		
		JButton addButton = new JButton("추가");
		JButton delButton = new JButton("삭제");
		
//		panel.setLayout(new FlowLayout());
		
		//패널에 위에서 만든 컴포넌트들을 추가한다.
		panel.add(new JLabel("이름"));
		panel.add(nameText);
		panel.add(new JLabel("나이"));
		panel.add(ageText);
		panel.add(new JLabel("성별"));
		panel.add(sexText);
		
		panel.add(addButton);
		panel.add(delButton);
		
		contentPane.add(panel, BorderLayout.SOUTH);
		
		addButton.addActionListener(new AddActionListener(table, nameText, ageText, sexText));
		
		delButton.addActionListener(new RemoveActionListener(table));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
