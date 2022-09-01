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
        NumbersCharacters[] arr = NumbersCharacters.values(); // Llamando a values()
        for (NumbersCharacters col : arr) { // enum con bucle
            if (Arrays.deepEquals(tam, col.getcharacternumbers())) {
                naturalNumbers = col.ordinal(); //recorrer el enum
            }
        }
    }
    public int getrecorrer() {
        return naturalNumbers;
    }
}
