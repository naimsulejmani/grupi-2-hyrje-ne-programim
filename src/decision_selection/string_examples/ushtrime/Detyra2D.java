package decision_selection.string_examples.ushtrime;

import java.util.Scanner;

public class Detyra2D {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("sa vjet sherbim keni:");
        int sherbimiNeVite = scan.nextInt();

        System.out.println("sa eshte paga juaj:");
        double paga = scan.nextDouble();

        if (sherbimiNeVite >= 5) {
            double bonusi = paga * 0.05;
            System.out.println("bonusi juaj eshte " + bonusi + " euro");
        } else {
            System.out.println("nuk jeni i kualifikuar per bonus");
        }

    }
}
