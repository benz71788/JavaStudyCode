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

//���̺� ���� �߰�/�����ϴ� ������ ���α׷�
//���̺��� �߰��� DefaultTableModel1 Ŭ������ addRow �޼ҵ��
//insertRow�޼ҵ带 ȣ���Ѵ�.
//���̺� �ִ� Ư�� ���� �����ϱ� ���ؼ��� DefaultTableModel Ŭ������
//removeRow �޼ҵ带 ����Ѵ�.
public class WindowExample extends JFrame{
	
	WindowExample(){
		super("������ ��� ���α׷�");
		setPreferredSize(new Dimension(400, 200));
		setLocation(500, 400);
		Container contentPane = getContentPane();
		
		//���̺� �����ؼ� contentPane�� �߰��ϳ�.
		String colNames[] = {"�̸�", "����", "����"};
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		
		JTable table = new JTable(model);
		
		//contentPane�� JScrollPane�� BorderLayout.CENTER�� ��ġ�Ѵ�.
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		
		//�г�, TextField, Button �����Ѵ�.
		JPanel panel = new JPanel();
		
		JTextField nameText = new JTextField(6);
		JTextField ageText = new JTextField(3);
		JTextField sexText = new JTextField(2);
		
		JButton addButton = new JButton("�߰�");
		JButton delButton = new JButton("����");
		
//		panel.setLayout(new FlowLayout());
		
		//�гο� ������ ���� ������Ʈ���� �߰��Ѵ�.
		panel.add(new JLabel("�̸�"));
		panel.add(nameText);
		panel.add(new JLabel("����"));
		panel.add(ageText);
		panel.add(new JLabel("����"));
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
