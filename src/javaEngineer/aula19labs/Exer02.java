package src.javaEngineer.aula19labs;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);
        int[] vetor1 = new int[8];
        int[] vetor2 = new int[vetor1.length];

        for(int i=0; i<vetor1.length; i++){
            System.out.println("Enter with a value of position: " + i);
            vetor1[i] = data.nextInt();

            vetor2[i] = vetor1[i] * 2;
        }
        System.out.println("Vetor1: ");
        for(int i=0; i<vetor1.length; i++){
            System.out.print(vetor1[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor2: ");
        for(int i=0; i<vetor2.length; i++){
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();

    }
}
