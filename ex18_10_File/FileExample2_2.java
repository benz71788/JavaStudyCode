package ex18_10_File;

import java.io.*;

class FileExample2_2 {
	
	public static void main(String[] args) {
		
		String dir = "d:\\newDirectory";
		
		File f2 = new File(dir);
		if(!f2.exists()) {
			System.out.println("���� ���� ���丮 �̸� : " + f2.getPath());
			f2.mkdir();	//���丮 ����
		} else {
			System.out.println("�̹� �ִ� ���丮 �̸� : " + f2.getPath());
		}
		
		File f = new File(dir + "\\newFile.txt");
		if(f.exists()) {
			System.out.println(f.getPath() + "��ο� " + f.getName() + "������ �ֽ��ϴ�.");
		} else {
			try {
				//IOException �߻�
				//boolean java.io.File.createNewFile() throws IOException
				if(f.createNewFile()) {
					System.out.println(f.getPath() + "�� ���ο� ������ ��������ϴ�.");
				}
			} catch(IOException ioe) {
				System.out.println(ioe.getMessage());
			}
		}
	}

}
