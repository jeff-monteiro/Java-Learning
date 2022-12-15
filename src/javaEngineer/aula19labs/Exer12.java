package src.javaEngineer.aula19labs;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        int[] vetCat = new int[10];
        for(int i=0; i<vetCat.length; i++){
            System.out.println("Insert the value of your position: ");

            vetCat[i] = data.nextInt();
        }
        int sum = 0;
        for(int i=0; i<vetCat.length; i++){
            sum += vetCat[i];
        }
        System.out.println();
        System.out.println("The sum of all numbers is: " + sum);
    }
}
