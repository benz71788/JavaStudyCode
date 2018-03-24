package ex19_7_serialVersionUID;

//기존 사각형 클래스에 메소들 추가한 경우
//에러 발생 : 직렬화할 때 사용한 클래스와
//역직렬화할 때 사용한 클래스의 버전이 다르기 때문
class Rectangle implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1182191355357906580L;
	int width, height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	int getArea() {
		return width * height;
	}

}
