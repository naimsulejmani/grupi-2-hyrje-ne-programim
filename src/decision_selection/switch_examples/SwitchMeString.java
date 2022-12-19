package decision_selection.switch_examples;

import java.util.Scanner;

public class SwitchMeString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj menyne e aplikacionit: ");
        String menu = reader.nextLine();

        switch (menu) {
            case "admin":
            case "Admin":
                System.out.println("Welcome to Admin page!");
                break;
            case "user", "User":
                System.out.println("Welcome to User page!");
                break;
            default:
                System.out.println("Page not found / 404");
                break;
        }

    }
}










