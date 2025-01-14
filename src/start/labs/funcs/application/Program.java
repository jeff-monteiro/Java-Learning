package src.start.labs.funcs.application;

import src.start.labs.funcs.entities.Triangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Instanciando uma classe Java.
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        if(areaX > areaY){
            System.out.printf("Larger area: X %.4f%n ", areaX);
        }else{
            System.out.printf("Larger area: Y %.4f%n ", areaY);
        }
    }
}
