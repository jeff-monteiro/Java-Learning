package src.start.labs.laboratory;

import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int productCode = sc.nextInt();
        int quantity = sc.nextInt();
        
        double total;
        if(productCode == 1){
            total = quantity * 4.0;
        } else if (productCode == 2) {
            total = quantity * 4.50;
        } else if (productCode == 3) {
            total = quantity * 5.0;
        } else if (productCode == 4) {
            total = quantity * 2.0;
        } else {
            total = quantity * 1.50;
        }
        System.out.printf("O VALOR TOTAL É R$ %.2f%n", total);

        sc.close();
    }
}
