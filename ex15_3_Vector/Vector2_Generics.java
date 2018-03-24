package ex15_3_Vector;

import java.util.Vector;

class Vector2_Generics {
	
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
		
		String temp;
		for(int i = 0; i < vec.size(); i++) {
			temp = vec.get(i);
			/*
			 * get(i)이 반환형이 Object형이지만 Generic으로 선언했기 때문에
			 * (String)를 생략할 수 있다.
			 * temp = (String)vec.get(i);
			 * Generic을 사용하지 않을 경우에는 반환형을 명시적으로 선언해야 한다.
			 */
			
			System.out.println(temp.toUpperCase());
			System.out.println(temp.toLowerCase());
			System.out.println("=========");
		}
	}

}
