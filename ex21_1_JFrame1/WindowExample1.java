package ex21_1_JFrame1;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

//������� �۵��ϴ� Hello, Java ���α׷�
//�����ϸ� ����ȭ�� ���� ��ܿ� �����찡 ��Ÿ����
//�����ư Ŭ���� ������� ��������� ���α׷��� ������� �ʴ´�.
//���� ����� consoleâ���� ���� ��ư Ŭ��
public class WindowExample1 {
	
	public static void main(String[] args) {
		
		//Ÿ�̵��� �ִ� ������ �����Ѵ�.
		JFrame frame = new JFrame("This is a Title bar");
		//Ÿ��Ʋ�� ���� ������ �����Ѵ�.
		//JFame frame = new JFrame();
		
		//���� �����ϴ� ���̴�.
		JLabel label = new JLabel("Hello, Java");
		
		//�����ӿ� �ִ� content pane�� �����´�.
		//Container�� java.awt��Ű���� ���ϴ� Ŭ���� �̸��̴�.
		Container contentPane = frame.getContentPane();
		 
		//���� content pane���� �÷����´�.
		contentPane.add(label);
		
		//�������� ���÷��̸� �ϸ� �� ���� �ִ� ������Ʈ�鵵 �ڵ����� ���÷��� �ȴ�.
		//�����ӿ� �����ִ� ������Ʈ���� ũ�⿡ �°� �������� ũ�⸦ �����Ѵ�.
		//�������� ������ ũ��� ���ٴ� �޼ҵ��̴�.
		frame.pack();
		
		//�������� ���÷����Ѵ�.
		frame.setVisible(true);
	}

}
