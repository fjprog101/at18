package jalau.at18.katas.bankocr.adriana;

public class PrinterVerifier extends Printers {
    private Account account;

    public PrinterVerifier(Account account) {
        this.account = account;
    }

    @Override
    String getMessage() {
        AccountVerifier verifier = new AccountVerifier(account);
        return verifier.getStatusAccount() + "\n";
    }
}
