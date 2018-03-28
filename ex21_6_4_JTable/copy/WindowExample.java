package ex21_6_4_JTable.copy;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class WindowExample extends JFrame{
	
	WindowExample(){
		super("������ ��� ���α׷�");
		setPreferredSize(new Dimension(300, 150));
		setLocation(500, 400);
		Container contentPane = getContentPane();
		
		String colNames[] = {"�̸�", "����", "����"};
		Object data[][] = { {"��ö��", 24, '��'}, 
							{"�̼���", 21, '��'},
							{"������", 26, '��'},
							{"��ö��", 24, '��'}, 
							{"�̼���", 21, '��'},
							{"������", 26, '��'} };
		
		JTable table = new JTable(data, colNames);
		//���̺��� �÷��� ScrollPane�� �����Ѵ�.
		JScrollPane scrollPane = new JScrollPane(table);
		
		JButton button = new JButton("���");
		
		button.addActionListener(new PrintActionListener(table));
		
		//contentPane�� scrollPane�� BorderLayout.CENTER�� ��ġ�Ѵ�.
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		//contentPane�� ��ư�� BorderLayout.SOUTH�� ��ġ�Ѵ�.
		contentPane.add(button,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}

}
