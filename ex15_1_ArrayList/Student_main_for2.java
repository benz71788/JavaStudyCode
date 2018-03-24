package ex15_1_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_main_for2 {
	
	public static void main(String args[]) {
		
		String pandan = "", name = "";
		int kor, eng, math;
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> listStudent = new ArrayList<Student>();
		
		while(!pandan.equalsIgnoreCase("q")) { //문자열과 String인스턴스 문자열을 대소문자 구분없이 비교 
			System.out.println("이름을 입력하세요: ");
			name = sc.nextLine();
			System.out.println("국어점수를 입력하세요: ");
			kor = Integer.parseInt(sc.nextLine());
			System.out.println("수학점수를 입력하세요: ");
			math = Integer.parseInt(sc.nextLine());
			System.out.println("영어점수를 입력하세요 : ");
			eng = Integer.parseInt(sc.nextLine());
			Student student = new Student(name, kor, math, eng);
			listStudent.add(student);
			
			System.out.println("계속 입력하시겠습니까?(q 또는 Q 이면 종료)");
			pandan = sc.nextLine();
			
		}
		
		printStudentInfo(listStudent);
		
		sc.close();
	}
	
	static void printStudentInfo(ArrayList<Student> listStudent) {
		int[] total = new int[3];
		System.out.println("============== 학생별 / 과목별 총점구하기 ==============");
		System.out.println("Name\tKOR\tMATH\tENG\tTOTAL\tAVERAGE");
		
		for(int i = 0; i < listStudent.size(); i++) {
			System.out.printf("%3s\t%3d\t%3d\t%3d\t%4d\t%.1f\n", listStudent.get(i).name, 
					listStudent.get(i).kor, listStudent.get(i).math, listStudent.get(i).eng, 
					listStudent.get(i).getTotal(), listStudent.get(i).getAverage());
		}
		
		for(int j = 0; j < listStudent.size(); j++) {
			total[0] +=	listStudent.get(j).kor;
			total[1] += listStudent.get(j).math;
			total[2] += listStudent.get(j).eng;
		}
		
		System.out.print("총점\t");
		for(int m = 0; m < total.length; m++) {
			System.out.print(total[m] + "\t");
		}
		System.out.println();
	}

}
