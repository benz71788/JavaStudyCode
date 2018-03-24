package ex18_6_Buffered2_Reader_Writer;

import java.io.*;

class BufferedWriterExample_resource {
	
	public static void main(String[] args) {
		try (BufferedWriter writer = 
				new BufferedWriter(new FileWriter("output.txt"));
				){
			
			char[] arr = {'내', '꺼', '인', ' ', '듯', ' ', '내', '꺼', ' ',
					'아', '닌', ' ', '내', '꺼', ' ', '같', '은', ' ', '너'};
			
			//파일에 반복해서 문자들을 씁니다.
			for(int cnt = 0; cnt < arr.length; cnt++) {
				writer.write(arr[cnt]);
			}
			
		} catch(IOException e) {
				System.out.println("파일로 출력할 수 없습니다.");
		}
	}

}
