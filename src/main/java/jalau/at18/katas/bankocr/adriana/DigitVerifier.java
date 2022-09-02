package jalau.at18.katas.bankocr.adriana;

public class DigitVerifier {

    private String[] digitsValues;
    private boolean haveValidDigits;

    public DigitVerifier(Account account) {
        this.digitsValues = account.getAccountNumber();
        haveValidDigits = true;
    }

    public boolean isValidDigits() {
        for (int index = 0; index < digitsValues.length; index++) {
            if (digitsValues[index] == "-1") {
                haveValidDigits = false;
            }
        }
        return haveValidDigits;
    }

}
