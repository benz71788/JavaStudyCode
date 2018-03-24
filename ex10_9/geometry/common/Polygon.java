package ex10_9.geometry.common;

//protected 구성요소를 포함하는 클래스의 예
public class Polygon {
	
	public int x[];
	protected int y[];	//꼭지점의 Y 좌표
	
	protected Polygon(int vertexNum){	// 생성자
		x = new int[vertexNum];
		y = new int[vertexNum];
	}
	
	// 꼭지점의 좌표를 설정한다.
	protected void setPoint(int index, int x, int y){
		this.x[index] = x;
		this.y[index] = y;
	}
	
}
