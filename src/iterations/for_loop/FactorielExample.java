package iterations.for_loop;

import java.util.Scanner;

public class FactorielExample {
    public static void main(String[] args) {

        long fact = 1; //elementi njesi pasi kemi me shumezuar

        Scanner reader = new Scanner(System.in);
        System.out.println("N = ");
        int n = reader.nextInt();

        for (int numri = 1; numri <= n; numri++) {
            fact *= numri;
        }
        System.out.printf("Faktorieli i %d! eshte %d%n", n, fact);

        fact = 1;

        for (int numri = n; numri >= 1; numri--) {
            fact *= numri;
        }
        System.out.printf("Faktorieli i %d! eshte %d%n", n, fact);
    }
}






