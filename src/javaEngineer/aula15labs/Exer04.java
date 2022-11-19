package src.javaEngineer.aula15labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter with a letter: ");
		String letter = data.next();
		
		if(letter.length() > 1) {
			System.out.println("It's not a valid letter");
		}else {
			switch(letter) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("It's a vowel");
				break;
			default:
				System.out.println("It's a consonant");
			}

		}
		
	}

}
