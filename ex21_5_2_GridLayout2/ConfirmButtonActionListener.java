package ex21_5_2_GridLayout2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ConfirmButtonActionListener implements ActionListener{
	
	JButton b1, b2, b3, b4, b5, b6;
	JLabel label;
	//1단계
	ConfirmButtonActionListener(JButton b1, JButton b2, JButton b3, JButton b4, JButton b5, JButton b6, JLabel label){
		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
		this.b4 = b4;
		this.b5 = b5;
		this.b6 = b6;
		this.label = label;
	}
	
	//2단계
	//버튼을 클릭했을 경우 해야할 일을 기술한다.
	//버튼을 클릭하면 자동으로 JVM에 의해 호출된다.
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = null;
		
		if(e.getSource() == b1)
			name = b1.getText();
		else if(e.getSource() == b2)
			name = b2.getText();
		else if(e.getSource() == b3)
			name = b3.getText();
		else if(e.getSource() == b4)
			name = b4.getText();
		else if(e.getSource() == b5)
			name = b5.getText();
		else
			name = b6.getText();
		
		label.setText("Hello, " + name);
		
	}
	

}
