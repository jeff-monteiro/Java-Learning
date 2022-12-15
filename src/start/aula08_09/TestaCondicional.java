package src.start.aula08_09;

import java.util.Scanner;

public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("Testing Conditionals");

        Scanner data = new Scanner(System.in);

        int idade = data.nextInt();

        if(idade >= 18){
            System.out.println("You are major of age!");
        }else{
            System.out.println("You are not major of age!");
        }
    }
}

