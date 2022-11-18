package javaEngineer.aula18;

import java.util.Scanner;

public class ContinueUse {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter with a number: ");
		int number = data.nextInt();
		
		System.out.println("Enter with a limit: ");
		int maximum = data.nextInt();
		
		for(int i = number; i <= maximum; i++) {
			
			if(i % 7 == 0) {
				continue;
			}
			System.out.println("The value of i is: " + i);
		}

	}

}
