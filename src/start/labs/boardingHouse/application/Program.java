package src.start.labs.boardingHouse.application;

import src.start.labs.boardingHouse.entities.Tenants;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Tenants[] tenants = new Tenants[10];

        System.out.print("How many rooms be rented?");
        int roomsQuantity = sc.nextInt();




        for(int i = 1; i <= roomsQuantity; i++){
            System.out.println("Tenant #" + i + ":");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.next();
            int roomNumber = sc.nextInt();

            tenants[roomNumber] = new Tenants(name, email);

        }

    }

}
