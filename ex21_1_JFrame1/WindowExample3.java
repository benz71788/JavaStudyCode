package ex21_1_JFrame1;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowExample3 extends JFrame{
	WindowExample3(){
		//����Ŭ������ ������ ���ڰ����� Ÿ��Ʋ ������ �� �ִ�.
		//super("�̰��� Ÿ�̵���̴�.");
		
		//�޼ҵ带 �̿��� Ÿ��Ʋ ���� ���
		setTitle("�̰���");
		
		//���� �����ϴ� ���̴�.
		JLabel label = new JLabel("Hello, Java");
		
		Container contentPane = getContentPane();
		contentPane.add(label);
		
		//�������� ���÷��̸� �ϸ� �� ���� �ִ� ������Ʈ�鵵 �ڵ����� ���÷��� �ȴ�.
		//�����ӿ� �����ִ� ������Ʈ���� ũ�⿡ �°� �������� ũ�⸦ �����Ѵ�.
		//�������� ������ ũ��� ����� �޼ҵ��̴�.
		pack();
		
		//�������� ���÷����Ѵ�.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample3();
	}
}
