package datatypes.adhoc;

import java.util.Scanner;

public class SyprinaERrethit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj rrezen e rrethit (cm): ");
        double rrezja = reader.nextDouble();

        double syprina = Math.PI * rrezja * rrezja;
        System.out.printf("Syprina e rrethit eshte %.2f cm2%n", syprina);
    }
}
