package datatypes.adhoc;

import java.util.Scanner;

public class SyprinaEDrejtkendeshit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj brinjen A (cm): ");
        double brinjaA  = reader.nextDouble();

        System.out.println("Shkruaj brinjen b (cm): ");
        double brinjaB  = reader.nextDouble();

        double syprina  = brinjaA * brinjaB;

        System.out.printf("Syprina e drejtkendeshit eshte: %.2f cm2%n", syprina);
    }
}
