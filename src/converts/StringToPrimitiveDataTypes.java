package converts;

public class StringToPrimitiveDataTypes {
    public static void main(String[] args) {
        String strByte = "123";
        byte byteVariable = Byte.parseByte(strByte);

        String strInt = "123456";
        int intVariable = Integer.parseInt(strInt);

        String strBoolean = "false";
        boolean booleanVariable = Boolean.parseBoolean(strBoolean);

        String strDouble = "123.123";
        double doubleVariable = Double.parseDouble(strDouble);
    }
}
