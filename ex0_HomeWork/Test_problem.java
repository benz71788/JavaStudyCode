package ex0_HomeWork;

import java.util.ArrayList;

class Test_problem {
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("1");
		a.add("2");
		a.add("2");
		a.add("3");
		a.add("4");
		
		
//		for(int i = 0; i < a.size(); i++) {
//			if(a.get(i).equals("2")) {
//				a.remove(i);	//삭제 후 ArrayList는 이동한다.
//								//빈 자리로 하나씩 이동한다.
//				i--;
//			} 
//		}
//		System.out.println(a);
		
		for(int i = a.size() -1; i >= 0; i--) {
			if(a.get(i).equals("1")) {
				a.remove(i);
			}
			System.out.println(a.get(i));
		}
		System.out.println(a);
	}

}
