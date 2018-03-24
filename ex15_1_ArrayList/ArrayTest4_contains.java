package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayTest4_contains {
	
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(10);
		list1.add("봄");
		list1.add("여름");
		
		ArrayList<String> list2 = new ArrayList<String>(10);
		list2.add("봄1");
		list2.add("가을");
		list2.add("겨울");
		
		list2.addAll(list1);
		
		System.out.println(list1);
		System.out.println(list2);
		
		if(list1.contains("봄")) {
			System.out.println("봄이 존재합니다.");
		} else {
			System.out.println("봄이 존재하지 않습니다.");
		}
	}

}
