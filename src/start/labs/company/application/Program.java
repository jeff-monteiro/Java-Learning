package src.start.labs.company.application;

import src.start.labs.company.entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);
        double percentage;
        System.out.print("Which percentage to increase salary? ");
        percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated salary: " + employee);

        sc.close();

    }
}
