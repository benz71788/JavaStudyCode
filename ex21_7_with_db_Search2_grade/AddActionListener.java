//추가 버튼을 처리하는 리스너 클래스
package ex21_7_with_db_Search2_grade;
import java.awt.event.*;        
import javax.swing.*;        
import javax.swing.table.*;        
class AddActionListener implements ActionListener {
    JTable table;
    JTextField text1, text2, text3, text4;
    AddActionListener(JTable table, JTextField text1, 
                      JTextField text2, JTextField text3, JTextField text4) {
        this.table = table;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
    }
    
    //추가 버튼을 클릭했을 때 처리하는 메소드입니다.
    public void actionPerformed(ActionEvent e) {
    	String arr[] = new String[5];
    	 arr[1] = text1.getText(); //이름
         arr[2] = text2.getText(); //국어
         arr[3] = text3.getText(); //영어
         arr[4] = text4.getText(); //수학
         
        JdbcEx7 jd = new JdbcEx7();
        //입력한 자료들을 DB에 삽입합니다.
        //jd.infoinsert(arr)의 반환형이 int형 -> String형 변환해서 String 배열의 arr[0]에 저장합니다.
        arr[0] = String.valueOf(jd.infoinsert(arr));
        
        Object[][] data= jd.infoselect();
              
        DefaultTableModel model = 
        		(DefaultTableModel) table.getModel();
        
        int num = table.getRowCount();
        model.addRow(data[num]);
        text1.setText("");
        text2.setText("");
        text3.setText("");
        text4.setText("");
    }
}

