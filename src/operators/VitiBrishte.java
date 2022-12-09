package operators;

import java.util.Scanner;

public class VitiBrishte {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj vitin: ");
        int viti = reader.nextInt();

        boolean vitiBrishte = (viti % 400 == 0)
                || (viti % 4 == 0 && viti % 100 != 0);

        System.out.println(vitiBrishte);
        System.out.println(vitiBrishte ? "Viti eshte i brishte" : "Viti eshte normal");
    }
}








