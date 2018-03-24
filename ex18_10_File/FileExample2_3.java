package ex18_10_File;

import java.io.*;

class FileExample2_3 {
	
	public static void main(String[] args) {
		
		String dir = "d:\\newDirectory\\newFile.txt";
		
		File f3 = new File(dir);
		if(f3.exists()) {
			if(f3.delete()) {
				System.out.println(f3.getPath() + " �����߽��ϴ�.");
			} else {
				System.out.println(f3.getPath() + " ���� ���� ���߽��ϴ�.");
			}
			
		} else {
			System.out.println(f3.getPath() + "�������� �ʽ��ϴ�.");
		}
		
		/*���丮 ����
		 * 	boolean java.io.File.delete() : ���丮 �����մϴ�.
		 * 	�� ���丮 �ȿ� ������ ������ ���� ���� ���Ѵ�.
		 *  �̶� ��ȯ���� false�� �ȴ�.
		 */
		
		File f4 = new File("d:\\newDirectory");
		if(f4.exists()) {
			if(f4.delete()) {	//���丮 ����
				System.out.println(f4.getPath() + " �����߽��ϴ�.");
			} else {
				System.out.println(f4.getPath() + " �������� ���߽��ϴ�.");
			}
		} else {
			System.out.println(f4.getPath() + "�� �����ϰ��� �ϴ� ���丮�� �����ϴ�.");
		}
	}

}
