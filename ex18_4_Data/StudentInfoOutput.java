package ex18_4_Data;

import java.util.Scanner;
import java.io.*;

public class StudentInfoOutput {
	public static void main(String args[]) {
		output();
	}
	
	static void output() {
		DataOutputStream out = null;
		DataInputStream in = null;
		String pandan = "";
		String name="";
		int kor, eng, math;
		try {
			out = new DataOutputStream(new FileOutputStream("StudentInfo.txt"));

			Scanner sc = new Scanner(System.in);
			
			while(!pandan.equalsIgnoreCase("q")) {
				System.out.println("�̸��� �Է��ϼ���?");
				name = sc.nextLine();
				System.out.println("���� ������ �Է��ϼ���?");
				kor = sc.nextInt();
				System.out.println("���� ������ �Է��ϼ���?");
				eng = sc.nextInt();
				System.out.println("���� ������ �Է��ϼ���?");
				math = sc.nextInt(); // ���� ���� �Է� �� ���͸� �Է��ϴµ� ���������� math�� �������� ���ʹ� nextLine()�� �������ϴ�.
				sc.nextLine();
				
				out.writeUTF(name);
				out.writeInt(kor);
				out.writeInt(eng);
				out.writeInt(math);
				
				System.out.println("����Է��Ͻðڽ��ϱ�?(q �Ǵ� Q �̸� ����)");
				pandan = sc.nextLine();
			}

			sc.close();
			
		} catch(FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		} finally {
			try {
				if(in != null) in.close();
				if(out != null) out.close();
				System.out.println("������ ����մϴ�.");
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
