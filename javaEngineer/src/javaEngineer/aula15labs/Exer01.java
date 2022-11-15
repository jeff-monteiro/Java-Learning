package javaEngineer.aula15labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter with first number");
		double fstNumber = data.nextDouble();
		System.out.println("Enter with second number");
		double scdNumber = data.nextDouble();
		
		if(fstNumber < scdNumber) {
			System.out.println("Second number is major!");
		}else if(fstNumber > scdNumber) {
			System.out.println("First number is major!");
		}else {
			System.out.println("Number are equals!");
		}

	}

}
