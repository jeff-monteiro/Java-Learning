package javaEngineer.aula13labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Insert the value of the area's square: ");
		//area = side * side
		double side = data.nextDouble();
		double areaValue = Math.pow(side, 2);
		System.out.println("The area of the square is: " + areaValue);
		System.out.println("The double of the same square is: " + (areaValue * 2));

	}

}
