package src.javaEngineer.aula13labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner inches = new Scanner(System.in);
		
		System.out.println("Type the inches: ");
		double meters = inches.nextDouble();
		
		double result = meters * 100;
		
		System.out.println("The value in inches is: " + result + "cm");
	}

}
