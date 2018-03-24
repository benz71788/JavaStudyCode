package ex17_12_notify_wait;
//공유 영역 클래스
class SharedArea {
	
	double result;
	
	//공유 데이터가 쓰여졌는지 여부를 표현하는 필드-디폴트(false)
	boolean isReady;

}
