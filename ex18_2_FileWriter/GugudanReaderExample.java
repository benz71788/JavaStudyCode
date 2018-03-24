package ex18_2_FileWriter;

import java.io.*;

class GugudanReaderExample {
	
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("src/ex18_2_FileWriter/gugudan.txt");
			while(true) {
				int num = reader.read();
				if(num == -1) {
					break;
				}
				
				char ch = (char)num;
				System.out.print(ch);
			}
			
			
		} catch(Exception e){
			System.out.println(e.getMessage());
		} finally {
			try {
				reader.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
			
	}

}
