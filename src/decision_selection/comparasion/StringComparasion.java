package decision_selection.comparasion;

public class StringComparasion {
    public static void main(String[] args) {
        String name1 = "Naim";
        String name2 = "Naime";
        String name3 = "Albin";
        String name4 = "Albina";
        String name5 = "Altin";

        System.out.println(name1.equals(name2));
        System.out.println(!name1.equals(name2));
        System.out.println(name1.equals("Naim"));
        System.out.println("Naim".equals(name1));

        System.out.println("A".compareTo("B"));
        System.out.println("B".compareTo("A"));
        System.out.println(name1.compareTo(name4));
        System.out.println(name4.compareTo(name5));
        System.out.println(name5.compareTo(name4));
    }
}
