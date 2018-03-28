package ex21_2_Frame1;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WindowExample extends JFrame{
	WindowExample(){
		//Ÿ��Ʋ�� �ִ� ������ �����Ѵ�.
		super("Hello Java Program");
		
		//�������� ��ġ�� �����Ѵ�.
		setLocation(100, 200);	//(x��ǥ, y��ǥ)
		
		//�������� ũ�⸦ �ٲ۴�.
		//java.awt.Dimension(int width, int height) - ����, ����
		setPreferredSize(new Dimension(800, 500));
		
		//�� ��° �Ķ���ͷ� ���� ���ڿ��� �߾ӿ� ǥ���ϵ��� �Ѵ�.
		JLabel label = new JLabel("�ȳ��ϼ���? �ڹٴ�", SwingConstants.CENTER);
		label.setFont(new Font("�ü�", Font.BOLD, 50));
		
		//�����ӿ� �ִ� content pane�� �����´�.
		Container contentPane = getContentPane();
		//���� content pane���� �÷����´�.
		contentPane.add(label);
		
		//�����ư�� Ŭ������ ��� �����찡 �������� ���α׷��� ���� �ǵ��� �Ѵ�.
		//setDefaultCloseOperation - ���� ��ư�� ������ �� �ؾ� �� ���� �����ϴ� �޼ҵ�
		//EXIT_ON_CLOSE - �ݱ� ��ư�� Ŭ������ �� ����(exit)�϶�� �ǹ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�������� ���÷����ϸ� �� ���� �ִ� ������Ʈ�鵵 �ڵ����� ���÷��� �ȴ�.
		//�����ӿ� �����ִ� ������Ʈ���� ũ�⿡ �°� �������� ũ�⸦ �����Ѵ�.
		//�������� ������ ũ��� ���� �޼ҵ��̴�.
		pack();
		
		//�������� ���÷����Ѵ�.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
