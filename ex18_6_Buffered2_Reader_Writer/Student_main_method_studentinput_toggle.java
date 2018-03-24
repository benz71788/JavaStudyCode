package ex18_6_Buffered2_Reader_Writer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Student_main_method_studentinput_toggle {
	public static void main(String args[]) {
		ArrayList<Student> list = new ArrayList<Student>();
		input(list);
	}

	static void input(ArrayList<Student> list) {
		String name = "";
		int kor, eng, math;
		String[] arr = new String[4];
		try (BufferedReader reader = new BufferedReader(new FileReader("studentinput.txt"));) {
			while (true) {
				String str = reader.readLine();// 파일로 부터 한 행씩 읽어요.
				if (str == null)
					break;
				//공백으로 분리해서 이름, 국어, 영어, 수학 점수 가져옵니다.
				StringTokenizer toke = new StringTokenizer(str, " ");	// 1. StringTokenizer 방법
				for(int i = 0; i < arr.length; i++) {
					arr[i] = toke.nextToken();
				}
				name = arr[0];
				kor = Integer.parseInt(arr[1]);
				eng = Integer.parseInt(arr[2]);
				math = Integer.parseInt(arr[3]);
				Student student = new Student(name, kor, eng, math);	
				
				// or
				
//				String[] st = str.split(" ");		// 2. split 방법
//				name = st[0];
//				kor = Integer.parseInt(st[1]);
//				eng = Integer.parseInt(st[2]);
//				math = Integer.parseInt(st[3]);
//				Student student1 = new Student(name, kor, eng, math);	
				
				//Student 객체 생성 후 list에 추가합니다.
				list.add(student);
				
			}
			print(list);
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
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
