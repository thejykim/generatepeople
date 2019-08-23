package pkg1;

public abstract class Person {

	protected int weight;
	protected String name;
	protected int height;
	protected int friendliness;
	
	//Constructors
	public Person(int weight, String name, int height, int friendliness) {
		this.weight = weight;
		this.name = name;
		this.height = height;
		this.friendliness = friendliness;
	}
	
	//For a default generation of a nameless person
	public Person() {
		weight = 150;
		height = 70;
		friendliness = 5;
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

	public int getFriendliness() {
		return friendliness;
	}

	public void setFriendliness(int friendliness) {
		this.friendliness = friendliness;
	}

	// Methods
	public void introduceSelf() {
		if (friendliness > 7) {
			System.out.println("Hi there! My name is " + name + ". So nice to meet you.");
		} else if (friendliness > 3) {
			System.out.println("Hey, my name is " + name + ".");
		} else {
			System.out.println("Umm, hi.");
		}
	}
	
	public abstract void unique();
	
	public String toString() {
		return name + " is a human being.";
	}
	
}
