package ex10_2.geometry.polygon;

public class Rectangle {
	
	public int width, height;
	
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}

}
