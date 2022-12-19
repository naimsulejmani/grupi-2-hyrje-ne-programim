package decision_selection.switch_examples;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Nr1 = ");
        double nr1 = reader.nextDouble();
        System.out.println("Nr2 = ");
        double nr2 = reader.nextDouble();

        System.out.println("Zgjidh njeren nga operatoret (+,-,*,/,%): ");
        char operatori = reader.next().charAt(0);

        double rezultati;

        switch (operatori) {
            case '+' -> rezultati = nr1 + nr2;
            case '-' -> rezultati = nr1 - nr2;
            case '*' -> rezultati = nr1 * nr2;
            case '/' -> {
                rezultati = nr1 / nr2;
            }
            case '%' -> {
                rezultati = nr1 % nr2;
            }
            default -> {
                System.out.println("Nuk keni dhene operator valid!");
                return; //kthehu mos shiko me poshte!!!! TERMINON PROGRMAIN KETU
            }
        }
        System.out.println(rezultati);
    }
}
















