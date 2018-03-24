package ex15_5_Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 큐(Queue) 인터페이스
 * 	- LinkedList(Queue 인터페이스를 구현한 클래스)를 사용
 * 	- FIFO(First Input First Output) 구조
 * 		먼저 입력된 자료가 먼저 출력되는 구조
 */
class Queue1 {
	
	public static void main(String[] args) {
		// 큐로 사용할 LinkedList 객체를 생성한다.
		// LinkedList<String> queue = new LinkedList<String>();
		Queue<String> queue = new LinkedList<String>();
		System.out.println("비었나요? " + queue.isEmpty());
		
		//offer() 메소드 : 큐에 3개의 데이터를 추가
		queue.offer("토끼");
		queue.offer("사슴");
		queue.offer("호랑이");
		
		//peek() 메소드 : 처음 데이터를 그대로 둔 상태로 가져온다.
		System.out.println(queue.peek());
		System.out.println("비었나요? " + queue.isEmpty());	// false - 비었는지 판단
		System.out.println("갯수 = " + queue.size());
		
		System.out.println("poll() 사용");
		while(!queue.isEmpty()) {
			System.out.println("==================");
			System.out.println("데이터 출력: " + queue.poll());
		}
		System.out.println("==================");                                                                                          
		System.out.println("비었나요? " + queue.isEmpty());	// true - 비었는지 판단
	}

}
