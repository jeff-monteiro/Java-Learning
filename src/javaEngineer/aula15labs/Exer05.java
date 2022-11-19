package src.javaEngineer.aula15labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		System.out.println("Enter with the note 1");
		double noteOne = data.nextDouble();
		System.out.println("Enter with the note 2");
		double noteTwo = data.nextDouble();
		
		double average = (noteOne + noteTwo) / 2;
		
		if(average == 10) {
			System.out.println("Approved with distinction!");
		}else if(average >= 7) {
			System.out.println("Approved!");
		}else {
			System.out.println("Disapproved!");
		}
		
	}

}
