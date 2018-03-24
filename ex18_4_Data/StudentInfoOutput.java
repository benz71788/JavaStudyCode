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
				System.out.println("이름을 입력하세요?");
				name = sc.nextLine();
				System.out.println("국어 점수를 입력하세요?");
				kor = sc.nextInt();
				System.out.println("영어 점수를 입력하세요?");
				eng = sc.nextInt();
				System.out.println("수학 점수를 입력하세요?");
				math = sc.nextInt(); // 수학 점수 입력 후 엔터를 입력하는데 수학점수는 math가 가져가고 엔터는 nextLine()이 가져갑니다.
				sc.nextLine();
				
				out.writeUTF(name);
				out.writeInt(kor);
				out.writeInt(eng);
				out.writeInt(math);
				
				System.out.println("계속입력하시겠습니까?(q 또는 Q 이면 종료)");
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
				System.out.println("파일을 출력합니다.");
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
