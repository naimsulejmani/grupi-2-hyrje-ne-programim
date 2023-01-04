package iterations.for_loop;

public class BadForExamples {
    public static void main(String[] args) {
        int numri = 0;
        for (; numri <= 10; numri++) {
            System.out.println(numri);
        }

        numri = 0;
        for (; numri <= 10; ) {
            System.out.println(numri);
            numri++;
        }
        numri = 0;
        for (; ; ) {
            if (numri > 10) break;
            System.out.println(numri);
            numri++;
        }


    }
}







