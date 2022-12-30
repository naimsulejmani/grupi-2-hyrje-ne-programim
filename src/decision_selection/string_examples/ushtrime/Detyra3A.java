package decision_selection.string_examples.ushtrime;

import java.util.Scanner;

public class Detyra3A {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("jepni moshen ");
        int mosha = reader.nextInt();

        System.out.println("Shtyp M per mashkull, F per femer ");
        char gjinia = reader.next().toLowerCase().charAt(0);

        System.out.println("Shtyp P nese jeni te martuar, J nese jo");
        char statusi = reader.next().toLowerCase().charAt(0);

        if (gjinia == 'f' || (gjinia == 'm' && mosha >= 40 && mosha <= 60)) {
            System.out.println("mund te punoni vetem ne zonat urbane");
        } else if (gjinia == 'm' && mosha >= 20 && mosha <= 40) {
            System.out.println("mund te punoni kudo");
        } else {
            System.out.println("GABIM");
        }

    }
}






