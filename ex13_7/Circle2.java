package ex13_7;

class Circle2 {
	
	int radius;
	Circle2(int radius){
		this.radius = radius;
	}
	
	//obj가 Object타입이므로 radius를 참조하기 위해서
	//Circle2타입으로 형변환이 필요
	public boolean equals(Object obj) {
		//obj를 Circle2로 형 변환 가능한지 체크
		if(!(obj instanceof Circle2)) {
			return false;
		}
		Circle2 circle = (Circle2) obj;
		if(radius == circle.radius) {
			return true;
		} else {
			return false;
		}
	}

}
