//�߰� ��ư�� ó���ϴ� ������ Ŭ����
package ex21_7_with_db_Search_professor;
import java.awt.event.*;        
import javax.swing.*;        
import javax.swing.table.*;        
class AddActionListener implements ActionListener {
    JTable table;
    JTextField text1, text2, text3;
    AddActionListener(JTable table, JTextField text1, 
                      JTextField text2, JTextField text3) {
        this.table = table;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
    }
    
    //�߰� ��ư�� Ŭ������ �� ó���ϴ� �޼ҵ��Դϴ�.
    public void actionPerformed(ActionEvent e) {
    	String arr[] = new String[4];
    	 arr[1] = text1.getText(); //�̸�
         arr[2] = text2.getText(); //����
         arr[3] = text3.getText(); //����
         
        JdbcEx7 jd = new JdbcEx7();
        //�Է��� �ڷ���� DB�� �����մϴ�.
        //jd.infoinsert(arr)�� ��ȯ���� int�� -> String�� ��ȯ�ؼ� String �迭�� arr[0]�� �����մϴ�.
        arr[0] = String.valueOf(jd.infoinsert(arr));
              
        DefaultTableModel model = 
        		(DefaultTableModel) table.getModel();
        model.addRow(arr);
        text1.setText("");
        text2.setText("");
        text3.setText("");
    }
}

