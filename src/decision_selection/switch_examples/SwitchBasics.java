package decision_selection.switch_examples;

import java.util.Scanner;

public class SwitchBasics {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj diten e javes(1-7): ");
        int ditaEJaves = reader.nextInt();

        switch (ditaEJaves) {
            case 1:
                System.out.println("Sot eshte e hene!");
                break;
            case 2:
                System.out.println("E Marte");
                break;
            case 3:
                System.out.println("E Merkure");
                break;
            case 4:
                System.out.println("E Enjte");
                break;
            case 5:
                System.out.println("E Premte / E Xhumah");
                break;
            case 6:
            case 7:
                System.out.println("Fundjava / Weekend!");
                break;
            default:
                System.out.println("Java i ka fiks 7 dite, as me pak as me shume!");
                break;
        }
    }
}













