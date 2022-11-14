package javaEngineer.aula13labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Insert the temperature in Farenheit: ");
		double f = data.nextDouble();
		
		double c = (5 * (f - 32) / 9);
		System.out.println("The temperature in Celsius is: " + Math.round(c) + "°C");
	}

}
