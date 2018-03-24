package ex8_11_abstract_hw;

public class Student_ex1 {
	
	public static void main(String[] args) {
		
		String[] name = new String[5];
		String[] m_name = new String[] {"국어", "수학", "영어", "총점", "평균", "둥수"};
		
		int[][] major = new int[3][5];
		int[] major_total = new int[3];
		
		int[] student_total = new int[5];
		float[] student_avg = new float[5];
		int[] student_rank = new int[5];
		
		StudentInheritance[] s = new StudentInheritance[5];
		s[0] = new StudentInheritance("강호동", 85, 60, 70);
		s[1] = new StudentInheritance("이승기", 90, 95, 80);
		s[2] = new StudentInheritance("유재석", 75, 80, 100);
		s[3] = new StudentInheritance("하하", 80, 70, 95);
		s[4] = new StudentInheritance("이광수", 100, 65, 80);
		
		
		for(int i = 0; i < name.length; i++) {
			name[i] = s[i].name;
			major[0][i] = s[i].kor;
			major[1][i] = s[i].math;
			major[2][i] = s[i].eng;
			student_total[i] = s[i].getTotal();
			student_avg[i] = s[i].getAverage();
			student_rank = s[i].getRank(student_total);
			for(int n = 0; n < major.length; n++) {
				major_total[n] += major[n][i];
			}
		}

		System.out.println("=============== 학생별 / 과목별 총점구하기 ===============");
		
		for(int l = 0; l < m_name.length; l++) {
			System.out.print("\t" + m_name[l]);
		}
		
		System.out.println();
		for(int j = 0; j < name.length; j++) {
			System.out.print(name[j] + "\t");
			for(int t = 0; t < major.length; t++) {
				System.out.print(major[t][j] + "\t");
			}
			System.out.print(student_total[j] + "\t");
			System.out.print(student_avg[j] + "\t ");
			System.out.print(student_rank[j] + "\t");
			System.out.println();
			
		}
		
		System.out.println("===================================================");
		for(int m = 0; m < major_total.length; m++) {
			if(m == 0) {
				System.out.print(m_name[m + 3] + "\t");
			}
			System.out.print(major_total[m] + "\t");
		}
	}
}