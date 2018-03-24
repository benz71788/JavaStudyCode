package ex15_1_ArrayList;

import java.util.ArrayList;

public class Student_main_for {
	
	public static void main(String args[]) {
		
		Student h1 = new Student("강호동", 85, 60, 70);
		Student h2 = new Student("이승기", 90, 95, 80);
		Student h3 = new Student("유재석", 75, 80, 100);
		Student h4 = new Student("하하", 80, 70, 95);
		Student h5 = new Student("이광수", 100, 65, 80);
		
		ArrayList<Student> listStudent = new ArrayList<Student>();
		listStudent.add(h1);
		listStudent.add(h2);
		listStudent.add(h3);
		listStudent.add(h4);
		listStudent.add(h5);
		
		printStudentInfo(listStudent);
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
	}

}
