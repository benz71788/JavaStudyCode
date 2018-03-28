package ex21_5_3_FlowLayout2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//FlowLayout ����ϴ� ���α׷�
//�¿��� ��� ������Ʈ�� �迭�ϴٰ� ���� ���ڶ�� ���� �ٲ㼭 ��� �迭�ϴ� ���̿�
//�����̳��� ũ�Ⱑ ����Ǹ� ������Ʈ���� ��ġ�� ���ϰ� ũ��� �����ȴ�.
public class WindowExample extends JFrame{
	
	WindowExample(){
		super("����ó ���α׷�");
		
		setPreferredSize(new Dimension(400, 250));
		setLocation(500, 400);
		
		Container contentPane = getContentPane();
		
		//�г��� �����Ѵ�
		JPanel panel = new JPanel();
		//�г��� 3�� 2���� GridLayout�� �����Ѵ�.
		panel.setLayout(new GridLayout(3, 2));
		
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		
		//�гο� ���� �߰��Ѵ�.
		panel.add(new JLabel("�̸�"));
		//�гο� text1 ������Ʈ�� �߰��Ѵ�.
		panel.add(text1);
		
		panel.add(new JLabel("�ּ�"));
		panel.add(text2);
		
		panel.add(new JLabel("��ȭ��ȣ"));
		panel.add(text3);
		
		//contentPane���� �г��� BorderLayout.CENTER�� �߰��Ѵ�.
		contentPane.add(panel, BorderLayout.CENTER);
		
		//contentPane���� �Է� ��ư�� BorderLayout.SOUTH�� �߰��Ѵ�.
		contentPane.add(new JButton("�Է�"), BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}

}
