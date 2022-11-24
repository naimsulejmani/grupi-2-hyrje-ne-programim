package datatypes.dorezimi_detyrave;

import java.util.Scanner;

public class DetyraFutboll {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ekipi vendas: ");
        String ekipiVendas = reader.nextLine();
        System.out.print("Ekipi musafir: ");
        String ekipiMusafir = reader.nextLine();
        System.out.print("Numri i tifozeve: ");
        int numriTifozeve = reader.nextInt();
        reader.nextLine();
        System.out.print("Fusha: ");
        String fusha = reader.nextLine();
        System.out.print("Sa gola ka shenuar " + ekipiVendas + ": ");
        int golatVendas = reader.nextInt();
        System.out.print("Sa gola ka shenuar " + ekipiMusafir + ": ");
        int golatMusafir = reader.nextInt();
        System.out.println("-----------------------------------------");
        System.out.println("Rezulati perfundimtar ");
        System.out.printf("%s - %s   %d:%d %n",ekipiVendas , ekipiMusafir, golatVendas , golatMusafir);
        System.out.printf("Stadiumi %s me gjithesej %d spektatore prezent%n", fusha , numriTifozeve);
        System.out.println("-----------------------------------------");











    }
}
