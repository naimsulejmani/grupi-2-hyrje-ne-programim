package decision_selection.string_examples;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //kerkesa1
        System.out.println("Shkruani tekstin: ");
        String text = reader.nextLine();
        System.out.printf("Teksi ka gjatesi prej %d karaktereve.%n", text.length());
        //kerkesa2
        System.out.println("Shkruaj indeksin nga 0 deri me " + (text.length() - 1));
        int indeksi = Integer.parseInt(reader.nextLine());
        System.out.println("Rezultati: " + text.substring(indeksi));
        //kerkesa3
        System.out.printf("Shkruani indeksin e fillimit nga 0 deri me %d: %n", text.length() - 1);
        int startIndex = Integer.parseInt(reader.nextLine());
        System.out.printf("Shkruani indeksin e mbarimit nga %d deri me %d: %n",
                startIndex, text.length() - 1
        );
        int endIndex = Integer.parseInt(reader.nextLine());
        System.out.println("Rezultati: " + text.substring(startIndex, endIndex));

    }
}











