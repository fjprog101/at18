package jalau.at18.katas.bankocr.adriana;

public class AccountVerifier {
    private static final int NUMBER_ELEVEN = 11;
    private Account account;
    private String isValidAccountNumber = " ERR";
    private int checkSum;

    public AccountVerifier(Account account) {
        this.account = account;
        this.checkSum = getCheckSum();
        isValidAccountNumber = isValidAccountNumber();
    }
    public int getCheckSum() {
        checkSum = 0;
        for (int index = 0; index < account.getAccountNumber().length; index++) {
            checkSum += Integer.parseInt(account.getAccountNumber()[index])  * (account.getAccountNumber().length - index);
        }
        return checkSum;
    }
    public String isValidAccountNumber() {
        if (checkSum % NUMBER_ELEVEN == 0) {
            isValidAccountNumber = " ";
        }
        return isValidAccountNumber;
    }
}
