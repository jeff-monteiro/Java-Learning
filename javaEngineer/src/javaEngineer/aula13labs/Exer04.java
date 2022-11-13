package javaEngineer.aula13labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Insert the average of each bim: ");
		double fstBim = data.nextDouble();
		double secBim = data.nextDouble();
		double trdBim = data.nextDouble();
		double fthBim = data.nextDouble();
		
		double averageStudent = (fstBim + secBim + trdBim + fthBim) / 4;
		
		System.out.println("The average per year is: " + averageStudent);
	}

}
