package src.javaEngineer.aula19labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        for(int i=0; i<vetorA.length; i++){
            System.out.println("The position of i is: " + i);
            vetorA[i] = data.nextInt();

            vetorB[i] = vetorA[i] * i;
        }
        System.out.println("Insert the vetorA");
        for(int i=0; i<vetorA.length; i++){
            System.out.println(vetorA[i]);
        }
        System.out.println();

        System.out.println("Insert the vetorB");
        for(int i=0; i<vetorB.length; i++){
            System.out.println(vetorB[i]);
        }
        System.out.println();
    }
}
