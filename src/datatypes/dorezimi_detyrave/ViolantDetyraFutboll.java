package datatypes.dorezimi_detyrave;

import java.util.Scanner;

public class ViolantDetyraFutboll {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("**********************************************************");

        System.out.print("Ekipi vendas: ");
        String ekipiVendas = reader.nextLine();

        System.out.print("Ekipi mysafir: ");
        String ekipiMysafir = reader.nextLine();

        System.out.print("Numri i tifozeve: ");
        int numriITifozeve = reader.nextInt();

        reader.nextLine();
        System.out.print("Fusha/Area: ");
        String fushaArea = reader.nextLine();

        System.out.print("Sa gola ka shenuar ekipa vendase: ");
        int golatEShenuaraNgaEkipaVendase = reader.nextInt();

        System.out.print("Sa gola ka shenuar ekipa mysafir: ");
        int golatEShenuaraNgaEkipaMysafire = reader.nextInt();

        System.out.println("**********************************************************");

        System.out.println("Rezultati perfundimtar");
        System.out.printf("%S - %S   %d : %d",ekipiVendas,ekipiMysafir,golatEShenuaraNgaEkipaVendase,golatEShenuaraNgaEkipaMysafire);

        System.out.println();
        System.out.printf("Stadiumi %s me gjithsej %d spektator prezent",fushaArea,numriITifozeve);

        System.out.println();
        System.out.println("**********************************************************");
    }
}
