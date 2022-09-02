package jalau.at18.katas.bankocr.adriana;

public class AccountVerifier {
    private Account account;
    private String statusAccount = " ";

    public AccountVerifier(Account account) {
        this.account = account;
        setStatusAccount();
    }
    public String getStatusAccount() {
        return statusAccount;
    }
    public void setStatusAccount() {
        isValidAccountNumber();
        isValidDigits();
    }
    public void isValidAccountNumber() {
        if (!new NumberAccountVerifier(account).isValidAccountNumber()) {
            statusAccount = " ERR";
        }
    }
    public void isValidDigits() {
        if (!new DigitVerifier(account).isValidDigits()) {
            statusAccount = " ILL";
        }
    }


}
