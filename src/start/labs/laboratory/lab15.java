package src.start.labs.laboratory;

import java.util.Scanner;

public class lab15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int positiveNumbers = sc.nextInt();
        int[] numbers = new int[positiveNumbers];

        for(int i = 0; i < positiveNumbers ; i++){
            System.out.println("Digite um número: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Números Negativos: ");

        for(int i = 0; i < positiveNumbers; i++){
            if(numbers[i] < 0){
                System.out.printf("%d\n", numbers[i]);
            }
        }

        sc.close();

    }
}
