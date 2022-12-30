package decision_selection.string_examples.ushtrime;

import java.util.Scanner;

public class Detyra2B {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Shtypni numrin e pare");
        int numri1 = reader.nextInt();
        System.out.println("Shtypni numrin e dyte");
        int numri2 = reader.nextInt();

        if (numri1 > numri2) {
            System.out.println("Numri me i madhe eshte numri 1: " + numri1);
        } else {
            System.out.println("Numri me i madhe eshte numri 2: " + numri2);
        }

        System.out.println(Math.max(numri1, numri2));

    }
}
