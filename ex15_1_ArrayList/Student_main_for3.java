package ex15_1_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_main_for3 {
	
	public static void main(String args[]) {
		
		ArrayList<Student> listStudent = new ArrayList<Student>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�̸��� �Է��ϼ���: ");
			String name = sc.nextLine();
			System.out.println("���������� �Է��ϼ���: ");
			int kor = sc.nextInt();
			System.out.println("���������� �Է��ϼ���: ");
			int math = sc.nextInt();
			System.out.println("���������� �Է��ϼ��� : ");
			int eng = sc.nextInt();
			
			Student student = new Student(name, kor, math, eng);
			listStudent.add(student);
			
			System.out.println("��� �Է��Ͻðڽ��ϱ�?(q �Ǵ� Q �̸� ����)");
			String end = sc.next();
			if(end.equals("q") || end.equals("Q")) {
				System.out.println("�����ϰڽ��ϴ�.");
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
		System.out.println("============== �л��� / ���� �������ϱ� ==============");
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
		
		System.out.print("����\t");
		for(int m = 0; m < total.length; m++) {
			System.out.print(total[m] + "\t");
		}
		System.out.println();
	}

}
