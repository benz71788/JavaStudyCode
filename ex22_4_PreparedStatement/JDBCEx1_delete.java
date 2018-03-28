package ex22_4_PreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCEx1_delete {
	public static void main(String[] args) {
		//SQL문 작성하기 - 실제값으로 대체될 부분을 ?로 처리한다.
		StringBuffer sql = new StringBuffer();
		sql.append("delete from professor ");
		sql.append("where profno = ?");
		
		Connection conn = null;
		
		//SQL문장이 미리 컴파일되고 실행시간 동안 인수값을 위한 공간을 확보할 수 있다.
		//즉, SQL쿼리의 틀을 미리 생성해 놓고 값을 나중에 지정한다.
		//값들이 ?로 대치된다.
		PreparedStatement pstmt = null;
		
		try {
			conn = ConnUtil.getConnection();
			
			//PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql.toString());
			
			/*
			 * 파라미터 셋팅
			 * 쿼리의 ?(바인딩 변수)에 대체될 실제값 지정하기
			 * 입력 매개변수 : SQL문에서 ? 문자로 표시된 입력 항목을 가리킨다.
			 * 입력 매개변수의 타입이 정수형이면 setInt()를 호출
			 * setInt()의 첫번째 매개 변수는 ?의 순서를 숫자로 나타낸다.
			 * 두번째 매개 변수는 지정할 값이다.
			 */
			
			pstmt.setInt(1, 9923);
			
			//입력 매개변수의 타입이 문자열이면 setString()을 호출
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "개의 행이 삭제되었습니다.");
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if(conn != null) conn.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
