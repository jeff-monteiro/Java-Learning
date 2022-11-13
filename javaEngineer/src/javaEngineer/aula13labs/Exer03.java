package javaEngineer.aula13labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Insert the values: ");
		int value1 = data.nextInt();
		int value2 = data.nextInt();
		
		int valueSum = value1 + value2;
		
		System.out.println("The sum of values is: " + valueSum);
	}

}
