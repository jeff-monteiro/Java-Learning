package javaEngineer.aula12;

import java.util.Scanner;

public class ReadingDataKeyboard {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Type your name: ");
		
		String name = data.nextLine();
		System.out.println("Your full name is: " + name);

	}

}
