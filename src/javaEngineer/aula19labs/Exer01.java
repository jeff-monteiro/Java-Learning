package src.javaEngineer.aula19labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i < vetorA.length; i++){
			System.out.println("Enter with the value of position: " + i);
			vetorA[i] = data.nextInt();

			vetorB[i] = vetorA[i];
		}
		System.out.println("Vetor A = ");
		for(int i=0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.println("Vetor B = ");
		for(int i=0; i<vetorB.length; i++){
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();


	}

}
