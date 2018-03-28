package ex21_6_4_JTable.copy;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class WindowExample extends JFrame{
	
	WindowExample(){
		super("참가자 명단 프로그램");
		setPreferredSize(new Dimension(300, 150));
		setLocation(500, 400);
		Container contentPane = getContentPane();
		
		String colNames[] = {"이름", "나이", "성별"};
		Object data[][] = { {"김철수", 24, '남'}, 
							{"이순희", 21, '여'},
							{"박지영", 26, '여'},
							{"김철수", 24, '남'}, 
							{"이순희", 21, '여'},
							{"박지영", 26, '여'} };
		
		JTable table = new JTable(data, colNames);
		//테이블이 올려진 ScrollPane을 생성한다.
		JScrollPane scrollPane = new JScrollPane(table);
		
		JButton button = new JButton("출력");
		
		button.addActionListener(new PrintActionListener(table));
		
		//contentPane에 scrollPane을 BorderLayout.CENTER에 배치한다.
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		//contentPane에 버튼을 BorderLayout.SOUTH에 배치한다.
		contentPane.add(button,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}

}
