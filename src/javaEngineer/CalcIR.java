package src.javaEngineer;

import java.util.Scanner;

public class CalcIR {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Insert your ");
        double salary = data.nextDouble();

        if(salary > 1900.00 && salary <= 2800.00){
            System.out.println("You must to pay 7.5%");
            double calcIR = salary - (100 * 0.75);
            System.out.println("Your salary with dedution is: " + calcIR);

        }else if(salary >= 2801.00 && salary <= 3751.00){
            System.out.println("You must to pay 15%");
            double calcIR = salary - (100 * 0.15);
            System.out.println("Your salary with dedution is: " + calcIR);
        }else{
            System.out.println("You must to pay 22.5%");
            double calcIR = salary - (100 * 0.22);
            System.out.println("Your salary with dedution is: " + calcIR);
        }
    }
}
