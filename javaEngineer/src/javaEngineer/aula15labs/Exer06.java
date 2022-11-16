package javaEngineer.aula15labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter with the first number: ");
		double fstNumber = data.nextDouble();
		System.out.println("Enter with the second number: ");
		double scdNumber = data.nextDouble();
		System.out.println("Enter with the third number: ");
		double trdNumber = data.nextDouble();
		
		if(fstNumber > scdNumber && fstNumber > trdNumber) {
			System.out.println("The first number is major: " + fstNumber);
		}else if(scdNumber > fstNumber && scdNumber > trdNumber) {
			System.out.println("The second number is major: " + scdNumber);
		}else if(trdNumber > fstNumber && trdNumber > scdNumber) {
			System.out.println("The third number is major: " + trdNumber);
		}
	}

}
