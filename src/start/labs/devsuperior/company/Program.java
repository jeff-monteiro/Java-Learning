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

        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();
        Integer idPos = idPosition(listEmployee, idSalary);
        if(idPos == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            listEmployee.get(idPos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of Employees: ");
        for(Employee emp : listEmployee){
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer idPosition(List<Employee> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getIdNumber() == id){
                return i;
            }
        }
        return null;
    }
}
