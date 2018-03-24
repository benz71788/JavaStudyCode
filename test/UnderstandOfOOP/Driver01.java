package test.UnderstandOfOOP;

public class Driver01 {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		Mammalia mammalia = new Mammalia();
		Birds birds = new Birds();
		Whale whale = new Whale();
		Bat bat = new Bat();
		Sparrow sparrow = new Sparrow();
		Penguin penguin = new Penguin();
		
		animal.showMe();
		mammalia.showMe();
		birds.showMe();
		whale.showMe();
		bat.showMe();
		sparrow.showMe();
		penguin.showMe();
	}

}
