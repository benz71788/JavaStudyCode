package ex15_1_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_main_for3 {
	
	public static void main(String args[]) {
		
		ArrayList<Student> listStudent = new ArrayList<Student>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("이름을 입력하세요: ");
			String name = sc.nextLine();
			System.out.println("국어점수를 입력하세요: ");
			int kor = sc.nextInt();
			System.out.println("수학점수를 입력하세요: ");
			int math = sc.nextInt();
			System.out.println("영어점수를 입력하세요 : ");
			int eng = sc.nextInt();
			
			Student student = new Student(name, kor, math, eng);
			listStudent.add(student);
			
			System.out.println("계속 입력하시겠습니까?(q 또는 Q 이면 종료)");
			String end = sc.next();
			if(end.equals("q") || end.equals("Q")) {
				System.out.println("종료하겠습니다.");
				break;
			} else {
				sc.nextLine();
				continue;
			}
			
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
