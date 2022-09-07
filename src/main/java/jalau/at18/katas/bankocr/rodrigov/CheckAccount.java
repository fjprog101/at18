package jalau.at18.katas.bankocr.rodrigov;

import java.io.FileNotFoundException;

public class CheckAccount {
    private CheckSum checkSum;
    private PrintNumberAccount printNumberAccount;
    private String accountVerified;
    public CheckAccount() throws FileNotFoundException {
        checkSum = new CheckSum();
        printNumberAccount = new PrintNumberAccount();
    }

    public String returnNumberAccount() {
        accountVerified = checkSum.verificateCheckSum() ? printNumberAccount.printAccount() : printNumberAccount.printAccount() + " ERR";
        return accountVerified;
    }
}
