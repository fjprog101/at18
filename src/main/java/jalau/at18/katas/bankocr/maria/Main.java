package jalau.at18.katas.bankocr.maria;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SetNumberToConvert setNumberToConvert = new SetNumberToConvert();
        ConvertNumber convertNumber = new ConvertNumber(setNumberToConvert);
        ConvertAccount convertAccount = new ConvertAccount(convertNumber);
        ProcessAccountLineFile processAccountLineFile = new ProcessAccountLineFile(convertAccount);
        ReadFile readFile = new ReadFile("numbers.txt");
        BankOCR bankOCR = new BankOCR(processAccountLineFile, readFile);
        List<String> accounts = bankOCR.processAccountFromFile();
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
