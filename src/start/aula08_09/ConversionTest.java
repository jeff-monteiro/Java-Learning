package src.start.aula08_09;

import java.util.Scanner;

public class ConversionTest {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        double x = data.nextDouble();
        System.out.println("You typed:" + x);
        data.close();
        
        double salary = 1278.50;
        int value = (int) salary;

        System.out.println("The value will be showed is: " + value);

        double value1 = 0.2;
        double value2 = 0.1;
        double total = value1 + value2;
        System.out.println("The total is: " + total);
    }
}
