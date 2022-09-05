package jalau.at18.katas.bankocr.adriana;

public class Account {
    private Digit[] accountDigits;
    private String[] acountNumber;

    public Account(Digit[] accountDigits) {
        this.accountDigits = accountDigits;
        acountNumber = new String[accountDigits.length];
        setAccountNumber();
    }

    public String[] getAccountNumber() {
        return acountNumber;
    }

    public void setAccountNumber() {
        acountNumber = getDigitsValues();
    }

    public String[] getDigitsValues() {
        String[] digitsValues = new String[accountDigits.length];
        for (int index = 0; index < accountDigits.length; index++) {
            digitsValues[index] = accountDigits[index].getValue();
        }
        return digitsValues;
    }
}
