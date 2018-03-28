package ex21_5_3_FlowLayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//FlowLayout ����ϴ� ���α׷�
//�¿��� ��� ������Ʈ�� �迭�ϴٰ� ���� ���ڶ�� ���� �ٲ㼭 ��� �迭�ϴ� ���̿�
//�����̳��� ũ�Ⱑ ����Ǹ� ������Ʈ���� ��ġ�� ���ϰ� ũ��� �����ȴ�.
public class WindowExample extends JFrame{
	
	WindowExample(){
		super("Fruit Basket Program");
		setLocation(500, 400);
		Container contentPane = getContentPane();
		
		//FlowLayout ��ü �����Ѵ�.
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		
		//ContentPane�� FlowLayout���� �����Ѵ�
		contentPane.setLayout(layout);
		
		//ContentPane�� FlowLayout���� ��ư�� �߰��Ѵ�.
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("���"));
		contentPane.add(new JButton("������"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("���ξ���"));
		contentPane.add(new JButton("������"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}

}
