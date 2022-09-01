package jalau.at18.katas.bankocr.adriana;

public class Account {
    private static final int NUMBER_TEN = 10;
    private Digit[] accountDigits;
    private int[] acountNumber;

    public Account(Digit[] accountDigits) {
        this.accountDigits = accountDigits;
        acountNumber = new int[accountDigits.length];
        setAccountNumber();
    }

    public int[] getAccountNumber() {
        return acountNumber;
    }

    public void setAccountNumber() {
        acountNumber = getDigitsValues();
    }

    public int[] getDigitsValues() {
        int[] digitsValues = new int[accountDigits.length];
        for (int index = 0; index < accountDigits.length; index++) {
            digitsValues[index] = accountDigits[index].getValue();
        }
        return digitsValues;
    }

}
