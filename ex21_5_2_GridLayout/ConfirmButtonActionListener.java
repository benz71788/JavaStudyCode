package ex21_5_2_GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ConfirmButtonActionListener implements ActionListener{
	
	JButton button;
	JLabel label;
	//1단계
	ConfirmButtonActionListener(JButton button, JLabel label){
		this.button = button;
		this.label = label;
	}
	
	//2단계
	//버튼을 클릭했을 경우 해야할 일을 기술한다.
	//버튼을 클릭하면 자동으로 JVM에 의해 호출된다.
	@Override
	public void actionPerformed(ActionEvent e) {
		//텍스트 상자의 텍스트를 가져오는 메소드이다.
		String name = button.getText();
		
		//라벨에 쓰여진 텍스트를 바꾸는 메소드이다.
		label.setText("Hello, " + name);
	}
	

}
