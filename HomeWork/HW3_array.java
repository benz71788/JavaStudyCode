package HomeWork;

public class HW3_array {
	
	public static void main(String[] args) {
		String name[] = {"강호동", "이승기", "유재석", "하하","이광수"};
		String sub_name[] = {"국어", "수학","영어"};
	    int[][] score = { 
		        			{ 85,  60,  70},   //0행(강호동)
		        			{ 90,  95,  80},   //1행(이승기)
		        			{ 75,  80, 100},   //2행(유재석)
		        			{ 80,  70,  95},   //3행(하하)
					  		{100,  65,  80}    //4행(이광수)
						};
	    int[] subject = new int[3]; //과목총점 저장 
	    int[] student = new int[5]; //학생의 총점 저장
	         //    subject[0]=0, student[0]=0;
	         //    subject와 student의 초기값 0으로 설정됨
	    
	    int m, n;
	    int[] r_arr = new int[3]; 
	    int[] c_arr = new int[5];
	    
	    for(m = 0; m < 3; m++) {
	    	int r_sum = 0;
	    	for(n = 0; n < 5; n++) {
	    		student[m] = score[n][m];
	    		r_sum = r_sum + student[m];
//	    		System.out.println("student[" + m + "] = " + student[m]);	
	    	}
	    	r_arr[m] = r_sum;
	    	System.out.println(sub_name[m] + "의 총점은 " + r_sum);
	    }
	    
	    System.out.println("======================");
	    
	    
	    for(m = 0; m < 5; m++) {
	    	int c_sum = 0;
	    	for(n = 0; n < 3; n++) {
	    		subject[n] = score[m][n];
	    		c_sum = c_sum + subject[n];
//	    		System.out.println("subject[" + n + "] = " + subject[n]);
	    	}
	    	c_arr[m] = c_sum;
	    	System.out.println(name[m] + "의 총점은 " + c_sum);
	    }
	    
	    System.out.println("\n========= 학생별 / 과목별 총점 구하기===========");
	    for(int s = -1; s < 3; s++) {
	    	if(s == -1) {
	    		System.out.print("\t");
	    	} else {
	    		System.out.print(sub_name[s] + "\t");
	    	}
	    }
	    System.out.println("총점\t평균\t");
	    for(int i = 0; i < score.length; i++) {
	    	System.out.print(name[i] + "\t");
	    	for(int j = 0; j < score[i].length; j++) {
	    		System.out.print(score[i][j] + "\t");
	    	}
	    	System.out.print(c_arr[i] + "\t");
	    	System.out.print(c_arr[i]/3 + "\n");
	    }
	    System.out.println("=========================================");
	    System.out.print("총점\t");
	    for(int k = 0; k < 3; k++) {
	    	System.out.print(r_arr[k] + "\t");
	    }
	}
}
