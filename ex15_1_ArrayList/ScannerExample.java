package ex15_1_ArrayList;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//다음과 같이 두 가지 방법으로 입력해보세요
		//1을 입력하고 엔터
		//21 공백 자바의 정석 엔터
		System.out.println("나이를 입력하세요>");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.println("이름을 입력하세요>");
		String name = sc.nextLine();
		
		System.out.println("나이는 = " + age);
		if(name.equals("")) {
			System.out.println("이름은 = 빈문자열입니다.");
		} else {
			System.out.println("이름은 = " + name);
			System.out.println("name의 길이 = " + name.length());
		}
		
		sc.close();
	}

}
