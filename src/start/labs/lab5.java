package src.start.labs;

import java.util.Scanner;

public class lab5 {
    public static void main(String[] args){

        Scanner data = new Scanner(System.in);

        int A = data.nextInt();
        int B = data.nextInt();
        // Check if the numbers are multiple between itself
        if(A % B == 0 || B % A == 0){
            System.out.println("São Multiplos");
        }else {
            System.out.println("Não são Multiplos");
        }
    }
}
