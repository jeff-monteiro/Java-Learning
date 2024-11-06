package src.start;

import java.util.Scanner;

public class Exer02 {
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
