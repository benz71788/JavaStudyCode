package ex21_1_JFrame1;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowExample3 extends JFrame{
	WindowExample3(){
		//슈퍼클래스의 생성자 인자값으로 타이틀 설정할 수 있다.
		//super("이곳은 타이들바이다.");
		
		//메소드를 이용한 타이틀 설정 방법
		setTitle("이곳은");
		
		//라벨을 생성하는 식이다.
		JLabel label = new JLabel("Hello, Java");
		
		Container contentPane = getContentPane();
		contentPane.add(label);
		
		//프레임을 디스플레이를 하면 그 위에 있는 컴포넌트들도 자동으로 디스플레이 된다.
		//프레임에 속해있는 컴포넌트들의 크기에 맞게 프레임의 크기를 조정한다.
		//프레임을 적당한 크기로 만드는 메소드이다.
		pack();
		
		//프레임을 디스플레이한다.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample3();
	}
}
