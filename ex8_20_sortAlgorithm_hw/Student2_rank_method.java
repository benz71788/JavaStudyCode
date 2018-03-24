package ex8_20_sortAlgorithm_hw;

public class Student2_rank_method {
	public static void main(String[] args) {
		Student2 h1 = new Student2("강호동", 85, 60, 70);
		Student2 h2 = new Student2("이승기", 90, 95, 80);
		Student2 h3 = new Student2("유재석", 75, 80, 100);
		Student2 h4 = new Student2("하하", 80, 70, 95);
		Student2 h5 = new Student2("이광수", 100, 65, 80);
		Student2 hs[] = { h1, h2, h3, h4, h5};
		int subjectHap[] = new int[3];
        int count = 3; //과목수		
		
        
		hap(hs);
		avg(hs);
		Total(hs, subjectHap);
		rank(hs);
		sort(hs);
		print(hs, count, subjectHap);
		
	}
	
	static void Total(Student2[] hs, int[] total) {
		for(int i=0;i<hs.length;i++) {
		  total[0] += hs[i].kor;
		  total[1] += hs[i].eng;
		  total[2] += hs[i].math;
		}
	}
	
	//합 구하기
	static void hap(Student2[] hs) {
		for (int i = 0; i < hs.length; i++) {
			hs[i].getTotal();;
		}
	}
	
	
	//평균 구하기
	static void avg(Student2[] hs) {
		for (int i = 0; i < hs.length; i++) {
			hs[i].getAverage();
			}
	}
	
	//정렬 구하기
	static void sort(Student2[] hs) {
		Student2 temp;
		for(int i = 0; i < hs.length - 1; i++) {
			for(int j = i + 1; j < hs.length; j++) {
				if(hs[i].getTotal() < hs[j].getTotal()) {
					temp = hs[j];
					hs[j] = hs[i];
					hs[i] = temp;
				}
				
			}
		}
	}
	
	// 출력하기
	  static void print(Student2[] hs, int num, int[] total){
		  System.out.println("===========     학생별   /   과목별   총점   구하기     ===========");
		  System.out.println("이름\t국어\t수학\t영어\t총점\t평균\t등수");
		for (int i = 0; i < hs.length; ++i) {
			System.out.print(hs[i].name + "\t");
			
				System.out.print(hs[i].kor + "\t" + hs[i].eng + "\t" + hs[i].math + "\t");
			
			System.out.print(hs[i].total + "\t");
			System.out.printf("%.1f\t",hs[i].avg);
			System.out.print(hs[i].rank + "\n");
		}

		System.out.println("====================================================");
		System.out.print("총점" + "\t");
		for (int i = 0; i < num; i++) {
			
			System.out.print(total[i] + "\t");
		}

	}


	// 등수구하기
	static void rank(Student2[] hs) {
		for (int i = 0; i < hs.length; ++i) {
			for (int j = 0; j < hs.length; ++j) {
				if (hs[i].total < hs[j].total) {
					hs[i].rank++;
				}
			}
		}
	}

	
}

