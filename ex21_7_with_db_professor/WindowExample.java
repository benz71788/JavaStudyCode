package ex21_7_with_db_professor;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class WindowExample extends JFrame{
	WindowExample(){
		super("������ ��� ���α׷�");
		setPreferredSize(new Dimension(500, 200));
		setLocation(500, 400);
		Container contentPane = getContentPane();
		
		String[] colNames = {"��ȣ", "�̸�", "����", "����"};
		
		Object[][] data;
		
		JdbcEx5 je = new JdbcEx5();
		data = je.infoselect();
		
		DefaultTableModel model =
				new DefaultTableModel(colNames, 0);
		
		JTable table = new JTable(model);
		
		for(int i = 0; i < data.length; i++) {
			model.addRow(data[i]);
		}
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		
		JLabel nameLabel = new JLabel("�̸�");
		JLabel ageLabel = new JLabel("����");
		JLabel sexLabel = new JLabel("����");
		
		JTextField nameText = new JTextField(6);
		JTextField ageText = new JTextField(3);
		JTextField sexText = new JTextField(2);
		
		JButton addButton = new JButton("�߰�");
		JButton delButton = new JButton("����");
		JButton updButton = new JButton("����");
		
		panel.add(nameLabel);
		panel.add(nameText);
		panel.add(ageLabel);
		panel.add(ageText);
		panel.add(sexLabel);
		panel.add(sexText);
		
		panel.add(addButton);
		panel.add(delButton);
		panel.add(updButton);
		
		contentPane.add(panel, BorderLayout.SOUTH);
		
		addButton.addActionListener(new AddActionListener(table, nameText, ageText, sexText));
		
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
