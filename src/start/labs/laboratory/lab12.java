package src.start.labs.laboratory;

import java.util.Scanner;

public class lab12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int xp = sc.nextInt();
        int yt = 0;

        while(xp < 7) {
            xp += 2;
            yt += 4;
            System.out.println(xp + " - " + yt);

        }
    }
}
