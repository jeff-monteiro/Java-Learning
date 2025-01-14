package src.start.labs.laboratory;

import java.util.Scanner;

public class lab11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberTest = sc.nextInt();

        int soma = 0;
        while( numberTest != 0 ){
            soma += numberTest;
            numberTest = sc.nextInt();

        }
        System.out.println(soma);

        sc.close();
    }
}
