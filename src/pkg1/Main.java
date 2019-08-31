package pkg1;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		CreatePerson Person = new CreatePerson(new DefaultPerson());
		System.out.println("You are now in charge of managing a person. What's the move?");
		String setName = "name";
		System.out.println("'name' for changing the name");
		String toQuit = "quit";
		System.out.println("'quit' to end the program");
		String unique = "unique";
		System.out.println("'unique' to see what's unique about your person");
		String sayHi = "hi";
		System.out.println("'hi' to say hi to your person");
		
		Scanner input = new Scanner(System.in);
		while (true) {
			String inputString = input.next();
			if (setName.equals(inputString)) {
				System.out.println("Okay, changing the name. What name would you like to change your person to?");
				String changeName = input.next();
				
				Person.giveName(changeName);
				System.out.println("Done! Your person is now known as \"" + changeName + "\".");
			} else if (toQuit.equals(inputString)) {
				break;
			} else if (unique.equals(inputString)){
				if (!Person.givenName()) {
					System.out.println("Wait wait... give your person a name before you say hi!");
				} else {
					System.out.println(Person.getName() + ": " + Person.unique());
				}
			} else if (sayHi.equals(inputString)) {
				if (!Person.givenName()) {
					System.out.println("Wait wait... give your person a name before you say hi!");
				} else {
					System.out.println(Person.getName() + sayHi(Person));
				}
			}
			else {
				System.out.println("I didn't recognize what you wrote. Can you try again?");
			}
		}
		input.close();
		System.out.println("Okay, quitting the program. Good bye, hooman...");
	}
	
	protected static String sayHi(CreatePerson p) {
		double friendliness = p.getFriendliness();
		String name = p.getName();
		if (friendliness > 7) {
			return ": Hey man! You seem like a great dude. I hope to be like you someday.";
		} else if (friendliness > 3) {
			return ": Hi... at your service.";
		} else {
			return ": Uh, hey. Having fun messing around with me?";
		}
	}

}
