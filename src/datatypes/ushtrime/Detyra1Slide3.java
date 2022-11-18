package datatypes.ushtrime;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Detyra1Slide3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj ekipin e pare: ");
        String ekipiPare = reader.nextLine();

        System.out.println("Shkruaj ekipin e dyte: ");
        String ekipiDyte = reader.nextLine();

        System.out.println("Sa gola i ka dhene " + ekipiPare + ": ");
        int golaEkipaPare = reader.nextInt();

        System.out.println("Sa gola i ka dhene " + ekipiDyte + ": ");
        int golaEkipiDyte = reader.nextInt();

        System.out.println(ekipiPare + " - " + ekipiDyte + "  "
                + golaEkipaPare + " : " + golaEkipiDyte);

        System.out.printf("%s - %s   %d : %d",
                ekipiPare, ekipiDyte, golaEkipaPare, golaEkipiDyte
        );

    }
}













