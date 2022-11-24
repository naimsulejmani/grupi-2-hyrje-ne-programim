package datatypes.adhoc;

import java.util.Scanner;

public class SyprinaEKatrorit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj brinjen e katrorit (cm): ");
        double brinja = reader.nextDouble();
        double syprina = brinja * brinja;
        System.out.printf("Syprina e katrorit eshte: %.2f cm2%n", syprina);
    }
}
