package ex13_1_Object_toString;

import java.io.File;

class ObjectExample1 {
	
	public static void main(String[] args) {
		File file = new File("C:\\���ٱ�");
		String str = file.toString();
		System.out.println(str);
	}

}
