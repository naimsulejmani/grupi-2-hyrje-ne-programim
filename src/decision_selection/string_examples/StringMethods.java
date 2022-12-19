package decision_selection.string_examples;

public class StringMethods {
    public static void main(String[] args) {
        String text = "Pavarsia e Kosoves eshte shpallur me 17.02.2008 (Shkurt)!";
        System.out.printf("Shkronja e pare e tekstit: %c %n", text.charAt(0));
        System.out.printf("Shkronja e dhjete e tekstit: %c %n", text.charAt(9));

        System.out.printf("Gjatsia e tekstit eshte %d karaktere!%n", text.length());
        System.out.printf("Shkronja e fundit e tekstit eshte: %c%n",
                text.charAt(text.length() - 1)
        );
        System.out.println("text".length());

        String emriPlote = String.format("%s %s %d", "Naim", "Sulejmani", 100);
        System.out.println(emriPlote);

        System.out.println("Teksti prej indeksit te 10 e tutje: "
                + text.substring(10));
        System.out.println("Teksti me 10 karaketeret e para: "
                + text.substring(0, 10));

        System.out.println("A ekziton fjala Kosoven ne tekst: " + text.contains("Kosoven"));
        System.out.println("A ekziton fjala Kosoves ne tekst: " + text.contains("Kosoves"));
        System.out.println(text.contains("17"));

        String elementet = String.join("      ",
                "1", "2", "3", "4", "Hello", "Test");
        System.out.println(elementet);

        System.out.println("A eshte teksti i zbrazur: " + text.isEmpty());
        System.out.println("".isEmpty());

        System.out.println("A eshte teksti i zbrazur: " + text.isBlank());
        System.out.println("   ".isBlank());

        String kampioni = "Franca".concat(" kishte me qene kampion!")
                .concat("Nese sishte kan Argjentina!")
                .concat(text);

        System.out.println(kampioni);

        String kampioni1 = "Franca eshte kampion"
                .replaceAll("Franca", "Argjentina");
        System.out.println(kampioni1);

        System.out.println("Zevendeso tekstin Kosoves me Kosova: "
                + text.replaceAll("Kosoves", "Kosova")
        );

        System.out.println(text);
        text = text.replace('e', 'E');
        System.out.println(text);

        text = text.replaceAll("\\.02\\.", " Shkurt ");
        System.out.println(text);

        System.out.println("Naim".equalsIgnoreCase("naim"));

        String[] splittedText = text.split(" ");
        System.out.println(splittedText.length);
        System.out.println("Hello people te Kosoves!".split(" ").length);


        System.out.printf("Indeksi i shkronjes S ne tekst eshte: %d %n",
                text.indexOf('S')
        );
        System.out.printf("Indeksi i shkronjes X ne tekst eshte: %d %n",
                text.indexOf('X')
        );
        System.out.printf("Gjej indeksin e shkronjes a pas indeksit te 10:  %d%n",
                text.indexOf('a', 10)
        );

        System.out.println("Prej cilit indeks fillon fjala eshte ne tekst: "
                + text.indexOf("EshtE"));


        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println("  NAIM SULEJMANI  ".trim());
        System.out.println("Hello".repeat(10));

        System.out.println(text.startsWith("Pavarsia"));
        System.out.println(text.startsWith("pavarsia"));

        System.out.println(text.endsWith("(Shkurt)!"));
        System.out.println(text.endsWith("(Shkurt)?"));
    }
}






