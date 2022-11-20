package src.javaEngineer.aula19labs;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        int[] elemA = new int[15];
        int[] elemB = new int[elemA.length];

        for(int i=0; i<elemA.length; i++){
            System.out.println("Position: " + i);
            elemA[i] = data.nextInt();

            elemB[i] = elemA[i] * elemA[i];
        }
        System.out.println("ElemA: ");
        for(int i=0; i<elemA.length; i++){
            System.out.print(elemA[i] + " ");
        }
        System.out.println();
        System.out.println("ElemB: ");
        for(int i=0; i<elemB.length; i++){
            System.out.print(elemB[i] + " ");
        }
        System.out.println();
    }
}
