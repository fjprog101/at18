package jalau.at18.katas.bankocr.sarai;
import java.util.Arrays;

public class Userstory1 {
    private final int tamArraythree = 3;
    private String[][] tam = new String[tamArraythree][tamArraythree];
    private int naturalNumbers;

    public Userstory1(String[][] tam) {
        this.tam = tam;
        recorrer();
    }

    public void recorrer() {
        // Llamando a values()
        NumbersCharacters[] arr = NumbersCharacters.values();

        // enum con bucle
        for (NumbersCharacters col : arr) {
            if (Arrays.deepEquals(tam, col.getcharacternumbers())) {
                //recorrer el enum
                naturalNumbers = col.ordinal();
            }
        }
        //return naturalNumbers;
    }
    public int getrecorrer() {
        return naturalNumbers;
    }

}
