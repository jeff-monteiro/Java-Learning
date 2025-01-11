package src.start.labs;

import java.util.Scanner;

public class lab10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        double impostoRenda;

        if(salario <= 2000.00){
            impostoRenda = 0.00;
            System.out.printf("Isento R$ %.2f%n", impostoRenda);

        } else if(salario <= 3000.00){
            impostoRenda = (salario - 2000.00) * 0.08;
            System.out.printf("Imposto R$ %.2f%n",impostoRenda);

        } else if(salario <= 4500.00){
            impostoRenda = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
            System.out.printf("Imposto R$ %.2f%n",impostoRenda);

        } else {
            impostoRenda = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
            System.out.printf("Imposto R$ %.2f%n",impostoRenda);
        }

        sc.close();
    }
}
