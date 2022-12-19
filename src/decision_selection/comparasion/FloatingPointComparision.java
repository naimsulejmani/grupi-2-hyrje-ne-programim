package decision_selection.comparasion;

public class FloatingPointComparision {
    public static void main(String[] args) {
        double value = 1.0;
        value -= 0.1;
        System.out.println(value);
        value -= 0.1;
        System.out.println(value);
        value -= 0.1;
        System.out.println(value);
        value -= 0.1;
        System.out.println(value);
        value -= 0.1;
        System.out.println(value);
        value -= 0.1;
        System.out.println(value);
        value -= 0.1;
        System.out.println(value);
        value -= 0.1;
        System.out.println(value);
        value -= 0.1;
        System.out.println(value);
        value -= 0.1;
        System.out.println(value);

        System.out.println(value == 0.0);
        // marzha e gabimit
        final double TOLERANCE = 0.00000000001;

        System.out.println(Math.abs(value) < TOLERANCE);
        System.out.println(0.8-0.1);

    }
}
