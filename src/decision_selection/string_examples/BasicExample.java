package decision_selection.string_examples;

public class BasicExample {
    public static void main(String[] args) {
        String name = new String("Welcome");
        String s1 = "Welcome";
        String s2 = "Welcome";
        String s3 = new String("Welcome");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(name == s3);
    }
}
