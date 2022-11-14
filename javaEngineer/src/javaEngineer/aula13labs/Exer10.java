package javaEngineer.aula13labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Insert the temperature in Celsius: ");
		double c = data.nextDouble();
		
		double f = (c * 1.8) + 32;
		System.out.println("The temperature in Celsius is: " + Math.round(f) + "°F");

	}

}
