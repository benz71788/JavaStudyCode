package ex15_1_ArrayList;

import java.util.List;
import java.util.ArrayList;

/*
 * List 인터페이스 - ArrayList(상속받는 클래스)
 * 	1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
 * 		ex) int, double, char, boolean, String etc
 * 	2. 입력한 순서대로 출력된다.(index번호 순으로 저장됨)
 * 	3. 중복된 Data를 저장 할 수 있다
 * 	4. 배열의 장점과 배열에서 사용할 수 없는 것을 사용할 수 있다.
 * 	5. 동적인 저장 구조를 이용할 수 있다.
 */
class ArrayList1_add {
	
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
		
		System.out.println(list);	//list의 모든 데이터 출력
		System.out.println(list.toString());

		//size() : 데이터의 갯수 구하는 메소드
		System.out.println("사이즈 : " + list.size());
		
		//get(index) : 해당 인덱스의 데이터 가져오는 메소드
		//get(3) : 0부터 시작, index=3인 데이터 출력해라.
		System.out.println("list.get(3): " + list.get(3));
	}

}
