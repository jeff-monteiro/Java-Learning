package src.javaEngineer.aula15labs;

import java.util.Scanner;

public class Exer02 {
	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter with the value");
		int num = data.nextInt();
		
		if(num >= 0) {
			System.out.println("Number positive!");
		}else {
			System.out.println("Number negative");
		}
	}
}
