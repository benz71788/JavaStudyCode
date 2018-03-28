package ex21_5_1_GridLayout;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

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
		GridLayout layout = new GridLayout(3, 2);
		
		//contentPane을 3행 2열의 GridLayout로 설정한다.
		contentPane.setLayout(layout);
		
		//contentPane에 3행 2열의 GridLayout으로 버튼을 추가한다.
		contentPane.add(new JButton("호랑이"));
		contentPane.add(new JButton("얼룩말"));
		contentPane.add(new JButton("강아지"));
		contentPane.add(new JButton("코끼리"));
		contentPane.add(new JButton("고양이"));
		contentPane.add(new JButton("사자"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
