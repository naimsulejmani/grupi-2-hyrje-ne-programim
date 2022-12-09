package operators;

public class ComparisonOperator {
    public static void main(String[] args) {
        boolean aEshteFillimiIShekullit = 2022 % 100 == 0;
        boolean aEshteFillimiIMileniumit = 2000 % 1000 == 0;
        System.out.println(aEshteFillimiIShekullit);
        System.out.println(aEshteFillimiIMileniumit);

        int golaKroacia = 4;
        int golaBrazili = 2;
        boolean vazhdonKroacia = golaKroacia > golaBrazili;
        boolean vazhdonBrazili = golaBrazili > golaKroacia;
        System.out.println("Vazhdon Kroacia " + vazhdonKroacia);
        System.out.println("Vazhdon Brazili " + vazhdonBrazili);

        System.out.println(vazhdonBrazili ? "Vazhdon Brazili": "Vazhdon Kroacia");

        int muaji = 12;
        boolean aEshteMuajValid = muaji >= 1 && muaji <= 12;
        System.out.println("Muaji valid " + aEshteMuajValid);
    }
}








