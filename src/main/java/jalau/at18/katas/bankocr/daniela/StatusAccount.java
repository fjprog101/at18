package jalau.at18.katas.bankocr.daniela;

public class StatusAccount extends BankAccount {
    private String entry = getDigitChar();
    private static final int CAPACITY = 9;

    public StatusAccount(String line1, String line2, String line3, int sizeValue, int sizenumbers) {
        super(line1, line2, line3, sizenumbers);
    }

    public int status(int bad) {
        for (int index = 0; index < CAPACITY; index++) {
            char result = entry.charAt(index);
            if (result == '?') {
                bad++;
            }
        }
        return bad;

    }

    public String statusDigits(String status, int bad) {

        if (status(bad) > 0) {
            return "ILL";
        }
        return status;
    }
}
