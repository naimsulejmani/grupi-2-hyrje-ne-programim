package datatypes.ushtrime;

import java.time.LocalDate;
import java.util.Scanner;

public class EArka {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        final double VALUE_1_CENT = 0.01;
        final double VALUE_2_CENT = 0.02;
        final double VALUE_5_CENT = 0.05;
        final double VALUE_10_CENT = 0.10;
        final double VALUE_20_CENT = 0.20;
        final double VALUE_50_CENT = 0.50;

        final double VALUE_1_EURO = 1.00;
        final double VALUE_2_EURO = 2.00;
        final double VALUE_5_EURO = 5.00;

        final double VALUE_10_EURO = 10.00;
        final double VALUE_20_EURO = 20.00;
        final double VALUE_50_EURO = 50.00;

        final double VALUE_100_EURO = 100.00;
        final double VALUE_200_EURO = 200.00;
        final double VALUE_500_EURO = 500.00;

        System.out.print("Shkruaj sa 1-centshe keni: ");
        int count1cent = reader.nextInt();
        System.out.print("Shkruaj sa 2-centshe keni: ");
        int count2cent = reader.nextInt();
        System.out.print("Shkruaj sa 5-centshe keni: ");
        int count5cent = reader.nextInt();
        System.out.print("Shkruaj sa 10-centshe keni: ");
        int count10cent = reader.nextInt();
        System.out.print("Shkruaj sa 20-centshe keni: ");
        int count20cent = reader.nextInt();
        System.out.print("Shkruaj sa 50-centshe keni: ");
        int count50cent = reader.nextInt();

        System.out.print("Shkruaj sa 1-euro keni:");
        int count1euro = reader.nextInt();
        System.out.print("Shkruaj sa 2-euro keni:");
        int count2euro = reader.nextInt();
        System.out.print("Shkruaj sa 5-euro keni:");
        int count5euro = reader.nextInt();

        System.out.print("Shkruaj sa 10-euro keni:");
        int count10euro = reader.nextInt();
        System.out.print("Shkruaj sa 20-euro keni:");
        int count20euro = reader.nextInt();
        System.out.print("Shkruaj sa 50-euro keni:");
        int count50euro = reader.nextInt();

        System.out.print("Shkruaj sa 100-euro keni:");
        int count100euro = reader.nextInt();
        System.out.print("Shkruaj sa 200-euro keni:");
        int count200euro = reader.nextInt();
        System.out.print("Shkruaj sa 500-euro keni:");
        int count500euro = reader.nextInt();

        System.out.println("----------------------------------------");
        System.out.printf("%15s %6d %15.2f EUR%n", "1 centshe:", count1cent, count1cent * VALUE_1_CENT);
        System.out.printf("%15s %6d %15.2f EUR%n", "2 centshe:", count2cent, count2cent * VALUE_2_CENT);
        System.out.printf("%15s %6d %15.2f EUR%n", "5 centshe:", count5cent, count5cent * VALUE_5_CENT);

        System.out.printf("%15s %6d %15.2f EUR%n", "10 centshe:", count10cent, count10cent * VALUE_10_CENT);
        System.out.printf("%15s %6d %15.2f EUR%n", "20 centshe:", count20cent, count20cent * VALUE_20_CENT);
        System.out.printf("%15s %6d %15.2f EUR%n", "50 centshe:", count50cent, count50cent * VALUE_50_CENT);

        System.out.printf("%15s %6d %15.2f EUR%n", "1 euro:", count1euro, count1euro * VALUE_1_EURO);
        System.out.printf("%15s %6d %15.2f EUR%n", "2 euro:", count2euro, count2euro * VALUE_2_EURO);
        System.out.printf("%15s %6d %15.2f EUR%n", "5 euro:", count5euro, count5euro * VALUE_5_EURO);

        System.out.printf("%15s %6d %15.2f EUR%n", "10 euro:", count10euro, count10euro * VALUE_10_EURO);
        System.out.printf("%15s %6d %15.2f EUR%n", "20 euro:", count20euro, count20euro * VALUE_20_EURO);
        System.out.printf("%15s %6d %15.2f EUR%n", "50 euro:", count50euro, count50euro * VALUE_50_EURO);

        System.out.printf("%15s %6d %15.2f EUR%n", "100 euroshat:", count100euro, count100euro * VALUE_100_EURO);
        System.out.printf("%15s %6d %15.2f EUR%n", "200 euroshat:", count200euro, count200euro * VALUE_200_EURO);
        System.out.printf("%15s %6d %15.2f EUR%n", "500 euroshat:", count500euro, count500euro * VALUE_500_EURO);


        System.out.println("----------------------------------------");
        double totali = count1cent * VALUE_1_CENT + count2cent * VALUE_2_CENT +
                count5cent * VALUE_5_CENT + count10cent + VALUE_10_CENT
                + count20cent * VALUE_20_CENT + count50cent * VALUE_50_CENT
                + count1euro * VALUE_1_EURO + count2euro * VALUE_2_EURO
                + count5euro * VALUE_5_EURO + count10euro * VALUE_10_EURO
                + count20euro * VALUE_20_EURO + count50euro * VALUE_50_EURO
                + count100euro * VALUE_100_EURO + count200euro * VALUE_200_EURO
                + count500euro * VALUE_500_EURO;
        System.out.printf("TOTALI:     %22.2f EUR%n", totali);
        System.out.println("----------------------------------------");
        System.out.printf("Data:          %22s%n", LocalDate.now());
        System.out.println("----------------------------------------");
    }
}












