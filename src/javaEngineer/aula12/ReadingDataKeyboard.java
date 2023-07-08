package src.javaEngineer.aula12;

import java.util.Scanner;

public class ReadingDataKeyboard {

	public static void main(String[] args) {
		
		try (Scanner data = new Scanner(System.in)) {
			System.out.println("Insert your data to our report on Monday");
			String yourName = data.nextLine();
			double height = data.nextDouble();
			double weight = data.nextDouble();
			int age = data.nextInt();
			boolean havePets = data.nextBoolean();
			
			System.out.println("Your full name is: "+ yourName);
			System.out.println("Your height is: "+ height);
			System.out.println("Your weight is: "+ weight);
			System.out.println("Your age is: "+ age);
			System.out.println("Do you have pets? " + havePets);
		}
		
		//System.out.println("Type your name: ");
		
		//String name = data.nextLine();
		//System.out.println("Your full name is: " + name);


	}

}
