package ex18_4_Data;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

class StudentInfoInput {
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		DataInputStream in = null;
		String name = "";
		int kor, math, eng;
		try {
			in = new DataInputStream(new FileInputStream("StudentInfo.txt"));
			while(true) {
				name = in.readUTF();
				kor = in.readInt();
				eng = in.readInt();
				math = in.readInt();
				list.add(new Student(name, kor, eng, math));
			}
			
		} catch(FileNotFoundException fnfe) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch(EOFException eofe) {
			print(list);
		} catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if(in != null) in.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

	static void print(ArrayList<Student> list) {
	
		System.out.println("==========   학생별   /  과목별 총점구하기  ==========");
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).name + "\t" + list.get(i).kor + "\t" + list.get(i).eng + "\t"
					+ list.get(i).math + "\t" + list.get(i).getTotal() + "\t");
			System.out.printf("%.1f\n", list.get(i).getAverage());
		}

		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}

		System.out.print("\n총점\t");
		System.out.print(Student.korTotal + "\t");
		System.out.print(Student.engTotal + "\t");
		System.out.print(Student.mathTotal + "\t");
	}
}
