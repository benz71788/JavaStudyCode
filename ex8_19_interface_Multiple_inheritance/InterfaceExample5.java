package ex8_19_interface_Multiple_inheritance;

public class InterfaceExample5 {
	
	public static void main(String[] args) {
		
		Label label = new Label("안녕하세요", 100, 30, "yellow", "green", "굴림체");
		
		printLabel(label);
		label.resize(200, 70);
		label.setForeground("black");
		label.setBackground("white");
		label.setFont("궁서체");
		
		printLabel(label);
		
	}
	
	static void printLabel(Label label) {
		System.out.println("Text: " + label.text);
		System.out.println("Size: (" + label.width + " x " + label.height + ")");
		System.out.println("Foreground: " + label.foreground);
		System.out.println("Background: " + label.background);
		System.out.println("Font: " + label.font);
		System.out.println("====================================================");
		System.out.printf("%s: %d x %d 배경색(%s) 전경색(%s) 폰트(%s) \n", 
				label.text, label.width, label.height, label.foreground, label.background, label.font);
		System.out.println("====================================================");
	}

}