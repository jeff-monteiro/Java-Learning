package src.javaEngineer.aula19labs;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];
        for(int i=0; i<vetorA.length; i++){
            System.out.println("The position of i is: " + i);
            vetorA[i] = data.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
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
