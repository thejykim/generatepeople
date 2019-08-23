package pkg1;

public class AthleticPerson extends Person {
	
	public AthleticPerson(int weight, String name, int height, int friendliness) {
		super(weight, name, height, friendliness);
	}
	
	public AthleticPerson() {
		weight = 150;
		height = 75;
		friendliness = 5;
	}
	
	public void introduceSelf() {
		super.introduceSelf();
		System.out.println("Zoom zoom mf");
	}
	
	public void unique() {
		System.out.println("I can probably ball you up in whatever sport you name.");
	}

}
