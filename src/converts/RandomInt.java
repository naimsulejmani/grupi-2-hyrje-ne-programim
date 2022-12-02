package converts;

import java.util.Scanner;

public class RandomInt {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
        int numri = reader.nextInt();
        int randomNumber = (int) (Math.random() * (numri + 1));
        System.out.println(randomNumber);
    }
}
