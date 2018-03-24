package ex8_20_sortAlgorithm_hw;

public class Student2 { 
	 String name; 
	 int  kor, eng,  math, total, rank;
	 float avg;
	 
	 Student2(String name,int kor, int eng, int math){
		 this.name = name;
		 this.kor = kor;
		 this.eng = eng;
		 this.math = math;
		 this.rank = 1;
	 }
	 
    int getTotal() {
   	 total = kor + eng + math; 
   	 return total;
    }
    
    float getAverage(){ 
   	 avg = getTotal() / 3f;
   	 return avg;
    }
    
   
}