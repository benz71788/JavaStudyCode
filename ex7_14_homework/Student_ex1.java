package ex7_14_homework;

public class Student_ex1 {
	
	public static void main(String[] args) {
		
		String[] name = new String[5];
		String[] m_name = new String[] {"국어", "수학", "영어", "총점", "평균"};
		int[] kor = new int[5];
		int[] math = new int[5];
		int[] eng = new int[5];
		
		int[] major_total = new int[3];
		
		int[] student_total = new int[5];
		float[] student_avg = new float[5];
		
		Student[] s = new Student[5];
		s[0] = new Student("강호동", 85, 60, 70);
		s[1] = new Student("이승기", 90, 95, 80);
		s[2] = new Student("유재석", 75, 80, 100);
		s[3] = new Student("하하", 80, 70, 95);
		s[4] = new Student("이광수", 100, 65, 80);
		
		for(int i = 0; i < name.length; i++) {
			name[i] = s[i].name;
			kor[i] = s[i].kor;
			math[i] = s[i].math;
			eng[i] = s[i].eng;
			student_total[i] = s[i].getTotal();
			student_avg[i] = s[i].getAverage();
			major_total[0] = major_total[0] + kor[i];
			major_total[1] = major_total[1] + math[i];
			major_total[2] = major_total[2] + eng[i];
		}

		System.out.println("============ 학생별 / 과목별 총점구하기 ============");
		
		for(int l = 0; l < m_name.length; l++) {
			System.out.print("\t" + m_name[l]);
		}
		
		System.out.println();
		for(int j = 0; j < name.length; j++) {
			System.out.print(name[j] + "\t");
			System.out.print(kor[j] + "\t");
			System.out.print(math[j] + "\t");
			System.out.print(eng[j] + "\t");
			System.out.print(student_total[j] + "\t");
			System.out.print(student_avg[j] + "\t");
			System.out.println();
		}
		
		System.out.println("=============================================");
		for(int m = 0; m < major_total.length; m++) {
			if(m == 0) {
				System.out.print(m_name[m + 3] + "\t");
			}
			System.out.print(major_total[m] + "\t");
		}
	}

}
