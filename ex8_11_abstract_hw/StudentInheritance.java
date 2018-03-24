package ex8_11_abstract_hw;

public class StudentInheritance extends Student{
	
	int[] rank = new int[5];

	StudentInheritance(String name, int kor, int math, int eng) {
		super(name, kor, math, eng);
		// TODO Auto-generated constructor stub
	}
	
	int[] getRank(int[] student_total) {
		
		for(int i = 0; i < student_total.length; i++) {
			rank[i] = 1;
			for(int j = 0; j <student_total.length; j++) {
				if(student_total[i] < student_total[j]) {
					rank[i] = rank[i] + 1;
				}
			}
		}
		return rank;
	}
}