package ex21_4_Button_ActionListener_anonymous;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ex21_4_Button_ActionListener.ConfirmButtonActionListener;

public class WindowExample extends JFrame{
	
	WindowExample(){
		super("Hello Programe - 버튼 이벤트");
		
		setPreferredSize(new Dimension(200, 150));
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
		
		/*
		 * 3단계 이벤트 리스너(Event Listener - 이벤트 감지기):
		 * 		이벤트를 처리하는 클래스(이벤트 핸들러)의 객체로
		 * 		이벤트를 감지하고 처리한다.
		 * 이벤트 핸들러를 이벤트 리스너로 이벤트 소스(Event Source - 이벤트 발생지)에
		 * 	연결해야 이벤트가 발생했을 때 이벤트가 처리된다.
		 * 여기서 이벤트 소스는 button,
		 * 	이벤트 핸들러는 confirmButtonActionListener,
		 * 	이벤트 리스너는 listener 이다.
		 */
		
		//확인 버튼 처리 리스너를 생성한다.
//		ActionListener listener = new ConfirmButtonActionListener(text, label);
		
		//이벤트 리스너를 등록한다.
		//버튼을 클릭했을 때 이벤트가 발생한다.
		//이벤트 소스(Event Source - 이벤트 발생지): 이벤트가 발생한 컴포넌트
		//사용자가 Button을 눌렀을 때 이벤트가 발생하고 Button은
		//이벤트의 소스가 된다.
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//텍스트 상자의 텍스트를 가져오는 메소드이다.
				String name = text.getText();
				
				//라벨에 쓰여진 텍스트를 바꾸는 메소드이다.
				label.setText("Hello, " + name);
			}});
		
		//종료버튼을 클릭했을 경우 윈도우가 닫혀지고 프로그램이 종료 되도록 한다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new WindowExample();
	}

}
