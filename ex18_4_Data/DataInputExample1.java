package ex18_4_Data;

import java.io.*;

/*
 *DataInputStream 클래스 사용 예
 *
 *DataOutputStream 클래스를 이용하여 파일에 저장했던 데이터를 프로그램으로
 *다시 읽어오기 위해서는 DataInputStream 클래스를 이용해야 한다.
 *
 *하지만 이 클래스는 파일에 데이터를 읽는 기능은 없기 때문에
 *FileInputStream 클래스와 함께 사용해야 한다.
 */
class DataInputExample1 {
	
	public static void main(String[] args) {
		
		DataInputStream in = null;
 
		try {
			in = new DataInputStream(new FileInputStream("output.dat"));
			// public DataInputStream(InputStream in)
			
			//파일로부터 정수를 읽어서 출력한다.
			while(true) {
				// 데이터를 읽다가 파일 끝을 만나면 EOFException이 발생한다.
				int data = in.readInt();
				
				System.out.println(data);
			}
		
		} catch(EOFException eofe) {	//readInt()메소드에 의해 파일의 끝에 도달한다.
										// 이곳으로 이동
			System.out.println("끝");
		} catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if(in != null) in.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
