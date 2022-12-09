package decision_selection;

public class NestedIfElse {
    public static void main(String[] args) {
        double n1 = -2.5, n2 = 5.5, n3 = -1, largestNumber;

        if (n1 >= n2) {
            if (n1 >= n3) {
                largestNumber = n1;
            } else {
                largestNumber = n3;
            }
        } else {
            if (n2 >= n3) {
                largestNumber = n2;
            } else {
                largestNumber = n3;
            }
        }
        System.out.println(largestNumber);
    }
}












