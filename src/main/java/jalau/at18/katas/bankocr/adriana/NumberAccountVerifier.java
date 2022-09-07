package jalau.at18.katas.bankocr.adriana;

public class NumberAccountVerifier {
    private static final int NUMBER_ELEVEN = 11;
    private Account account;
    private int checkSum;
    private Boolean isValidNumberAccount = true;

    public NumberAccountVerifier(Account account) {
        this.account = account;
        this.checkSum = getCheckSum();
        isValidNumberAccount = true;
    }
    public int getCheckSum() {
        checkSum = 0;
        for (int index = 0; index < account.getAccountNumber().length; index++) {
            checkSum += Integer.parseInt(account.getAccountNumber()[index])  * (account.getAccountNumber().length - index);
        }
        return checkSum;
    }
    public Boolean isValidAccountNumber() {
        if (checkSum % NUMBER_ELEVEN != 0) {
            isValidNumberAccount = false;
        }
        return isValidNumberAccount;
    }
}
