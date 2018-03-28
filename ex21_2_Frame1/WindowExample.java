package ex21_2_Frame1;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WindowExample extends JFrame{
	WindowExample(){
		//타이틀이 있는 프레임 생성한다.
		super("Hello Java Program");
		
		//윈도우의 위치를 지정한다.
		setLocation(100, 200);	//(x좌표, y좌표)
		
		//윈도우의 크기를 바꾼다.
		//java.awt.Dimension(int width, int height) - 넓이, 높이
		setPreferredSize(new Dimension(800, 500));
		
		//두 번째 파라미터로 라벨의 문자열을 중앙에 표시하도록 한다.
		JLabel label = new JLabel("안녕하세요? 자바님", SwingConstants.CENTER);
		label.setFont(new Font("궁서", Font.BOLD, 50));
		
		//프레임에 있는 content pane을 가져온다.
		Container contentPane = getContentPane();
		//라벨을 content pane위에 올려놓는다.
		contentPane.add(label);
		
		//종료버튼을 클릭했을 경우 윈도우가 닫혀지고 프로그램이 종료 되도록 한다.
		//setDefaultCloseOperation - 종료 버튼을 눌렀을 때 해야 할 일을 지시하는 메소드
		//EXIT_ON_CLOSE - 닫기 버튼을 클릭했을 때 종료(exit)하라는 의미
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임을 디스플레이하면 그 위에 있는 컴포넌트들도 자동으로 디스플레이 된다.
		//프레임에 속해있는 컴포넌트들의 크기에 맞게 프레임의 크기를 조정한다.
		//프레임을 적당한 크기로 만든 메소드이다.
		pack();
		
		//프레임을 디스플레이한다.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
