package jalau.at18.katas.bankocr.adriana;

public class AccountVerifier {
    private static final int NUMBER_ELEVEN = 11;
    private Account account;
    private boolean isValidAccountNumber = false;
    private int checkSum;

    public AccountVerifier(Account account) {
        this.account = account;
        this.checkSum = getCheckSum();
        isValidAccountNumber = isValidAccountNumber();
    }
    public int getCheckSum() {
        checkSum = 0;
        for (int index = 0; index < account.getAccountNumber().length; index++) {
            checkSum += account.getAccountNumber()[index] * (account.getAccountNumber().length - index);
        }
        return checkSum;
    }
    public boolean isValidAccountNumber() {
        if (checkSum % NUMBER_ELEVEN == 0) {
            isValidAccountNumber = true;
        }
        return isValidAccountNumber;
    }

}
