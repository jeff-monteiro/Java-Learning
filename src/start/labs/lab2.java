package src.start.labs;

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {

        try (Scanner data = new Scanner(System.in)) {
            int a, b;
            double result;
            a = data.nextInt();
            b = data.nextInt();

            result = (double) a / b;
            System.out.println(result);
        }
    }
}
