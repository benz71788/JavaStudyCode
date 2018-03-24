package ex18_7_LineNumberReader;

import java.io.*;

class LineNumberReaderExample_resource {
	
	public static void main(String[] args) {
		try(	//파일을 연다.
				LineNumberReader reader = new LineNumberReader(new FileReader("studentinput.txt"));
				){
			//파일로 부터 한 행씩 읽어서 행 번호와 함께 출력한다.
			while(true) {
				String str = reader.readLine();
				if(str == null) {
					break;
				}
				//읽은 행 번호를 리턴하는 메소드: getLineNumber();
				int lineNo = reader.getLineNumber();
				System.out.println(lineNo + ": " + str);
			}
		} catch(FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}

}
