package operators;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Nr1 = ");
        int a = reader.nextInt();
        System.out.println("Nr2 = ");
        int b = reader.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Nr1 = " + a);
        System.out.println("Nr2 = " + b);

        // analize a=5, b = 3
        // Autori: Edison Hajdari :)
        a = a + b; // a=8;
        b = a - b; // b=5
        a = a - b; // a=3;
        System.out.println("Nr1 = " + a);
        System.out.println("Nr2 = " + b);


    }
}












