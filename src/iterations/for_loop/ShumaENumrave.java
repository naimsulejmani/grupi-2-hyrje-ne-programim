package iterations.for_loop;

import java.util.Scanner;

public class ShumaENumrave {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("N = ");
        int n = reader.nextInt();

        int shuma = 0;

        for (int i = 1; i <= n; i++) {
            shuma += i; // shuma = shuma + i;
        }

        System.out.printf("Shuma e numrave prej 1 deri ne %d eshte %d %n", n, shuma);

    }
}








