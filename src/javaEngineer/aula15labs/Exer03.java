package src.javaEngineer.aula15labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter with a letter");
		String letter = data.next();
		
		//Não é possível utilizar relacionais == para comparação de strings
		if(letter.equalsIgnoreCase("F")) {
			System.out.println("F - Feminino");
		}else if(letter.equalsIgnoreCase("M")) {
			System.out.println("M - Masculino");
		}else {
			System.out.println("Sexo inválido");
		}
	}

}
