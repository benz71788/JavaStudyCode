package ex21_1_JFrame1;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

//윈도우로 작동하는 Hello, Java 프로그램
//실행하면 바탕화면 왼쪽 상단에 윈도우가 나타난다
//종료버튼 클릭시 윈도우는 사라지지만 프로그램은 종료되지 않는다.
//강제 종료는 console창에서 빨간 버튼 클릭
public class WindowExample1 {
	
	public static void main(String[] args) {
		
		//타이들이 있는 프레임 생성한다.
		JFrame frame = new JFrame("This is a Title bar");
		//타이틀이 없는 프레임 생성한다.
		//JFame frame = new JFrame();
		
		//라벨을 생성하는 식이다.
		JLabel label = new JLabel("Hello, Java");
		
		//프레임에 있는 content pane을 가져온다.
		//Container는 java.awt패키지에 속하는 클래스 이름이다.
		Container contentPane = frame.getContentPane();
		 
		//라벨을 content pane위에 올려놓는다.
		contentPane.add(label);
		
		//프레임을 디스플레이를 하면 그 위에 있는 컴포넌트들도 자동으로 디스플레이 된다.
		//프레임에 속해있는 컴포넌트들의 크기에 맞게 프레임의 크기를 조정한다.
		//프레임을 적당한 크기로 만다는 메소드이다.
		frame.pack();
		
		//프레임을 디스플레이한다.
		frame.setVisible(true);
	}

}
