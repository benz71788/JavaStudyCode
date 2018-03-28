package ex21_4_NoButton_ActionListener2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfirmButtonActionListener implements ActionListener{
	
	JTextField text;
	JLabel label;
	//1�ܰ�
	ConfirmButtonActionListener(JTextField text, JLabel label){
		this.text = text;
		this.label = label;
	}
	
	//2�ܰ�
	//��ư�� Ŭ������ ��� �ؾ��� ���� ����Ѵ�.
	//��ư�� Ŭ���ϸ� �ڵ����� JVM�� ���� ȣ��ȴ�.
	@Override
	public void actionPerformed(ActionEvent e) {
		//�ؽ�Ʈ ������ �ؽ�Ʈ�� �������� �޼ҵ��̴�.
		String name = text.getText();
		
		//�󺧿� ������ �ؽ�Ʈ�� �ٲٴ� �޼ҵ��̴�.
		label.setText("Hello, " + name);
	}
	

}
