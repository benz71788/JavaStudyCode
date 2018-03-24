package ex13_8_clone_3_ShallowCopy;

public class Circle implements Cloneable{
	
	Point p;
	double r;
	
	Circle(Point p, double r){
		this.p = p;
		this.r = r;
	}
	
	public Circle clone() {	//얕은 복사 - 객체에 저장된 값을 그대로 복제하는 객체
		Object obj = null;
		try {
			obj = super.clone();	//조상의 clone()을 호출
		} catch(CloneNotSupportedException e) {}
		
		return (Circle)obj;
	}
	
	public String toString() {
		return "[p = " + p + ", r = " + r + "]";
	}

}
