package ex8_11_abstract_hw;

import java.text.DecimalFormat;

public class Student {
	String name;
	int kor;
	int math;
	int eng;
	
	Student(String name, int kor, int math, int eng){
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		
	}
	
	int getTotal() {
		int total = this.kor + this.eng + this.math;
		
		return total;
	}
	
	float getAverage() {
		
		DecimalFormat form = new DecimalFormat("#.#");
		
		int total = getTotal();
		
		String s_avg = form.format(total / (float)3);
		
		float avg = Float.parseFloat(s_avg);

		return avg;
	}
}