package ex8_18_interface_extends;

class Rectangle implements Transformable{
	
	int x, y, width, height;
	
	Rectangle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	//Transformable 인터페이스의 메소드를 구현
	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		this.width = width;
		this.height = height;
	}

	@Override
	public void moveTo(int x, int y) {
		// TODO Auto-generated method stub
		this.x = x;
		this.y = y;
	}

	@Override
	public void moveBy(int xOffset, int yOffset) {
		// TODO Auto-generated method stub
		this.x += xOffset;
		this.y += yOffset;
	}
	
}
