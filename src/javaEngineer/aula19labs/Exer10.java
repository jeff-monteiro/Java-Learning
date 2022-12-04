package src.javaEngineer.aula19labs;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for(int i=0; i < vetorA.length; i++){
            System.out.println("Insert the value of position at: " + i);

            vetorA[i] = data.nextInt();
            vetorB[i] = data.nextInt();
        }
        System.out.println("Enter with vetorA ");
        for(int i=0; i < vetorA.length; i++){
            System.out.println(vetorA[i]);
        }
    }
}
