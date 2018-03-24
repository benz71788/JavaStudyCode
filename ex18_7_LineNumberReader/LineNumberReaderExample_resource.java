package ex18_7_LineNumberReader;

import java.io.*;

class LineNumberReaderExample_resource {
	
	public static void main(String[] args) {
		try(	//������ ����.
				LineNumberReader reader = new LineNumberReader(new FileReader("studentinput.txt"));
				){
			//���Ϸ� ���� �� �྿ �о �� ��ȣ�� �Բ� ����Ѵ�.
			while(true) {
				String str = reader.readLine();
				if(str == null) {
					break;
				}
				//���� �� ��ȣ�� �����ϴ� �޼ҵ�: getLineNumber();
				int lineNo = reader.getLineNumber();
				System.out.println(lineNo + ": " + str);
			}
		} catch(FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		}
	}

}
