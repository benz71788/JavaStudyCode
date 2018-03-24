package test.UnderstandOfOOP;

public class Driver02 {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal mammalia = new Mammalia();
		Animal bird = new Birds();
		Animal whale = new Whale();
		Animal bat = new Bat();
		Animal sparrow = new Sparrow();
		Animal penguin = new Penguin();
		
		animal.showMe();
		mammalia.showMe();
		bird.showMe();
		whale.showMe();
		bat.showMe();
		sparrow.showMe();
		penguin.showMe();
	}

}
