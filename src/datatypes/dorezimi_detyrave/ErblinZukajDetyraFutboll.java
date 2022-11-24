package datatypes.dorezimi_detyrave;

import java.util.Scanner;

public class ErblinZukajDetyraFutboll {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ekipi vendas: ");
        String ekipiVendas = reader.nextLine();
        System.out.println("Ekipi musafir: ");
        String ekipiMusafir = reader.nextLine();
        System.out.println("Numri i tifozeve: ");
        int numriTifozeve = Integer.parseInt(reader.nextLine());
        System.out.println("Fusha/Arena: ");
        String fushaArena = reader.nextLine();
        System.out.println("Sa gola ka shenuar "+ekipiVendas+" :");
        int golateVendaseve = Integer.parseInt(reader.nextLine());
        System.out.println("Sa gola ka shenuar "+ekipiMusafir+" :");
        int golateMusafireve = Integer.parseInt(reader.nextLine());
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Rezultati perfundimtar");
        System.out.printf("%s-%s %d-%d", ekipiVendas, ekipiMusafir, golateVendaseve, golateMusafireve);
        System.out.println("\n"+"Stadiumi "+fushaArena+" me gjithsej "+numriTifozeve+" spektatore prezent.");
        System.out.println("-------------------------------------------------------------------");
    }
}
