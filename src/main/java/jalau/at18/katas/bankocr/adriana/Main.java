package jalau.at18.katas.bankocr.adriana;

public class Main {
    private static final String ENTRY_LINE_ONE = " _     _  _  _  _  _  _    ";
    private static final String ENTRY_LINE_TWO = " _|  | _|| ||_||_   || ||_|";
    private static final String ENTRY_LINE_THR = " _|  ||_ |_||_||_|  ||_|  |";
    protected static final String[] FIRST_ENTRY = {ENTRY_LINE_ONE, ENTRY_LINE_TWO, ENTRY_LINE_THR};
    private static final String ENTRY_LINE_FOU = " _     _  _  _  _  _  _    ";
    private static final String ENTRY_LINE_FIV = " _|  | _ | ||_||_    | ||_|";
    private static final String ENTRY_LINE_SIX = " _|  ||_ |_||_||_|  ||_|  |";
    protected static final String[] SECOND_ENTRY = {ENTRY_LINE_FOU, ENTRY_LINE_FIV, ENTRY_LINE_SIX};
    public static void main(String[] args) {
        Bankocr bankocr1 = new Bankocr(FIRST_ENTRY);
        bankocr1.run();
        Bankocr bankocr2 = new Bankocr(SECOND_ENTRY);
        bankocr2.run();
    }
}
