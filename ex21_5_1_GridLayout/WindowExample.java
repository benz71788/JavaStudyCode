package ex21_5_1_GridLayout;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

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
		GridLayout layout = new GridLayout(3, 2);
		
		//contentPane�� 3�� 2���� GridLayout�� �����Ѵ�.
		contentPane.setLayout(layout);
		
		//contentPane�� 3�� 2���� GridLayout���� ��ư�� �߰��Ѵ�.
		contentPane.add(new JButton("ȣ����"));
		contentPane.add(new JButton("��踻"));
		contentPane.add(new JButton("������"));
		contentPane.add(new JButton("�ڳ���"));
		contentPane.add(new JButton("�����"));
		contentPane.add(new JButton("����"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
