package jalau.at18.katas.bankocr.sarai;

public class DigitCharacter {
    private static final int SIZETOTALDIGIT = 27;
    private static final int SIZENINEDIGIT = 9;
    private static final int SIZETHREE = 3;
    private String[] matrixSize;
    private int[]finalAcount;
    private Position number;

    public DigitCharacter(String[] matrixSize) {
        this.matrixSize = matrixSize;
        finalAcount = new int[SIZENINEDIGIT];
        this.number = new Position(matrixSize);
        setTraverseInput(0);
    }

    public void setTraverseInput(int cont) { //cont = 0;
        for (int index = 0; index < SIZETOTALDIGIT; index += SIZETHREE) {
            DigitReader acount = new DigitReader(number.getposition(index));
            finalAcount[cont] = acount.getnaturalNumbers();
            cont += 1;
        }
    }

    public String getfinalAcount(String value) { //String value = "";
        for (int index = 0; index < SIZENINEDIGIT; index++) {
            value += Integer.toString(finalAcount[index]);
        }
        return value;
    }

    public int[] getTraverseInput() {
        return finalAcount;
    }
}
