package ex15_1_ArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * List 인터페이스 - ArrayList(상속받는 클래스)
 * 	1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
 * 		ex) int, double, char, boolean, String etc
 * 	2. 입력한 순서대로 출력된다.(index번호 순으로 저장됨)
 * 	3. 중복된 Data를 저장 할 수 있다
 * 	4. 배열의 장점과 배열에서 사용할 수 없는 것을 사용할 수 있다.
 * 	5. 동적인 저장 구조를 이용할 수 있다.
 */
class ArrayList2_add {
	
	public static void main(String[] args) {
		//업캐스팅(상송해준 메소드만 사용가능하다.)
		List list = new ArrayList();
		
		//ArrayList list = new ArrayList();
		
		//자료 추가
		list.add("하나");
		list.add(3);
		list.add("Hello");
		list.add(3.14);
		list.add(true);
		list.add("Nice to meet you");
		list.add('A');
		
		//출력 방법 1. - 해당 객체명으로 출력하는 방법
		System.out.println("===객체명으로 출력하기===");
		System.out.println(list);
		
		//출력 방법 2. - get()메소드 이용법
		System.out.println("===get()메소드 이용법===");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째 요소 = " + list.get(i));
		}
		
		//출력 방법 3. - Interator 인터페이스 사용 : 반복자
		System.out.println("===Interator 인터페이스 사용 ===");
		Iterator elements = list.iterator();
		while(elements.hasNext()) {		//hasNext() : 읽어올 요소가 있는지 확인
			System.out.println(elements.next());
		}
		// next()메소드를 이용해서 차례대로 한개씩 데이터 가져온다.
		
		//출력 방법 4. - for문 사용
		System.out.println("=====향상된 for문=====");
		for(Object a : list) {
			System.out.println(a.toString());
		}
	}
}
