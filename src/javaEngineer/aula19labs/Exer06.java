package src.javaEngineer.aula19labs;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        int[] vetA = new int[10];
        int[] vetB = new int[vetA.length];
        int[] vetC = new int[vetB.length];

        for(int i=0; i<vetA.length; i++){
            System.out.println("Enter with i position: " + i);
            vetA[i] = data.nextInt();
        }
        for(int i=0; i<vetB.length; i++){
            System.out.println("Enter with i position: " + i);
            vetB[i] = data.nextInt();
        }
        for(int i=0; i<vetC.length; i++){
            System.out.println("Enter with i position: " + i);
            vetC[i] = vetA[i] + vetB[i];
        }
    }
}
