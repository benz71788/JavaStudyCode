package ex18_6_Buffered2_Reader_Writer;

import java.io.*;

class BufferedWriterExample_resource {
	
	public static void main(String[] args) {
		try (BufferedWriter writer = 
				new BufferedWriter(new FileWriter("output.txt"));
				){
			
			char[] arr = {'��', '��', '��', ' ', '��', ' ', '��', '��', ' ',
					'��', '��', ' ', '��', '��', ' ', '��', '��', ' ', '��'};
			
			//���Ͽ� �ݺ��ؼ� ���ڵ��� ���ϴ�.
			for(int cnt = 0; cnt < arr.length; cnt++) {
				writer.write(arr[cnt]);
			}
			
		} catch(IOException e) {
				System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}
	}

}
