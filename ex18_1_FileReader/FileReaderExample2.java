package ex18_1_FileReader;

import java.io.*;
class FileReaderExample2 {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("src/ex18_1_FileReader/poem.txt");
			
			while(true) {
				int data = reader.read();
				if(data == -1) {
					break;
				}
				char ch = (char)data;
				System.out.println(data);
				System.out.print(ch);
			}
			
			reader.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e1) {
			e1.printStackTrace();
		}
	}
}
