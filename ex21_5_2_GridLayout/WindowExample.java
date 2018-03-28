package ex21_5_2_GridLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//GridLayout을 사용하는 프로그램
//주어진 영역을 똑같은 크기의 행과 열로 나누고,
//컴포넌트들을 그 크기에 맞게 만들어서 배치하는 레이아웃
public class WindowExample extends JFrame{
	WindowExample(){
		super("Zoo Programe");
		setLocation(500, 400);
		setPreferredSize(new Dimension(500, 600));
		Container contentPane = getContentPane();
		
		//3행 2열의 GridLayout 생성한다.
		GridLayout layout = new GridLayout(3, 3);
		//contentPane을 3행 3열의 GridLayout로 설정한다.
		contentPane.setLayout(layout);
		
		contentPane.setBackground(new Color(255, 128, 0));
		
		//contentPane에 3행 2열의 GridLayout으로 버튼을 추가한다.
		
		JButton[] b = new JButton[6];
		b[0] = new JButton("호랑이");
		b[1] = new JButton("얼룩말");
		b[2] = new JButton("강아지");
		b[3] = new JButton("코끼리");
		b[4] = new JButton("고양이");
		b[5] = new JButton("사자");
		
		JLabel label = new JLabel("Hello");
		label.setFont(new Font("굴림", Font.BOLD, 20));
		
		for(int i = 0; i < b.length; i++) {
			contentPane.add(b[i]);
		}
		contentPane.add(label, BorderLayout.SOUTH);
		
		ActionListener[] listener = new ConfirmButtonActionListener[b.length];
		for(int i = 0; i < b.length; i++) {
			listener[i] = new ConfirmButtonActionListener(b[i], label);
			b[i].addActionListener(listener[i]);
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
