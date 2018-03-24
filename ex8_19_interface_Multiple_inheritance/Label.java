package ex8_19_interface_Multiple_inheritance;

class Label implements Changeable {
	
	String text;
	String foreground;
	String background;
	String font;
	int width;
	int height;
	
	Label(){
		
	}
	
	Label(String text, int width, int height, 
			String foreground, String background, String font){
		this.text = text;
		this.foreground = foreground;
		this.background = background;
		this.font = font;
		this.width = width;
		this.height = height;
	}

	@Override
	public void setForeground(String color) {
		// TODO Auto-generated method stub
		this.foreground = color;
	}

	@Override
	public void setBackground(String color) {
		// TODO Auto-generated method stub
		this.background = color;
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		this.width = width;
		this.height = height;
	}

	@Override
	public void setFont(String font) {
		// TODO Auto-generated method stub
		this.font = font;
	}

}
