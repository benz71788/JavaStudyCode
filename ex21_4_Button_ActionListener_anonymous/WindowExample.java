package ex21_4_Button_ActionListener_anonymous;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ex21_4_Button_ActionListener.ConfirmButtonActionListener;

public class WindowExample extends JFrame{
	
	WindowExample(){
		super("Hello Programe - ��ư �̺�Ʈ");
		
		setPreferredSize(new Dimension(200, 150));
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
		
		/*
		 * 3�ܰ� �̺�Ʈ ������(Event Listener - �̺�Ʈ ������):
		 * 		�̺�Ʈ�� ó���ϴ� Ŭ����(�̺�Ʈ �ڵ鷯)�� ��ü��
		 * 		�̺�Ʈ�� �����ϰ� ó���Ѵ�.
		 * �̺�Ʈ �ڵ鷯�� �̺�Ʈ �����ʷ� �̺�Ʈ �ҽ�(Event Source - �̺�Ʈ �߻���)��
		 * 	�����ؾ� �̺�Ʈ�� �߻����� �� �̺�Ʈ�� ó���ȴ�.
		 * ���⼭ �̺�Ʈ �ҽ��� button,
		 * 	�̺�Ʈ �ڵ鷯�� confirmButtonActionListener,
		 * 	�̺�Ʈ �����ʴ� listener �̴�.
		 */
		
		//Ȯ�� ��ư ó�� �����ʸ� �����Ѵ�.
//		ActionListener listener = new ConfirmButtonActionListener(text, label);
		
		//�̺�Ʈ �����ʸ� ����Ѵ�.
		//��ư�� Ŭ������ �� �̺�Ʈ�� �߻��Ѵ�.
		//�̺�Ʈ �ҽ�(Event Source - �̺�Ʈ �߻���): �̺�Ʈ�� �߻��� ������Ʈ
		//����ڰ� Button�� ������ �� �̺�Ʈ�� �߻��ϰ� Button��
		//�̺�Ʈ�� �ҽ��� �ȴ�.
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�ؽ�Ʈ ������ �ؽ�Ʈ�� �������� �޼ҵ��̴�.
				String name = text.getText();
				
				//�󺧿� ������ �ؽ�Ʈ�� �ٲٴ� �޼ҵ��̴�.
				label.setText("Hello, " + name);
			}});
		
		//�����ư�� Ŭ������ ��� �����찡 �������� ���α׷��� ���� �ǵ��� �Ѵ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new WindowExample();
	}

}
