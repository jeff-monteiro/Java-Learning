package src.start.labs.laboratory;

import java.util.Scanner;

public class lab18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal numbers");
        for(int i = 0; i < n; i++){
            System.out.print(mat[i][i] + " ");
        }

    }
}
