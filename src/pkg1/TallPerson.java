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
	
	public void introduceSelf() {
		super.introduceSelf();
		System.out.println("Am I tall? Easy one. Yes.");
	}
	
}
