package ex15_6_HashMap_TreeMap;

import java.util.HashMap;
import java.util.Set;

class HashMap2_Generics {
	public static void main(String[] args) {
		// HashMap 객체 생성 방법 두가지
		// Map hm = new HashMap(); // 방법1. 업캐스팅
		HashMap<String, Object> hm = new HashMap<String, Object>(); // 방법2. 구현 클래스를 통한 객체 생성
		
		// Key와 Value 쌍을 삽입
		// Map의 메소드는 put을 이용해 (Key, Value) 쌍으로 자료 저장한다.
		hm.put("woman", "재미있니");
		hm.put("man", "좋은하루");
		hm.put("grade", new String("10"));
		hm.put("age", new Integer(10));	// hm.put("age", 10)
		hm.put("city", "seoul");
		
		// HashMap에 있는 객체들을 출력
		// 출력 방법1. 해당 객체명으로 출력
		System.out.println(hm);
		//{woman=재미있니, city=seoul, man=좋은하루, age=10}
		
		// 출력 방법2. Key 값만 출력
		System.out.println(hm.keySet());
		//[woman, city, man, age]
		
		// 출력 방법3. Value 값만 출력
		System.out.println(hm.values());
		// [재미있니, seoul, 좋은하루, 10]
		
		// 출력 방법4.
		// get(Key) : Key에 해당하는 Value를 출력 - 가장 많이 사용
		System.out.println(hm.get("woman"));
		System.out.println(hm.get("city"));
		
		// 출력 방법5.
		System.out.println("===========================");
		Set<String> keys = hm.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + hm.get(key));
		}
	}
}
