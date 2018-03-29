//JTable - ǥ ���·� �����͸� �����ִ� ���̺� ������Ʈ
//DB�� �����غ���
package ex21_7_with_db_Search_professor2;
import java.awt.*;        
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import ex21_7_with_db.JdbcEx5;

class WindowExample2 extends JFrame {
	WindowExample2() {
		super("������ ��� ���α׷�");
        
        //�������� ũ�⸦ �ٲߴϴ�.
        setPreferredSize(new Dimension(500, 350));
        
        //�������� ��ġ�� �����մϴ�.
        setLocation(500, 400);
        
        //�����ӿ� �ִ� content pane�� �����ɴϴ�.
        Container contentPane = getContentPane();
        String colNames[] = {"��ȣ", "�̸�", "����", "����" };
        
        
        
       JTextField input = new JTextField(20);
       JButton search = new JButton("�˻���");
       JComboBox<String> combo = new JComboBox<String>(colNames);
  /*
     int index = combo.getSelectedIndex();
     getSelectedIndex()�� ������ �޺��ڽ��� �ε����� �� �� �ֽ��ϴ�.
     �� �޼��带 �̿��� ������.
*/
       
       JPanel jp = new JPanel();
       jp.add(combo);
       jp.add(input);
       jp.add(search);
       

       Object[][] data;
       
       JdbcEx7 je = new JdbcEx7();
       //DB�����ؼ� ������ �������� �޼ҵ�
       data=je.infoselect();
        
       DefaultTableModel model =
       		new DefaultTableModel(colNames, 0);
      
       JTable  table= new JTable(model);
       
      //DB���� ������ ������ ���̺� �߰��ϱ�
       for(int i=0; i<data.length;i++)
            model.addRow(data[i]);
        
       //���̺��� contentPane�� �߰��մϴ�.
       //contentPane�� JScrollPane��  BorderLayout.CENTER�� ��ġ�մϴ�.
       contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
       
        //contentPane�� scrollPane�� BorderLayout.NORTH�� ��ġ�մϴ�.
        contentPane.add(jp, BorderLayout.NORTH);
        
        
        search.addActionListener(new SearchActionListener(table, input, combo));
        
        
                
        //�����ư�� Ŭ������ ��� �����찡 �������� ���α׷��� ���� �ǵ��� �մϴ�.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        //�������� ������ ũ��� ����� �޼ҵ��Դϴ�.
        pack();
        
        //�������� ���÷����մϴ�.
        setVisible(true);
    }
    public static void main(String[] args) {
		WindowExample2 we = new WindowExample2();
	}
}
