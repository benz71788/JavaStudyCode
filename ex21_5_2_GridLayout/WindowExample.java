package ex21_5_2_GridLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//GridLayout�� ����ϴ� ���α׷�
//�־��� ������ �Ȱ��� ũ���� ��� ���� ������,
//������Ʈ���� �� ũ�⿡ �°� ���� ��ġ�ϴ� ���̾ƿ�
public class WindowExample extends JFrame{
	WindowExample(){
		super("Zoo Programe");
		setLocation(500, 400);
		setPreferredSize(new Dimension(500, 600));
		Container contentPane = getContentPane();
		
		//3�� 2���� GridLayout �����Ѵ�.
		GridLayout layout = new GridLayout(3, 3);
		//contentPane�� 3�� 3���� GridLayout�� �����Ѵ�.
		contentPane.setLayout(layout);
		
		contentPane.setBackground(new Color(255, 128, 0));
		
		//contentPane�� 3�� 2���� GridLayout���� ��ư�� �߰��Ѵ�.
		
		JButton[] b = new JButton[6];
		b[0] = new JButton("ȣ����");
		b[1] = new JButton("��踻");
		b[2] = new JButton("������");
		b[3] = new JButton("�ڳ���");
		b[4] = new JButton("�����");
		b[5] = new JButton("����");
		
		JLabel label = new JLabel("Hello");
		label.setFont(new Font("����", Font.BOLD, 20));
		
		for(int i = 0; i < b.length; i++) {
			contentPane.add(b[i]);
		}
		contentPane.add(label, BorderLayout.SOUTH);
		
		ActionListener[] listener = new ConfirmButtonActionListener[b.length];
		for(int i = 0; i < b.length; i++) {
			listener[i] = new ConfirmButtonActionListener(b[i], label);
			b[i].addActionListener(listener[i]);
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
