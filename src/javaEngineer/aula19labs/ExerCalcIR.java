package src.javaEngineer.aula19labs;

import java.util.Scanner;

public class ExerCalcIR {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Insert your salary");
        double salary = data.nextDouble();

        if(salary >= 3000.00){
            salary = salary * 0.22;
            System.out.println("Your salary must be: " + salary);
        } else {
            salary = salary * 0.15;
            System.out.println("Your salary must be: " + salary);
        }


    }
}
