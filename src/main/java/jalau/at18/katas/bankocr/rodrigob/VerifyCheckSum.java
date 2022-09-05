package jalau.at18.katas.bankocr.rodrigob;

public class VerifyCheckSum {
    private static final int NUMBER_DIGITS = 9;
    private static final int NUMBER_CHECKSUM = 11;
    private int check = 0;

    public VerifyCheckSum() {
    }

    public String checkSumValid(String account) {
        checkSumResult(convertCheckSumNumber(account));
        return getCheckResult() % NUMBER_CHECKSUM == 0 ? "" : " ERR";
    }

    public void checkSumResult(int[] accountNumber) {
        int index = NUMBER_DIGITS - 1;
        for (int numberIncrease = 1; numberIncrease <= NUMBER_DIGITS; numberIncrease++) {
            this.check += numberIncrease * accountNumber[index];
            index--;
        }
    }

    public int getCheckResult() {
        return check;
    }

    public int[] convertCheckSumNumber(String account) {
        int[] accountNumber = new int[account.length()];
        for (int index = 0; index < account.length(); index++) {
            accountNumber[index] = Character.getNumericValue(account.charAt(index));
        }
        return accountNumber;
    }
}
