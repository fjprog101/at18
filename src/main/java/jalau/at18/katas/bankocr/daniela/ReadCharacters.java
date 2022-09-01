package jalau.at18.katas.bankocr.daniela;

public class ReadCharacters {
    private SetValue[] banknumber;
    // private int totalvalue;
    private int[] total;

    public ReadCharacters(SetValue[] banknumber) {
        this.banknumber = banknumber;
        total = new int[banknumber.length]; // Si o si inicializar
        setTotalValue();
    }

    public int[] getValue() {
        return total;
    }

    public void setTotalValue() {

        for (int recorrer = 1; recorrer < banknumber.length; recorrer++) {
            total[recorrer] = banknumber[recorrer].getValue();
        }
    }
}