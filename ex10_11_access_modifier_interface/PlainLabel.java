package ex10_11_access_modifier_interface;

class PlainLabel implements Movable{
	int x, y;
	String str;
	PlainLabel(int x, int y, String str){
		this.x = x;
		this.y = y;
		this.str = str;
	}
	
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
}
