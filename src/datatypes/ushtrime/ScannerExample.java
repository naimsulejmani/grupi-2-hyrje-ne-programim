package datatypes.ushtrime;


import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your e-mail: ");
        String email = reader.nextLine(); // nextLine eshte metode e cila na lexon
        //tekstin qe e ka shkru shfrytezuesi ne komplet rreshtin
        System.out.println("Your email is: " + email);
    }
}
