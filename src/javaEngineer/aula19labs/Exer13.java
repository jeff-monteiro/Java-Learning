package src.javaEngineer.aula19labs;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);
        int[] vetA = new int[10];

        for(int i=0; i<vetA.length; i++){
            System.out.println("Insert your position: ");

            vetA[i] = data.nextInt();
        }
        int sum = 0;
        for(int i=0; i<vetA.length; i++) {
            if (vetA[i] % 5 == 0) {
                sum += vetA[i];
            }
        }
        System.out.print("Position of vetA = ");
        for(int i=0; i<vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println();

        System.out.println("The sum is: " + sum);
    }
}
