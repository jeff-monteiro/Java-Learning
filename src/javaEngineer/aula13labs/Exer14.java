package src.javaEngineer.aula13labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Insert the size file: ");
		double sizeFile = data.nextDouble();
		
		System.out.println("Insert the internet speed: ");
		double speedInternet = data.nextDouble();
		
		double timeDownloadFile = sizeFile / speedInternet;
		
		System.out.println("Time to finish the download is: " + timeDownloadFile);
		
	}

}
