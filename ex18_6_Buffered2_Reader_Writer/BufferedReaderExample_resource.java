package ex18_6_Buffered2_Reader_Writer;

import java.io.*;

class BufferedReaderExample_resource {
	
	public static void main(String[] args) {
		char[] arr = new char[20];
		try(BufferedReader reader = 
				new BufferedReader(new FileReader("output.txt"));
				){
			while(true) {
				int num = reader.read(arr);
				if(num < 0) {
					break;
				}
				
				System.out.println(new String(arr, 0, num));
				
			}
			
			
			
		} catch(FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch(IOException e) {
			System.out.println("������ ���� �� �����ϴ�.");
		}
	}

}
