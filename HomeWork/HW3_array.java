package HomeWork;

public class HW3_array {
	
	public static void main(String[] args) {
		String name[] = {"��ȣ��", "�̽±�", "���缮", "����","�̱���"};
		String sub_name[] = {"����", "����","����"};
	    int[][] score = { 
		        			{ 85,  60,  70},   //0��(��ȣ��)
		        			{ 90,  95,  80},   //1��(�̽±�)
		        			{ 75,  80, 100},   //2��(���缮)
		        			{ 80,  70,  95},   //3��(����)
					  		{100,  65,  80}    //4��(�̱���)
						};
	    int[] subject = new int[3]; //�������� ���� 
	    int[] student = new int[5]; //�л��� ���� ����
	         //    subject[0]=0, student[0]=0;
	         //    subject�� student�� �ʱⰪ 0���� ������
	    
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
	    	System.out.println(sub_name[m] + "�� ������ " + r_sum);
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
	    	System.out.println(name[m] + "�� ������ " + c_sum);
	    }
	    
	    System.out.println("\n========= �л��� / ���� ���� ���ϱ�===========");
	    for(int s = -1; s < 3; s++) {
	    	if(s == -1) {
	    		System.out.print("\t");
	    	} else {
	    		System.out.print(sub_name[s] + "\t");
	    	}
	    }
	    System.out.println("����\t���\t");
	    for(int i = 0; i < score.length; i++) {
	    	System.out.print(name[i] + "\t");
	    	for(int j = 0; j < score[i].length; j++) {
	    		System.out.print(score[i][j] + "\t");
	    	}
	    	System.out.print(c_arr[i] + "\t");
	    	System.out.print(c_arr[i]/3 + "\n");
	    }
	    System.out.println("=========================================");
	    System.out.print("����\t");
	    for(int k = 0; k < 3; k++) {
	    	System.out.print(r_arr[k] + "\t");
	    }
	}
}
