package javaEngineer.aula13labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Insert the area of circle ");
		
		double areaCircle = data.nextDouble();
		double areaRaio = Math.PI * Math.pow(areaCircle, 2);
		System.out.println("The area of the circle is: " + areaRaio);
	}

}
