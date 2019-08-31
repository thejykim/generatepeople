package pkg1;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		CreatePerson Person = new CreatePerson(new DefaultPerson());
		System.out.println("You are now in charge of managing a person. What's the move? Type 'name' to change name.");
		Scanner input = new Scanner(System.in);
		
		String setName = "name";
		String toQuit = "quit";
		while (true) {
			String inputString = input.next();
			if (setName.equals(inputString)) {
				
				System.out.println("Okay, changing the name. What name would you like to change your person to?");
				String changeName = input.next();
				
				Person.giveName(changeName);
				System.out.println("Done! Your person is now known as \"" + changeName + "\".");
				
			} else if (toQuit.equals(inputString)) {
				
				break;
				
			} else {
				
				System.out.println("I didn't recognize what you wrote. Can you try again?");
				
			}
		}
		input.close();
		System.out.println("Okay, quitting the program. Good bye, hooman...");
	}

}
