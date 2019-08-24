package pkg1;

public class Main {

	public static void main(String[] args) {

		CreatePerson Chris = new CreatePerson(new AthleticPerson());
		CreatePerson Joey = new CreatePerson(new TallPerson());
		CreatePerson Boring = new CreatePerson(new DefaultPerson());
		
		// Most of the code below will only be used to test the latest features
		Chris.giveName("Chris");
		System.out.println(Chris.getName());
		Chris.unique();
		Chris.giveName("Anything else");
		Joey.giveName("Joey");
		Joey.unique();
		System.out.println(Joey.getName());
		Boring.unique();
	}

}
