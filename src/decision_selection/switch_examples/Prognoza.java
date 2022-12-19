package decision_selection.switch_examples;

import java.util.Scanner;

public class Prognoza {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Sheno ekipin e pare ");
        String ekipiPare = reader.nextLine();

        System.out.println("Sheno ekipin e dyte ");
        String ekipiDyte = reader.nextLine();

        System.out.println("Sheno prognozen ");
        char prognoza = reader.next().charAt(0);

        switch (prognoza) {
            case '1' -> System.out.printf("Fiton ekipi vendas: %s", ekipiPare);
            case '2' -> System.out.printf("Fiton ekipi musafir: %s", ekipiDyte);
            case 'x', 'X' -> System.out.println("Barazim");
            default -> System.out.println("Sje per Prognoze ti!!!");
        }

    }
}















