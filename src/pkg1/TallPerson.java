package pkg1;

public class TallPerson extends Person {

	public TallPerson(int weight, String name, int height, int friendliness) {
		super(weight, name, height, friendliness);
	}
	
	public TallPerson() {
		weight = 150;
		height = 75;
		friendliness = 5;
	}
	
	public void unique() {
		System.out.println("Bow before me you oompa loompa");
	}
}
