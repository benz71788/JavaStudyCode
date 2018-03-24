package ex18_4_Data;

import java.io.*;

/*
 * DataOutputStream 클래스를 사용 예
 * DataOutputStream 클래스는 기본형 데이터를 바이트 스트림으로 만들어서
 * 출력하는 기능의 클래스이다.
 * 이 클래스는 파일에 데이터를 쓰는 기능은 없기 때문에
 * FileOutputStream 클래스와 함께 사용해야
 * 기본형 데이터를 파일에 쓸 수 있다.
 * 사용법은 먼저 FileOutputStream 객체를 생성한 후
 * 그 객체를 생성자 파라미터로 넘겨야 한다.
 */
class DataOutputExample1 {
	
	public static void main(String[] args) {
		
		DataOutputStream out = null;

		try {
			out = new DataOutputStream(
					new FileOutputStream("output.dat"));	//파일을 연다.
			int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			for(int cnt = 0; cnt < arr.length; cnt++) {
				out.writeInt(arr[cnt]);	//파일에 int 타입 데이터를 쓴다.
				System.out.printf("%d \t", arr[cnt]);
			}
			System.out.println();
		} catch(IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				if(out != null) out.close();
				System.out.println("output.dat 파일을 출력한다.");
			} catch(Exception e){
				
			}
			
		}
	}

}
