package decision_selection;

public class TernaryOperator {
    public static void main(String[] args) {
        char gender = 'M';

        String genderString = (gender == 'M' || gender == 'm') ? "Mashkull" : "Femer";

        if (gender == 'M' || gender == 'm') {
            genderString = "Mashkull";
        } else {
            genderString = "Femer";
        }

        System.out.println(genderString);
    }
}
