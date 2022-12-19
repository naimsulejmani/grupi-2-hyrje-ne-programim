package decision_selection.comparasion;

public class CharacterComparasion {
    public static void main(String[] args) {
        char ch1 = 'G';
        char ch2 = '8';
        char ch3 = 'u';
        char ch4 = '%';

        if (ch1 >= 'A' && ch1 <= 'Z')
            System.out.printf("Shkronja %c eshte shkronje e madhe!%n", ch1);
        else
            System.out.printf("Shkronja %c nuk eshte shkronje e madhe!%n", ch1);

        System.out.printf("Shkonja %c eshte shkronje e vogel: %b%n",
                ch3,
                ch3 >= 'a' && ch3 <= 'z'
        );
        System.out.printf("Karakteri %c eshte nje numer: %b%n",
                ch2,
                ch2 >= '0' && ch2 <= '9'
        );
        System.out.printf("Karakteri %c eshte nje numer: %b%n",
                ch4,
                ch4 >= '0' && ch4 <= '9'
        );
    }
}










