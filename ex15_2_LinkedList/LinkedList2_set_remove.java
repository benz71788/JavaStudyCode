package ex15_2_LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

class LinkedList2_set_remove {
	
	public static void main(String[] args) {
		//LinkedList 객체를 생성
		LinkedList<String> list = new LinkedList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		printFruit(list);
		
		list.add(2, "키위");
		printFruit(list);	
		
		list.set(0, "오렌지");
		printFruit(list);
		
		list.remove(1);
		printFruit(list);
		
		list.remove("키위");
		printFruit(list);
		
	}
	
	static void printFruit(LinkedList<String> list) {
		System.out.println("================");
//		iterator()메소드를 호출하여 Iterator 객체를 얻는다.
		Iterator<String> iterator = list.iterator();
		
//		Iterator 객체를 이용하여 list에 있는 데이터를 순서대로 가져와서 출력
		while(iterator.hasNext()) {	//현재 위치에서 다음 데이터가 있는지 확인
			String str = iterator.next();	//다음 데이터를 가져오는 메소드
			System.out.println(str);
		}
	}

}
