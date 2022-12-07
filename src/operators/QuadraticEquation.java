package operators;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Shkruaj a  =");
        double a = reader.nextDouble();

        System.out.println("Shkruaj b  =");
        double b = reader.nextDouble();

        System.out.println("Shkruaj c  =");
        double c = reader.nextDouble();

        double x1;
        double x2;

        double determinator = b * b - 4 * a * c;

        x1 = (-b + Math.sqrt(determinator)) / (2 * a);
        x2 = (-b - Math.sqrt(determinator)) / (2 * a);

        System.out.printf("X1 = %.2f%nX2 = %.2f%n", x1, x2);
    }
}









