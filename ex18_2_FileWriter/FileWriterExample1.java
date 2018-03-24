package ex18_2_FileWriter;

import java.io.*;

class FileWriterExample1 {
	
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			//true : append(���� �ִ� ���� ���� �ڿ� �߰��� ����.)
			//false : overwrite(���� ���� �Ѵ�.)
			writer = new FileWriter("output.txt");
			
			//public FileWriter(String fileName) throws IOException
			//FileWriter �����ڴ� IOException������ �߻��ϱ� ������ IOException
			char arr[] = {'��', '��', '��', ' ', '��', ' ', '��', '��', ' ',
					'��', '��', ' ', '��', '��', ' ', '��', '��', ' ', '��'};
			
			//���Ͽ� �ݺ��ؼ� ���ڵ��� ���ϴ�.
			for(int cnt = 0; cnt < arr.length; cnt++) {
				writer.write(arr[cnt]);
			}
			//�� �� ����� ���� �ǹ�
			//writer.wrter(arr);
		} catch(IOException e) {
				System.out.println("���Ϸ� ����� �� �����ϴ�.");
		} finally {
			try {
				writer.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
