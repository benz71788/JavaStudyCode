package ex0_01_programmers;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Set;

public class khTest02_2 {
	
	public static void main(String[] args) {
		HashMap<String, Book> map = new HashMap<String, Book>();
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + map.get(key));
		}
		
//		2���� �����迭�� ����ִ� �����͵��� �հ�� ����� ���Ѵ�. 
//
//		1. ��� ������ 
//		 int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 
//
//		2. ���� Ŭ����  
//		Package��         Ŭ������       �޼ҵ�                                      ����
//		array                Test1            +main(args:String []):void         main �Լ� �ȿ��� ��� �ڵ� �۾� ����
//
//		3. ���� ���  
//		��� ����� ������ ����.   
//		�հ� : 602.0 
//		��� : 37.625  
//		�հ�� ��� ���� double�� ó�� �Ѵ�.  
		
	}

}

