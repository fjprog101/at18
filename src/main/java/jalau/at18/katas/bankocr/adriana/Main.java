package jalau.at18.katas.bankocr.adriana;

public class Main {
    private static final String ENTRY_LINE_ONE = " _     _  _  _  _  _  _    ";
    private static final String ENTRY_LINE_TWO = " _|  | _|| ||_||_   || ||_|";
    private static final String ENTRY_LINE_THR = " _|  ||_ |_||_||_|  ||_|  |";
    protected static final String[] ENTRY = {ENTRY_LINE_ONE, ENTRY_LINE_TWO, ENTRY_LINE_THR};
    public static void main(String[] args) {
        Bankocr bankocr = new Bankocr(ENTRY);
        bankocr.run();
    }
}
