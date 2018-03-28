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

//GridLayout�� ����ϴ� ���α׷�
//�־��� ������ �Ȱ��� ũ���� ��� ���� ������,
//������Ʈ���� �� ũ�⿡ �°� ���� ��ġ�ϴ� ���̾ƿ�
public class WindowExample extends JFrame{
	WindowExample(){
		super("Zoo Programe");
		setLocation(500, 400);
		setPreferredSize(new Dimension(500, 600));
		Container contentPane = getContentPane();
		
		//3�� 2���� GridLayout �����Ѵ�.
		GridLayout layout = new GridLayout(3, 3);
		//contentPane�� 3�� 3���� GridLayout�� �����Ѵ�.
		contentPane.setLayout(layout);
		
		contentPane.setBackground(new Color(255, 128, 0));
		
		//contentPane�� 3�� 2���� GridLayout���� ��ư�� �߰��Ѵ�.
		
		JButton b1 = new JButton("ȣ����");
		JButton b2 = new JButton("��踻");
		JButton b3 = new JButton("������");
		JButton b4 = new JButton("�ڳ���");
		JButton b5 = new JButton("�����");
		JButton b6 = new JButton("����");
		
		JLabel label = new JLabel("Hello");
		label.setFont(new Font("����", Font.BOLD, 20));
		
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
		
		//�����ʸ� ����Ѵ�.
		//��ư�� Ŭ�������� �̺�Ʈ�� �߻��Ѵ�.
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		b5.addActionListener(listener);
		b6.addActionListener(listener);

		//�����ư�� Ŭ������ ��� �����찡 �������� ���α׷��� ���� �ǵ��� �Ѵ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
