package javaEngineer.aula13labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Insert how much you per hour: ");
		double valuePerHour = data.nextDouble();
		System.out.println("Insert how many hours you work per day: ");
		double hoursPerDay = data.nextDouble();
		
		double earningsPerDay = hoursPerDay * valuePerHour;
		
		System.out.println("Insert how much day you worked in this month? ");
		int dayWorked = data.nextInt();
		
		double earningsPerMonth = dayWorked * earningsPerDay;
		System.out.println("Your earnings this month was: " + earningsPerMonth);

	}

}
