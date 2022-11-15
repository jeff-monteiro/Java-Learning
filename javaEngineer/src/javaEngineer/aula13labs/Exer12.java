package javaEngineer.aula13labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Insert the height of person: ");
		double heightPerson = data.nextDouble();
		
		double resultIMC = (72.7 * heightPerson) - 58;
		System.out.println("The result is: " + resultIMC);
		
	}

}
