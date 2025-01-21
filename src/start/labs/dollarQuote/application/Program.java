package src.start.labs.dollarQuote.application;

import src.start.labs.dollarQuote.utilities.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("What is the dollar price? ");
        double dollarValue = sc.nextDouble();
        System.out.print("How many dollar will be bought? ");
        double toBeBought = sc.nextDouble();

        double amountToBePaid = CurrencyConverter.dollarToReal(toBeBought, dollarValue);

        System.out.printf("Amount to be paid in reais = %.2f ", amountToBePaid);
    }
}
