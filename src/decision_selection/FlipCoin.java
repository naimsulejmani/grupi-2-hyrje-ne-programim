package decision_selection;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj 0 per Heads dhe 1 per Tails ne lojen e FlipCoin!");
        byte zgjedhja = reader.nextByte();
        int result = (Math.random() < 0.5) ? 0 : 1;
//        if (Math.random() < 0.5)
//            result = 0;
//        else
//            result = 1;

        if (zgjedhja == result)
            System.out.println("Urime ja keni qelluar 0.25 EUR ne llogari tuaj");
        else
            System.out.println("Fat herave tjera -0.75 EUR ne llogarine tuaj");

        System.out.println(zgjedhja == result ? "Urime" : "Fat!!");

    }
}













