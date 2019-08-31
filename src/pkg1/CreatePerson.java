package pkg1;

public class CreatePerson {

	protected int weight;
	protected String name;
	protected int height;
	protected double friendliness;
	protected Person p;
	protected boolean givenName;
	
	// Constructors
	
	// To manually create all aspects of a person
	public CreatePerson(Person p, int weight, String name, int height, int friendliness) {
		this.p = p;
		this.weight = weight;
		this.name = name;
		this.height = height;
		this.friendliness = friendliness;
		givenName = false;
	}
	
	// For the default generation of a child with characteristic
	
	public CreatePerson(Person p) {
		this.p = p;
		weight = 6;
		height = 12;
		friendliness = Math.random() * 10;
		givenName = false;
	}
	
	// For a generation of a nameless person without characteristic
	public CreatePerson() {
		p = new DefaultPerson();
		weight = 150;
		height = 70;
		friendliness = 5;
		givenName = false;
	}
	
	//Getters and Setters
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getFriendliness() {
		return friendliness;
	}

	public void setFriendliness(int friendliness) {
		this.friendliness = friendliness;
	}
	
	public boolean givenName() {
		return givenName;
	}

	public void introduceSelf() {
		if (friendliness > 7) {
			System.out.println("Hi there! My name is " + name + ". So nice to meet you.");
		} else if (friendliness > 3) {
			System.out.println("Hey, my name is " + name + ".");
		} else {
			System.out.println("Umm, hi.");
		}
	}
	
	// Delegates the unique function to the appropriate class, based on the type of Person.
	public String unique() {
		return p.unique();
	}
	
	// Baby name setter
	
	public void giveName(String name) {
		if (givenName == false) {
			this.name = name;
			givenName = true;
		} else {
			System.out.println("You've already given this person a name. Try setName().");
		}
	}
	
}
