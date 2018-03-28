package ex21_3_JTextField_JButton;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WindowExample extends JFrame{
	WindowExample(){
		
		//Ÿ��Ʋ�� �ִ� ������ �����Ѵ�.
		super("Hello Program");
		
		setPreferredSize(new Dimension(300, 200));
		
		//�������� ��ġ�� �����Ѵ�.
		setLocation(500, 400);
		
		//�����ӿ� �ִ� content Pane�� �����´�.
		Container contentPane = getContentPane();
		
		//�ؽ�Ʈ ���ڸ� �����Ѵ�.
		JTextField text = new JTextField();
		
		//��ư�� ǥ���� �ؽ�Ʈ�� ������ �Ķ���ͷ� �Ѱ��ش�.
		JButton button = new JButton("Ȯ��");
		
		//�󺧿� ǥ���� �ؽ�Ʈ�� ������ �Ķ���ͷ� �Ѱ��ش�.
		JLabel label = new JLabel("Hello");
		
		//������Ʈ�� ��ġ�Ѵ�.
		contentPane.add(text, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.EAST);
		contentPane.add(label, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
