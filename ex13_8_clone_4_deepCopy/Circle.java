package ex13_8_clone_4_deepCopy;

public class Circle implements Cloneable{
	
	Point p;
	double r;
	
	Circle(Point p, double r){
		this.p = p;
		this.r = r;
	}
	
	public Circle clone() {	//���� ���� - ������ �����ϰ� �ִ� ��ü���� ����
		Object obj = null;
		try {
			obj = super.clone();	//������ clone()�� ȣ��
		} catch(CloneNotSupportedException e) {}
		
		Circle c = (Circle)obj;
		c.p = new Point(this.p.x, this.p.y);
		return c;
	}
	
	public String toString() {
		return "[p = " + p + ", r = " + r + "]";
	}

}
