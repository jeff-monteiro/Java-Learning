package src.start.labs.school.application;

import src.start.labs.school.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.println("Insert your name: ");
        student.name = sc.nextLine();
        student.nTrim1 = sc.nextDouble();
        student.nTrim2 = sc.nextDouble();
        student.nTrim3 = sc.nextDouble();

        System.out.printf("Final Grade: %.2f%n", student.anualPoints());

        if(student.anualPoints() < 60.0){
            System.out.println("Failed!");
            System.out.printf("Missing: %.2f Points%n", student.missingPoints());
        } else {
            System.out.println("Passed!");
        }

        sc.close();
    }
}
