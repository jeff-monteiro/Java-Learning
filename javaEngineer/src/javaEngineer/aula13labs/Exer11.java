package javaEngineer.aula13labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Insert the integer: ");
		int fstInt = data.nextInt();
		System.out.println("Insert the second integer: ");
		int scdInt = data.nextInt();
		System.out.println("Insert the real number: ");
		double trdReal = data.nextDouble();
		
		double resultOne = (2 * fstInt) + (scdInt / 2);
		System.out.println("O product the first operation is: " + resultOne);
		

	}

}
