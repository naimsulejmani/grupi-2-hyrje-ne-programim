package iterations.for_loop;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("N = ");
        int n = reader.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("&");
            }
            System.out.println();
        }

    }
}




