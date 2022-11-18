package datatypes;

public class BasicDataTypes {
    public static void main(String[] args) {
        //deklarimi i varibales
        byte tipi;
        //deklarimi dhe inicializimi i variablave
        byte muaji = 11, dita = 10;
        tipi = 0;// percaktimi i vleres se tipit

        System.out.println(dita);
        System.out.println(muaji);

        short paga = 170;
        short viti = 2022;
        short a, b, c = 300;
        System.out.println("Paga minimale eshte: " + paga);

        int videoViewCount = 2_000_000_000;
        int numri1, numri2, numri3 = 300;
        System.out.println("Youtube - Profa Naim tu spjegu ka arritur "
                + videoViewCount + " views!");
        long largesiaETokesMePlanetinX = 2_000_000_000;
        long numri = 6_000_000_000_000L; // per me i be long shtoni ne L ose l ne fund te numrit
        long numriNje = 1L;

        System.out.println(numri);
        long numriPersonal = 123L;

        float temperaturaMin = -25.5F; // rregulla shto nje F ose f te vogel per me per float number
        float temperaturaMax = 38.8f;
        float temperaturaMesatare = 20.5F;
        float temperaturaNjeriut = 37;

        System.out.println("Temperatura mesatare e njeriut eshte: " + temperaturaNjeriut +
                " celcius!");


        double pi = 3.14;
        double numriShumiMadh = 3.141128321371938792D;
        // vlene rreuglla mundemi me vendose shkronje D ose d e vogel

        char shkronjaEPareEMadhe = 65;
        char shkronjaEDyteEMadhe = 'B';
        char shkronjaETreteEVogel = 'c';
        char a1, b1, c1;

        char statusi = 'H';
        char keq = '\u0128';
        System.out.println(shkronjaEPareEMadhe);
        System.out.println(keq);

        boolean isMarried = false;
        boolean selected = true;
        boolean greaterThan = 10 > 5;

        int notaErblinit = 7;
        int notaJetes = 9;

        System.out.println(notaErblinit != notaJetes);
        char apostrofi = '\'';
        char backslash = '\\';
        char carriageReturn = '\r';
        System.out.println("Haim" + carriageReturn + 'N');
        System.out.println("NAIM \r\n SULEJMANI\tKU JE BE\b");


        double katetaA = 4;
        double katetaB = 6;
        double hipotenuza = Math.sqrt(katetaA * katetaA + katetaB * katetaB);
        System.out.println(hipotenuza);
    }
}




