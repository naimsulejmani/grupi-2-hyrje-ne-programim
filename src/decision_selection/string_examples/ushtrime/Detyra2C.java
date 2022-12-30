package decision_selection.string_examples.ushtrime;

import java.util.Scanner;

public class Detyra2C {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj numri e produkteve: ");
        int produktet = reader.nextInt();
        int totali = produktet * 100;

        if (totali > 1000) {
            totali -= totali * 0.1;
        }

        System.out.println("totali: " + totali);
    }
}
