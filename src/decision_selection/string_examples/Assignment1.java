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

        if (startIndex < endIndex && startIndex >= 0 && endIndex < text.length()) {
            System.out.println("Rezultati: " + text.substring(startIndex, endIndex));
        } else {
            System.out.println("Indeksat nuk jane te pershtatshem per me nxjerr nje nen-tekst");
        }

        System.out.println("Shkruani fjalen qe po kerkoni: ");
        String searchText = reader.nextLine();

        if (text.contains(searchText)) {
            System.out.println("Fjala e kerkuar gjendet ne tekst, dhe fillon nga indeksi: "
                    + text.indexOf(searchText));
        } else {
            System.out.println("Fjala qe keni kerkuar nuk gjendet ne tekst!");
        }


        System.out.println("Shkruani fjalen qe po kerkoni me zavendesu: ");
        String oldText = reader.nextLine();
        System.out.println("Shkruani fjalen zevendesuese: ");
        String newText = reader.nextLine();
        // text = text.replace(oldText, newText); //kjo e ndryshon vlerne e variables text
        if (oldText.equals(newText) || !text.contains(oldText)) {
            System.out.println("Teksti i dhene nuk pesoi ndryshime!");
        } else {
            System.out.println(text.replace(oldText, newText));
        }
    }
}











