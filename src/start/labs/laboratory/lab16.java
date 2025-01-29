package src.start.labs.laboratory;

import java.util.Scanner;

public class lab16 {
    public static void main(String[] args) {

        int n;
        double soma, media;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você tem?");
        n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        media = soma / n;

        System.out.printf("%.2f%n", soma);
        System.out.printf("%.2f%n", media);

    }
}
