package src.start.labs;

import java.util.Scanner;

public class lab4 {
    public static void main(String[] args){
        Scanner data = new Scanner(System.in);
        int numberInt = data.nextInt();
        if(numberInt % 2 == 0){
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }

        data.close();
    }
}
