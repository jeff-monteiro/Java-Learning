package src.start.labs.devsuperior.company;

import src.start.labs.devsuperior.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> listEmployee = new ArrayList<>();

        System.out.print("How many will be registered? ");
        int N = sc.nextInt();

        for(int i=0; i < N; i++){
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            listEmployee.add(emp);
        }

        sc.close();
    }
}
