//JTable - 표 형태로 데이터를 보여주는 테이블 컴포넌트
//DB와 연동해보기
package ex21_7_with_db_Search_professor2;
import java.awt.*;        
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import ex21_7_with_db.JdbcEx5;

class WindowExample2 extends JFrame {
	WindowExample2() {
		super("참가자 명단 프로그램");
        
        //윈도우의 크기를 바꿉니다.
        setPreferredSize(new Dimension(500, 350));
        
        //윈도우의 위치를 지정합니다.
        setLocation(500, 400);
        
        //프레임에 있는 content pane을 가져옵니다.
        Container contentPane = getContentPane();
        String colNames[] = {"번호", "이름", "나이", "성별" };
        
        
        
       JTextField input = new JTextField(20);
       JButton search = new JButton("검색어");
       JComboBox<String> combo = new JComboBox<String>(colNames);
  /*
     int index = combo.getSelectedIndex();
     getSelectedIndex()는 선택한 콤보박스의 인덱스를 알 수 있습니다.
     이 메서드를 이용해 보세요.
*/
       
       JPanel jp = new JPanel();
       jp.add(combo);
       jp.add(input);
       jp.add(search);
       

       Object[][] data;
       
       JdbcEx7 je = new JdbcEx7();
       //DB접속해서 데이터 가져오는 메소드
       data=je.infoselect();
        
       DefaultTableModel model =
       		new DefaultTableModel(colNames, 0);
      
       JTable  table= new JTable(model);
       
      //DB에서 가져온 데이터 테이블에 추가하기
       for(int i=0; i<data.length;i++)
            model.addRow(data[i]);
        
       //테이블을 contentPane에 추가합니다.
       //contentPane에 JScrollPane을  BorderLayout.CENTER로 배치합니다.
       contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
       
        //contentPane에 scrollPane을 BorderLayout.NORTH에 배치합니다.
        contentPane.add(jp, BorderLayout.NORTH);
        
        
        search.addActionListener(new SearchActionListener(table, input, combo));
        
        
                
        //종료버튼을 클릭했을 경우 윈도우가 닫혀지고 프로그램이 종료 되도록 합니다.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        //프레임을 적당한 크기로 만드는 메소드입니다.
        pack();
        
        //프레임을 디스플레이합니다.
        setVisible(true);
    }
    public static void main(String[] args) {
		WindowExample2 we = new WindowExample2();
	}
}
