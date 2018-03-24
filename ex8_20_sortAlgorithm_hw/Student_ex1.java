package ex8_20_sortAlgorithm_hw;

public class Student_ex1 {
	
	public static void main(String[] args) {
		
		Student st1 = new Student("강호동", 85, 60, 70);
		Student st2 = new Student("이승기", 90, 95, 80);
		Student st3 = new Student("유재석", 75, 80, 100);
		Student st4 = new Student("하하", 80, 70, 95);
		Student st5 = new Student("이광수", 100, 65, 80);
		Student[] student = {st1, st2, st3, st4, st5};
		int[] major = new int[3];
		int num = 3;
		
		studentTotal(student);
		subjectTotal(student, major);
		average(student);
		rank(student);
		sort(student);
		printInfo(student, num, major);
		
	}
	
	static void studentTotal(Student[] student) {
		for(int i = 0; i < student.length; i++){
			student[i].getTotal();
		}
	}
	
	static void subjectTotal(Student[] student, int[] subject) {
		for(int i = 0; i < student.length; i++) {
			subject[0] += student[i].kor;
			subject[1] += student[i].math;
			subject[2] += student[i].eng;
		}
	}
	
	static void average(Student[] student) {
		for(int i = 0; i < student.length; i++) {
			student[i].getAverage();
		}
	}
	
	static void rank(Student[] student) {
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < student.length; j++) {
				if(student[i].total < student[j].total) {
					student[i].rank++;
				}
			}
		}
	}
	
	static void sort(Student[] student) {
		for(int i = 0; i < student.length - 1; i++) {
			for(int j = i + 1; j < student.length; j++) {
				if(student[i].total < student[j].total) {
					Student imsi = student[j];
					student[j] = student[i];
					student[i] = imsi;
				
				}
			}
		}
	}
	
	
	
	static void printInfo(Student[] student, int num, int[] subject) {
		System.out.println("===========     학생별   /   과목별   총점   구하기     ===========");
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균\t등수");
		for(int i = 0; i < student.length; i++) {
			System.out.print(student[i].name + "\t");
			System.out.print(student[i].kor + "\t" + student[i].math  + "\t" + student[i].eng + "\t");
			System.out.print(student[i].total + "\t");
			System.out.print(student[i].avg + "\t");
			System.out.print(student[i].rank + "\n");
		}
		System.out.println("====================================================");
		System.out.print("총점\t");
		for(int i = 0; i < num; i++) {
			System.out.print(subject[i] + "\t");
		}
	}
		
//		String[] name = new String[5];
//		String[] m_name = new String[] {"국어", "수학", "영어", "총점", "평균", "둥수"};
//		
//		int[][] major = new int[3][5];
//		int[] major_total = new int[3];
//		
//		int[] student_total = new int[5];
//		float[] student_avg = new float[5];
//		int[] student_rank = new int[5];
//		
//		StudentInheritance[] s = new StudentInheritance[5];
//		s[0] = new StudentInheritance("강호동", 85, 60, 70);
//		s[1] = new StudentInheritance("이승기", 90, 95, 80);
//		s[2] = new StudentInheritance("유재석", 75, 80, 100);
//		s[3] = new StudentInheritance("하하", 80, 70, 95);
//		s[4] = new StudentInheritance("이광수", 100, 65, 80);
//		
//		Sort sort = new Sort();
//		
//		
//		for(int i = 0; i < name.length; i++) {
//			for(int z = i + 1; z < name.length; z++) {
//				if(s[z].getTotal() < s[i].getTotal()) {
//					int temp1 = s[z].getTotal();
//					int temp2 = s[i].getTotal();
//					
//					int temp = temp1;
//					temp1 = temp2;
//					temp2 = temp;
//					
//				}
//			}
//			name[i] = s[i].name;
//			major[0][i] = s[i].kor;
//			major[1][i] = s[i].math;
//			major[2][i] = s[i].eng;
//			student_total[i] = s[i].();
//			student_avg[i] = s[i].getAverage();
//			student_rank = s[i].getRank(student_total);
//			
//			
//			for(int n = 0; n < major.length; n++) {
//				major_total[n] += major[n][i];
//			}
//		}
//		
//		
//		
//
//		System.out.println("=============== 학생별 / 과목별 총점구하기 ===============");
//		
//		for(int l = 0; l < m_name.length; l++) {
//			System.out.print("\t" + m_name[l]);
//		}
//		
//		System.out.println();
//		for(int j = 0; j < name.length; j++) {
//			System.out.print(name[j] + "\t");
//			for(int t = 0; t < major.length; t++) {
//				System.out.print(major[t][j] + "\t");
//			}
//			System.out.print(student_total[j] + "\t");
//			System.out.print(student_avg[j] + "\t ");
//			System.out.print(student_rank[j] + "\t");
//			System.out.println();
//			
//		}
//		
//		System.out.println("===================================================");
//		for(int m = 0; m < major_total.length; m++) {
//			if(m == 0) {
//				System.out.print(m_name[m + 3] + "\t");
//			}
//			System.out.print(major_total[m] + "\t");
//		}
//	}
}