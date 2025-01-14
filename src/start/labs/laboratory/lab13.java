package src.start.labs.laboratory;

import java.util.Scanner;

public class lab13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resp;
        do{
            System.out.print("Digite a temperatura em Celsius: ");
            double temp = sc.nextDouble();
            double fahrenheit = 9 * temp / 5 + 32;

            System.out.printf("Equivalente a Fahrenheit %.1f%n", fahrenheit);
            System.out.println("Deseja repetir s/n?");
            resp = sc.next().charAt(0);

        } while(resp != 'n');

        sc.close();
    }
}
