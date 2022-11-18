package datatypes.ushtrime;

import java.util.Scanner;

public class BadScannerExample {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String name = myScanner.nextLine();
        int vlera = myScanner.nextInt();
        boolean aJeniLodhe = myScanner.nextBoolean();
        double saPare = myScanner.nextDouble();
    }
}
