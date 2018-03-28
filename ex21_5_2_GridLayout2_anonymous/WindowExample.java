package ex21_5_2_GridLayout2_anonymous;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
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
		
		JButton b1 = new JButton("호랑이");
		JButton b2 = new JButton("얼룩말");
		JButton b3 = new JButton("강아지");
		JButton b4 = new JButton("코끼리");
		JButton b5 = new JButton("고양이");
		JButton b6 = new JButton("사자");
		
		JLabel label = new JLabel("Hello");
		label.setFont(new Font("굴림", Font.BOLD, 20));
		
		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
		contentPane.add(b4);
		contentPane.add(b5);
		contentPane.add(b6);
		contentPane.add(label);
		
		
		ActionListener listener =
				new ActionListener() {

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
		};
		
		//리스너를 등록한다.
		//버튼을 클릭했을때 이벤트가 발생한다.
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		b5.addActionListener(listener);
		b6.addActionListener(listener);

		//종료버튼을 클릭했을 경우 윈도우가 닫혀지고 프로그램이 종료 되도록 한다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
