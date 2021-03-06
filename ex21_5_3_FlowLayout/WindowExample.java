package ex21_5_3_FlowLayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//FlowLayout 사용하는 프로그램
//좌에서 우로 컴포넌트를 배열하다가 폭이 모자라면 줄을 바꿔서 계속 배열하는 레이웃
//컨테이너의 크기가 변경되면 컴포턴트들의 위치는 변하고 크기는 고정된다.
public class WindowExample extends JFrame{
	
	WindowExample(){
		super("Fruit Basket Program");
		setLocation(500, 400);
		Container contentPane = getContentPane();
		
		//FlowLayout 객체 생성한다.
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		
		//ContentPane을 FlowLayout으로 설정한다
		contentPane.setLayout(layout);
		
		//ContentPane에 FlowLayout으로 버튼을 추가한다.
		contentPane.add(new JButton("포도"));
		contentPane.add(new JButton("사과"));
		contentPane.add(new JButton("복숭아"));
		contentPane.add(new JButton("레몬"));
		contentPane.add(new JButton("파인애플"));
		contentPane.add(new JButton("오렌지"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}

}
