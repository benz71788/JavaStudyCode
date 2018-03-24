package ex18_2_FileWriter;

import java.io.*;

class FileWriterExample1 {
	
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			//true : append(원래 있던 파일 내용 뒤에 추가로 쓴다.)
			//false : overwrite(덮어 쓰기 한다.)
			writer = new FileWriter("output.txt");
			
			//public FileWriter(String fileName) throws IOException
			//FileWriter 생성자는 IOException에러를 발생하기 때문에 IOException
			char arr[] = {'내', '꺼', '인', ' ', '듯', ' ', '내', '꺼', ' ',
					'아', '닌', ' ', '내', '꺼', ' ', '같', '은', ' ', '너'};
			
			//파일에 반복해서 문자들을 씁니다.
			for(int cnt = 0; cnt < arr.length; cnt++) {
				writer.write(arr[cnt]);
			}
			//위 두 문장과 같은 의미
			//writer.wrter(arr);
		} catch(IOException e) {
				System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				writer.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
