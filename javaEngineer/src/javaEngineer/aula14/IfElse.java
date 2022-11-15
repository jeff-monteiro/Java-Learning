package javaEngineer.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
//		System.out.println("Enter with your age");
//		int age = data.nextInt();
		
//		if(age >= 18) {
//			System.out.println("Major");
//		}else {
//			System.out.println("Minor");
//		}
		
		System.out.println("Enter with the price of product");
		double price = data.nextDouble();
		
		if(price <= 10) {
			System.out.println("It's cheap, you can buy it");
		} else if(price > 10 && price < 15) {
			System.out.println("You can ask for a discount");
		} else if(price >= 15 && price <= 17) {
			System.out.println("You need search more");
		} else {
			System.out.println("Very expensive");
		}
	

	}

}
