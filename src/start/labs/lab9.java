package src.start.labs;

import java.util.Scanner;

public class lab9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double eixoX = sc.nextDouble();
        double eixoY = sc.nextDouble();

        if(eixoX == 0.0 && eixoY == 0.0){
            System.out.println("Origem");
        } else if (eixoX == 0.0){
            System.out.println("Eixo X");
        } else if (eixoY == 0.0){
            System.out.println("Eixo Y");   
        } else if (eixoX > 0.0 && eixoY > 0.0){
            System.out.println("Q1");
        } else if (eixoX < 0.0 && eixoY > 0.0){
            System.out.println("Q2");
        } else if (eixoX < 0.0 && eixoY < 0.0){
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        sc.close();
    }
}
