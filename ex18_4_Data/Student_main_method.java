package ex18_4_Data;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student_main_method {
	public static void main(String args[]) {
	
		ArrayList<Student> list = new ArrayList<Student>();
		input(list);
		print(list);
	}
	
	static void input(ArrayList<Student> list) {
		String pandan = "";
		String name="";
		int kor, eng, math;
		Scanner sc = new Scanner(System.in);
		while (!pandan.equalsIgnoreCase("q")) {
			System.out.println("이름을 입력하세요?");
			name = sc.nextLine();
			System.out.println("국어 점수를 입력하세요?");
			kor = sc.nextInt();
			System.out.println("영어 점수를 입력하세요?");
			eng = sc.nextInt();
			System.out.println("수학 점수를 입력하세요?");
			math = sc.nextInt(); // 수학 점수 입력 후 엔터를 입력하는데 수학점수는 math가 가져가고 엔터는 nextLine()이 가져갑니다.
			sc.nextLine();
			Student h = new Student(name, kor, eng, math);
			list.add(h);

			System.out.println("계속입력하시겠습니까?(q 또는 Q 이면 종료)");
			pandan = sc.nextLine();
		}
		sc.close();
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
