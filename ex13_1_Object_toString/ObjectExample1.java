package ex13_1_Object_toString;

import java.io.File;

class ObjectExample1 {
	
	public static void main(String[] args) {
		File file = new File("C:\\»µ²Ù±â");
		String str = file.toString();
		System.out.println(str);
	}

}
