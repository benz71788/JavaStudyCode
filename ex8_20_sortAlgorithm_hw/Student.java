package ex8_20_sortAlgorithm_hw;

import java.text.DecimalFormat;

public class Student {
	String name;
	int kor;
	int math;
	int eng;
	int rank;
	int total;
	float avg;
	
	Student(String name, int kor, int math, int eng){
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.rank = 1;
		
	}
	
	int getTotal() {
		total = kor + math + eng;
		
		return total;
	}
	
	float getAverage() {
		
		DecimalFormat form = new DecimalFormat("#.#");

		String s_avg = form.format(getTotal() / (float)3);
		
		avg = Float.parseFloat(s_avg);

		return avg;
	}
}