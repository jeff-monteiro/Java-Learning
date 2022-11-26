package src.javaEngineer.aula19labs;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {

        // Refactor type of data that is expected.
        Scanner data = new Scanner(System.in);

        int[] posA = new int[10];
        int[] posB = new int[posA.length];
        int[] posC = new int[posB.length];

        for(int i=0; i<posA.length; i++){
            System.out.println("Enter with i position: " + i);
            posA[i] = data.nextInt();
        }
        for(int i=0; i<posB.length; i++){
            System.out.println("Enter with i position: " + i);
            posB[i] = data.nextInt();
        }
        for(int i=0; i<posC.length; i++){
            posC[i] = posA[i] / posB[i];
        }
        System.out.println("Position of vetA ");
        for(int i=0; i<posA.length; i++){
            System.out.println(posA[i]);
        }
        System.out.println("Position of vetB ");
        for(int i=0; i<posB.length; i++){
            System.out.println(posB[i]);
        }
        System.out.println("Position of vetC ");
        for(int i=0; i<posC.length; i++){
            System.out.println(posC[i]);
        }
    }
}
