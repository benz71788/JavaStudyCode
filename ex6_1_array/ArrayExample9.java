package ex6_1_array;

import java.io.InputStream;
import java.util.Scanner;

public class ArrayExample9 {
	
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		String[] names = new String[] {"홍길동", "전우치", "홍길동", "세종대왕", "김길동"};
		int index = -1;
		
		System.out.println("검색할 이름을 입력하세요? ");
		System.out.print("이름 : ");
		String name = sc.next();
		
		for(int i = 0; i < names.length; i++) {
			if(name.equals(names[i])) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println(name + "은 배열의  방에서 찾을수 없습니다.");
		} else {
			System.out.println(name + "은 배열의 " + index + "방에서 찾았습니다.");
		}
		
		sc.close();
	}

}
