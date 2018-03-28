package ex21_5_2_GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ConfirmButtonActionListener implements ActionListener{
	
	JButton button;
	JLabel label;
	//1�ܰ�
	ConfirmButtonActionListener(JButton button, JLabel label){
		this.button = button;
		this.label = label;
	}
	
	//2�ܰ�
	//��ư�� Ŭ������ ��� �ؾ��� ���� ����Ѵ�.
	//��ư�� Ŭ���ϸ� �ڵ����� JVM�� ���� ȣ��ȴ�.
	@Override
	public void actionPerformed(ActionEvent e) {
		//�ؽ�Ʈ ������ �ؽ�Ʈ�� �������� �޼ҵ��̴�.
		String name = button.getText();
		
		//�󺧿� ������ �ؽ�Ʈ�� �ٲٴ� �޼ҵ��̴�.
		label.setText("Hello, " + name);
	}
	

}
