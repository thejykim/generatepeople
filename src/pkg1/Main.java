package pkg1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person Luke = new Person(140, "Luke", 69, 6);
		TallPerson Joey = new TallPerson(166, "Joey", 75, 8);
		
		Luke.introduceSelf();
		Joey.introduceSelf();
		System.out.println(Luke.toString());
	}

}
