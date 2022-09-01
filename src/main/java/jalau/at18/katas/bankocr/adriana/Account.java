package jalau.at18.katas.bankocr.adriana;

public class Account {
    private static final int NUMBER_TEN = 10;
    private Digit[] accountDigits;
    private int acountNumber;

    public Account(Digit[] accountDigits) {
        this.accountDigits = accountDigits;
        acountNumber = 0;
        setAccountNumber();
    }

    public int getAccountNumber() {
        return acountNumber;
    }

    public void setAccountNumber() {
        int[] digitsValues = getDigitsValues();
        acountNumber = makeInteger(digitsValues);
    }

    public int[] getDigitsValues() {
        int[] digitsValues = new int[accountDigits.length];
        for (int index = 0; index < accountDigits.length; index++) {
            digitsValues[index] = accountDigits[index].getValue();
        }
        return digitsValues;
    }

    public int makeInteger(int[] digitsValues) {
        int number = 0;
        for (int index = accountDigits.length - 1; index >= 0; index--) {
            number += digitsValues[index] * Math.pow(NUMBER_TEN, accountDigits.length - index - 1);
        }
        return number;
    }

}
