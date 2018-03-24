package ex13_8_clone_4_deepCopy;

public class Circle implements Cloneable{
	
	Point p;
	double r;
	
	Circle(Point p, double r){
		this.p = p;
		this.r = r;
	}
	
	public Circle clone() {	//깊은 복사 - 원본이 참조하고 있는 객체까지 복제
		Object obj = null;
		try {
			obj = super.clone();	//조상의 clone()을 호출
		} catch(CloneNotSupportedException e) {}
		
		Circle c = (Circle)obj;
		c.p = new Point(this.p.x, this.p.y);
		return c;
	}
	
	public String toString() {
		return "[p = " + p + ", r = " + r + "]";
	}

}
