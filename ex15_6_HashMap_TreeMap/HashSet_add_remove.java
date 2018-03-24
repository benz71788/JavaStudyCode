package ex15_6_HashMap_TreeMap;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/*
 * Set 인터페이스
 * 	- HashSet(상속받는 클래스) : 내부적으로 HashMap을 이용해서 만들어졌으며
 * 		HashSet이란 이름은 해싱을 이용해서 구현했기 때문에 붙여진 것이다.
 * 	- TreeSet은 이진 검색 트리(binary search tree)라는
 * 		자료구조의 형태로 데이터를 저장하는 컬렉션 클래스이다.
 * 	1. 여러가지 자료형(기본 자료형, 참조형 모두)의 Data를 모두 저장할 수 있다
 * 		ex) int, double, char, boolean, String etc
 * 	2. 순서 없이 입, 출력 한다.
 * 	3. 중복된 Data를 저장하지 못한다.
 * 		예) 로또 번호 6개를 중복 되지 않게 하는 프로그램시 이용
 */
class HashSet_add_remove {
	public static void main(String[] args) {
		// HashSet 클래스의 객체 생성
		Set hs = new HashSet();
//		HashSet hs = new HashSet();
		
		// hs 객체의 데이터 객체 보관
		// 업캐스팅 hs.add(new String("좋아요"));
		// 업캐스팅(매개변수가 Object형이기 때문에)
		hs.add("좋아요");
		hs.add("즐거운 하루");
		
//		Date d = new Date();
//		hs.add(d);
		hs.add(new Date());	//위 두 문장과 같은 의미
		
		//hs 객체가 보관하고 있는 데이터 객체 출력
		System.out.println("hs의 내용: " + hs);
		
		//"즐거운 하루" 데이터 객체로 hs객체에서 제거
		hs.remove("즐거운 하루");
		System.out.println("hs의 내용: " + hs);
		
		System.out.println("\"좋아요\"가 있나요? " + hs.contains("좋아요"));
	}
}
