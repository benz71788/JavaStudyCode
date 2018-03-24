package ex15_1_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_main_for2 {
	
	public static void main(String args[]) {
		
		String pandan = "", name = "";
		int kor, eng, math;
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> listStudent = new ArrayList<Student>();
		
		while(!pandan.equalsIgnoreCase("q")) { //���ڿ��� String�ν��Ͻ� ���ڿ��� ��ҹ��� ���о��� �� 
			System.out.println("�̸��� �Է��ϼ���: ");
			name = sc.nextLine();
			System.out.println("���������� �Է��ϼ���: ");
			kor = Integer.parseInt(sc.nextLine());
			System.out.println("���������� �Է��ϼ���: ");
			math = Integer.parseInt(sc.nextLine());
			System.out.println("���������� �Է��ϼ��� : ");
			eng = Integer.parseInt(sc.nextLine());
			Student student = new Student(name, kor, math, eng);
			listStudent.add(student);
			
			System.out.println("��� �Է��Ͻðڽ��ϱ�?(q �Ǵ� Q �̸� ����)");
			pandan = sc.nextLine();
			
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
