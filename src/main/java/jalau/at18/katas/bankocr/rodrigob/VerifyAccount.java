package jalau.at18.katas.bankocr.rodrigob;

public class VerifyAccount {
    private static final int NUMBER_DIGITS = 9;
    private int check = 0;

    public VerifyAccount() {
    }

    public boolean isAccountValid(String account) {
        checkResult(convertAccountNumber(account));
        boolean verify = getCheckResult() % 11 == 0 ? true:false;
        return verify;
    }

    public void checkResult(int[] accountNumber) {
        int index = NUMBER_DIGITS - 1;
        for(int numberIncrease = 1; numberIncrease <= NUMBER_DIGITS; numberIncrease++) {
            this.check += numberIncrease*accountNumber[index];
            index--;
        }
    }

    public int getCheckResult() {
        return check;
    }

    public int[] convertAccountNumber(String account) {
        int[] accountNumber = new int [account.length()];
        for (int index = 0; index < account.length(); index++) {
            accountNumber[index] = Character.getNumericValue(account.charAt(index));
        }
        return accountNumber;
    }
}
