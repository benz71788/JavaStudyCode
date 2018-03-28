package ex21_5_3_FlowLayout2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//FlowLayout 사용하는 프로그램
//좌에서 우로 컴포넌트를 배열하다가 폭이 모자라면 줄을 바꿔서 계속 배열하는 레이웃
//컨테이너의 크기가 변경되면 컴포턴트들의 위치는 변하고 크기는 고정된다.
public class WindowExample extends JFrame{
	
	WindowExample(){
		super("연락처 프로그램");
		
		setPreferredSize(new Dimension(400, 250));
		setLocation(500, 400);
		
		Container contentPane = getContentPane();
		
		//패널을 생성한다
		JPanel panel = new JPanel();
		//패널을 3행 2열의 GridLayout로 설정한다.
		panel.setLayout(new GridLayout(3, 2));
		
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		
		//패널에 라벨을 추가한다.
		panel.add(new JLabel("이름"));
		//패널에 text1 컴포넌트를 추가한다.
		panel.add(text1);
		
		panel.add(new JLabel("주소"));
		panel.add(text2);
		
		panel.add(new JLabel("전화번호"));
		panel.add(text3);
		
		//contentPane위에 패널을 BorderLayout.CENTER에 추가한다.
		contentPane.add(panel, BorderLayout.CENTER);
		
		//contentPane위에 입력 버튼을 BorderLayout.SOUTH에 추가한다.
		contentPane.add(new JButton("입력"), BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}

}
