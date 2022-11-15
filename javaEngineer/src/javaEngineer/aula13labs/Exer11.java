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
		
		int resultOne = (2 * fstInt) * (scdInt / 2);
		double resultTwo = (fstInt * 3) + trdReal;
		double resultThree = Math.pow(trdReal, 3);
		System.out.println("O product of the first operation is: " + resultOne);
		System.out.println("O product of the second operation is: " + resultTwo);
		System.out.println("O product of the third operation is: " + resultThree);
		

	}

}
