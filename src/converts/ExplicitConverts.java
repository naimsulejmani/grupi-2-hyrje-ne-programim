package converts;

public class ExplicitConverts {
    public static void main(String[] args) {
        int intVariable = 123;
        byte byteVariable = (byte) intVariable; //CAST -> pot urdheroj me konvertu int ne byte

        System.out.println(byteVariable);
        System.out.println(intVariable);

        intVariable = 174;
        byteVariable = (byte) intVariable;

        System.out.println(intVariable);
        System.out.println(byteVariable);
    }
}






