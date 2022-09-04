package jalau.at18.katas.bankocr.maria;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BankOCR bankOCR = new BankOCR();
        List<String> accounts = bankOCR.processAccountFromFile("numbers.txt");
        System.out.println(accounts);
        VerifyListAccounts verifyListAccounts = new VerifyListAccounts();
        Map<String, Boolean> mapValidAccounts = verifyListAccounts.verifyValidAccounts(accounts);
        for (Map.Entry<String, Boolean> entry : mapValidAccounts.entrySet()) {
            if (entry.getValue()) {
                System.out.println("Account: " + entry.getKey() + "is valid");
            } else {
                System.out.println("Account: " + entry.getKey() + "is not valid");
            }
        }
    }
}
