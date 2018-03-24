package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayTest3_addAll {
	
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(10);
		list1.add("º½1");
		list1.add("¿©¸§");
		
		ArrayList<String> list2 = new ArrayList<String>(10);
		list2.add("º½");
		list2.add("°¡À»");
		list2.add("°Ü¿ï");
		
		list2.addAll(list1);
		
		System.out.println(list1);
		System.out.println(list2);
	}

}
