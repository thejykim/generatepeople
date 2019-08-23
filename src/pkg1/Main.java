package pkg1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreatePerson Luke = new CreatePerson(new AthleticPerson(), 140, "Luke", 69, 6);
		CreatePerson Joey = new CreatePerson(new TallPerson(), 166, "Joey", 75, 8);
		
		Luke.introduceSelf();
		Luke.unique();
		Joey.introduceSelf();
		Joey.unique();
	}

}
