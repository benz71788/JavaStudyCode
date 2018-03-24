package ex13_7;

class Rectangle {
	
	int width, height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Rectangle)) {
			return false;
		}
		
		Rectangle rec = (Rectangle)obj;
		if(width == rec.width && height == rec.height) {
			
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		String str = "가로는 " + width + "\t세로는 " + height; 
		return str;
	}
}
