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
        Map<String, AccountStatusEnum> mapValidAccounts = verifyListAccounts.verifyValidAccounts(accounts);
        for (Map.Entry<String, AccountStatusEnum> entry : mapValidAccounts.entrySet()) {
            System.out.println("Account: " + entry.getKey() + " " + entry.getValue().getValue());
        }

    }
}
