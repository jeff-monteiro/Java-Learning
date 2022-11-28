package src;

import java.util.Scanner;

public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        Scanner data = new Scanner(System.in);

        int idade = data.nextInt();

        if(idade >= 18){
            System.out.println("Você é maior de idade!");
        }else{
            System.out.println("Você não é maior de idade!");
        }
    }
}

