package datatypes.adhoc;

import java.util.Scanner;

public class LigjiNjutonit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj masen e trupit (kg): ");
        double masa = reader.nextDouble();

        System.out.println("Shkruaj nxitimin e trupit (m/s2): ");
        double nxitimi = reader.nextDouble();

        double forca = masa * nxitimi;

        System.out.printf("Forca e trupit eshte %.2f N%n", forca);
    }
}





