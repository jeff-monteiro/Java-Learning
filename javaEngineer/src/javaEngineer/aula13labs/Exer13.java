package javaEngineer.aula13labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Insert how much you per hour: ");
		double valuePerHour = data.nextDouble();
		System.out.println("Insert how many hours you work per month: ");
		double hoursPerDay = data.nextDouble();
		
		double earningsPerMonth = hoursPerDay * valuePerHour;
		
		System.out.println("Your salary is: " + earningsPerMonth);
		
		double discountTaxIncome = earningsPerMonth * 0.11;
		double discountINSS = earningsPerMonth * 0.08;
		double discountSindicate = earningsPerMonth * 0.05;
		System.out.println("The value payed to Tax Income is: " + discountTaxIncome);
		System.out.println("The value payed to INSS is: " + discountINSS);
		System.out.println("The value payed to sindicate is: " + discountSindicate);
		
		double totalDiscounted = discountINSS + discountSindicate + discountTaxIncome;
		
		double salaryTotalLiquid = earningsPerMonth - totalDiscounted;
		System.out.println("Your salary in the end of this month is: " + salaryTotalLiquid);
	}

}
