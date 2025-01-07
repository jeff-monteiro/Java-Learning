package src.start.labs;

import java.util.Scanner;

public class lab3 {
    public static void main(String[] args){
        try (Scanner data = new Scanner(System.in)){
            int numberInt = data.nextInt();
            if(numberInt < 0){
                System.out.println("NEGATIVO");
            }else{
                System.out.println("NÃO NEGATIVO");
            }
        }
    }
}
