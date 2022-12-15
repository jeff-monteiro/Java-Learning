package src.javaEngineer.aula19labs;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        int[] vetA = new int[10];

        for(int i=0; i<vetA.length; i++){
            System.out.println("Insert your position");

            vetA[i] = data.nextInt();
        }
        int qtdPares = 0;
        for(int i=0; i<vetA.length; i++){
            if(vetA[i] % 2 == 0){
                qtdPares += 1;
            }
        }
        System.out.println("Vetor A = ");
        for(int i=0; i<vetA.length; i++){
            System.out.println(vetA[i] + " ");
        }
        System.out.println();

        System.out.println("Qtd números pares: " + qtdPares);
    }
}
