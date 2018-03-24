package ex18_2_FileWriter;

import java.io.*;

class FileWriterReaderExample {
	
	public static void main(String[] args) {
		FileReader reader = null;
		FileWriter writer = null;
		char arr[] = new char[1000];
		try {
			reader = new FileReader("src/ex18_1_FileReader/∞≈¿ß¿« ≤ﬁ.txt");
			writer = new FileWriter("output_dream.txt");
			while(true) {
				int num = reader.read(arr);
				if(num == -1) {
					break;
				}
				
				for(int cnt = 0; cnt < num; cnt++) {
					System.out.printf("%c", arr[cnt]);
					writer.write(arr[cnt]);
				}
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally{
			try {
				reader.close();
				writer.close();
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
