package decision_selection.string_examples.ushtrime;

import java.util.Scanner;

public class Detyra2A {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Sa eshte gjatesia e drejtkendeshi: ");
        int gjatesia = reader.nextInt();
        System.out.print("Sa eshte gjeresia e drejtkendeshit: ");
        int gjeresia = reader.nextInt();

        if (gjeresia == gjatesia){
            System.out.println("Eshte katror");
        }
        else{
            System.out.println("Nuk eshte katror");
        }

        System.out.println(gjatesia == gjeresia ? "Eshte katror" : "Nuk eshte katror");
    }
}









