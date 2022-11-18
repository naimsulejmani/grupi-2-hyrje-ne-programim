package datatypes;

public class ScopeExample {
    public static void main(String[] args) {
        int viti = 2020;
        //scope
        {
            viti = 2021;
            int muaji = 11;
            //dita = 23; // nukshihet pse eshte deklaruar me vone
        }
        int dita = 22;
        viti = 2022;
        //muaji = 12; // nuk shihet per shkak se scope eshte i mbyllur
        // me larte


    }
}
