package src.javaEngineer.aula19labs;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        int[] vetA = new int[10];
        int[] vetB = new int[vetA.length];
        int[] vetC = new int[vetB.length];

        for(int i=0; i<vetA.length; i++){
            System.out.println("Enter with i position: ");
            vetA[i] = data.nextInt();
            vetB[i] = data.nextInt();
        }
        System.out.println("The position of vetA ");
        for(int i=0; i<vetA.length; i++){
            System.out.println(vetA[i]);
        }
        System.out.println("The position of vetB ");
        for(int i=0; i<vetB.length; i++){
            System.out.println(vetB[i]);
        }

    }
}
