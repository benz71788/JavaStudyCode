package test.MemberInfoTest;

import java.util.Scanner;

public class practiceNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		String select = sc.nextLine();
		char[] num = new char[127];
	    	for(int i = 0; i < num.length; i++) {
	    		num[i] = (char)i;
	    	}
	    	
//	    	try {
//	    		if((num[48] <= select.charAt(0) && num[57] >= select.charAt(0)) 
//	    				&& (select.length() == 1)){
//		    		System.out.println(Integer.parseInt(select) + "번호 입니다.");
//		    	} else {
//		    		System.out.println("잘못입력하였습니다.");
//		    	}
//	    	} catch(Exception e){
//	    		System.out.println("문자입니다.");
//	    	}
	    	
	    	
	    	try {
	    		if(Integer.parseInt(String.valueOf(num[48])) <= Integer.parseInt(select) 
		    			&& Integer.parseInt(String.valueOf(num[57])) >= Integer.parseInt(select)){
		    		System.out.println(Integer.parseInt(select) + "번호 입니다.");
		    	} else {
		    		System.out.println("잘못입력하였습니다.");
		    	}
	    	} catch(Exception e){
	    		System.out.println("문자입니다.");
	    	}

	    	
//	    	try {
//	    		if(Integer.parseInt(String.valueOf(num[48])) <= Integer.parseInt(select) 
//		    			&& Integer.parseInt(String.valueOf(num[57])) >= Integer.parseInt(select)) {
//		    		System.out.println(Integer.parseInt(select) + "번호 입니다.");
//		    	} 
//	    	} catch(Exception e){
//	    		System.out.println("문자입니다.");
//	    	}
	    	
	    	
	    	sc.close();
	}
}
