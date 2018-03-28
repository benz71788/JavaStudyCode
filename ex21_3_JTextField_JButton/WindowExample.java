package ex21_3_JTextField_JButton;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WindowExample extends JFrame{
	WindowExample(){
		
		//타이틀이 있는 프레임 생성한다.
		super("Hello Program");
		
		setPreferredSize(new Dimension(300, 200));
		
		//윈도우의 위치를 지정한다.
		setLocation(500, 400);
		
		//프레임에 있는 content Pane을 가져온다.
		Container contentPane = getContentPane();
		
		//텍스트 상자를 생성한다.
		JTextField text = new JTextField();
		
		//버튼에 표시할 텍스트를 생성자 파라미터로 넘겨준다.
		JButton button = new JButton("확인");
		
		//라벨에 표시할 텍스트를 생성자 파라미터로 넘겨준다.
		JLabel label = new JLabel("Hello");
		
		//컴포넌트를 배치한다.
		contentPane.add(text, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.EAST);
		contentPane.add(label, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
