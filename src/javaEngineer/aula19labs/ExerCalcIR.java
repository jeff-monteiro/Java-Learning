package src.javaEngineer.aula19labs;

import java.util.Scanner;

public class ExerCalcIR {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Insert your salary");
        double salary = data.nextDouble();
        double dedutionFst = salary * 0.15;
        double dedutionSec = salary * 0.22;


        if(salary <= 3000.00){
            salary = salary - dedutionFst;
            System.out.println("Your salary with dedution must be: " + salary);
        } else {
            salary = salary - dedutionSec;
            System.out.println("Your salary with dedution must be: " + salary);
        }
    }
}
