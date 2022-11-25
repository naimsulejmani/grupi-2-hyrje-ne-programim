package datatypes.ushtrime;

import java.util.Scanner;

public class Kalkulatori {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("shkruaj numrin e pare: ");
        int numri1 = reader.nextInt();

        System.out.print("Shkruaj numrin e dyte: ");
        int numri2 = reader.nextInt();
        System.out.println("\nLlogaritja aritmetike");
        System.out.println("_____________________");

        System.out.printf("%d + %d = %d%n", numri1, numri2, numri1 + numri2);
        System.out.printf("%d - %d = %d%n", numri1, numri2, numri1 - numri2);
        System.out.printf("%d * %d = %d%n", numri1, numri2, numri1 * numri2);
        System.out.printf("%d / %d = %d%n", numri1, numri2, numri1 / numri2);
        System.out.printf("%d %% %d = %d%n", numri1, numri2, numri1 % numri2);
        // System.out.printf("%d %s %d = %d%n", numri1, "%", numri2, numri1 % numri2);

    }
}
