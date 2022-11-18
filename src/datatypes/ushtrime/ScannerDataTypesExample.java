package datatypes.ushtrime;

import java.util.Scanner;

public class ScannerDataTypesExample {
    public static void main(String[] args) {
        // krijimi i objektit qe na sherben me lexu te dhena
        // prej shfrytezuesit
        Scanner reader = new Scanner(System.in);

        System.out.println("Shkruaj nje vlere byte: ");
        byte byteVariable = reader.nextByte();
        System.out.println("Vlera e dhene byte eshte: " + byteVariable);

        System.out.println("Shkruaj nje vlere short: ");
        short shortVariable = reader.nextShort();
        System.out.println("Vlera e dhene short eshte: " + shortVariable);

        System.out.println("Shkruaj nje vlere int: ");
        int intVariable = reader.nextInt();
        System.out.println("Vlera e dhene int eshte: " + intVariable);

        System.out.println("Shkruaj nje vlere long: ");
        long longVariable = reader.nextLong();
        System.out.println("Vlera e dhene long eshte: " + longVariable);

        System.out.println("Shkruaj nje vlere float: ");
        float floatVariable = reader.nextFloat();
        System.out.println("Vlera e dhene float eshte: " + floatVariable);

        System.out.println("Shkruaj nje vlere double: ");
        double doubleVariable = reader.nextDouble();
        System.out.println("Vlera e dhene double eshte: " + doubleVariable);

        System.out.println("Shkruaj nje vlere boolean(true/false): ");
        boolean booleanVariable = reader.nextBoolean();
        System.out.println("Vlera e dhene boolean eshte: " + booleanVariable);

        System.out.println("Shkruaj nje vlere char: ");
        char charVariable = reader.next().charAt(0); // merre shkronjen e pare te tekstit
        System.out.println("Vlera e dhene char eshte: " + charVariable);

        reader.nextLine(); // kur lexojme String pas ndonje tipi primitive
        //duhet me be kete :)

        System.out.println("Shkruaj nje vlere String: ");
        String textVariable = reader.nextLine();
        System.out.println("Vlera e dhene string eshte: " + textVariable);


    }
}












