package src.start.labs.heights.application;

import src.start.labs.heights.entities.People;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        int n, minors;
        double avgHeight, percentualMinors;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();
        People[] people = new People[n];

        for(int i = 0; i < n; i++){
            System.out.println("Dados da " + (i + 1) + " pessoa: ");
            sc.nextLine();
            String name = sc.nextLine();
            int age = sc.nextInt();
            double height = sc.nextDouble();
            people[i] = new People(name, age, height);
        }

        double totalHeight = 0.0;
        for(int i = 0; i < n; i++){
            totalHeight = totalHeight + people[i].getHeight();
        }

        avgHeight = totalHeight / n;
        System.out.printf("Altura média das pessoas: %.2f\n", avgHeight);

        minors = 0;
        for(int i = 0; i < n; i++){
            if(people[i].getAge() < 16){
                minors++;
            }
        }

        percentualMinors = ((double)minors / n) * 100;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMinors);

        for(int i = 0; i < n; i++){
            if(people[i].getAge() < 16){
                System.out.printf("%s\n", people[i].getName());
            }
        }


    }
}
