package jalau.at18.katas.bankocr.maria;

import java.util.List;

public class VerifyAccount {
    private ProcessAccountLineFile processAccountLineFile = new ProcessAccountLineFile();

    public void verifyValidAccounts(List<String> accountList) {
        for (String account : accountList) {
            CheckSum checkSum = new CheckSum(account);
            if (checkSum.isValidAccountNumber()) {
                System.out.println("Account: " + account + " valid");
            } else {
                System.out.println("Account: " + account + " invalid");
            }
        }
    }

}
