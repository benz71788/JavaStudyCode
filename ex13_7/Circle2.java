package ex13_7;

class Circle2 {
	
	int radius;
	Circle2(int radius){
		this.radius = radius;
	}
	
	//obj�� ObjectŸ���̹Ƿ� radius�� �����ϱ� ���ؼ�
	//Circle2Ÿ������ ����ȯ�� �ʿ�
	public boolean equals(Object obj) {
		//obj�� Circle2�� �� ��ȯ �������� üũ
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
