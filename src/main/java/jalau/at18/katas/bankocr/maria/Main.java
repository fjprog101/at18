package jalau.at18.katas.bankocr.maria;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BankOCR bankOCR = new BankOCR();
        List<String> accounts = bankOCR.processAccountFromFile("numbers.txt");
        System.out.println(accounts);
        VerifyAccount verifyAccount = new VerifyAccount();
        verifyAccount.verifyValidAccounts(accounts);

    }
}
