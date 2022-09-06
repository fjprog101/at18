package jalau.at18.katas.bankocr.daniela;

public class StatusAccount extends BankAccount {
    private String entry = getDigitChar();

    public StatusAccount(String line1, String line2, String line3, int sizeValue, int sizenumbers) {
        super(line1, line2, line3, sizenumbers);
    }

    public int status(int bad) {
        for (int i = 0; i < 9; i++) {
            char result = entry.charAt(i);
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
