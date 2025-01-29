package src.start.labs.laboratory;

import java.util.Scanner;

public class lab14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i=0; i<3; i++){
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i=0;i<n;i++){
            sum += vect[i];
        }

        double average = sum / n;
        System.out.println(average);
        sc.close();
    }
}
