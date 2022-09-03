package jalau.at18.katas.bankocr.maria;

import java.util.ArrayList;
import java.util.List;

public class ProcessAccountLineFile {
    private ConvertAccount convertAccount = new ConvertAccount();
    private List<String> accounts = new ArrayList<>();

    public void readAccountLines(List<String> contentFileRead) {
        List<String> threeLines = new ArrayList<>();
        for (String element : contentFileRead) {
            if (!element.isEmpty()) {
                threeLines.add(element);
            } else {
                String account = convertAccount.convertLinesToAccount(threeLines.get(0), threeLines.get(1), threeLines.get(2));
                threeLines.clear();
                accounts.add(account);
            }
        }
    }

    public List<String> getAccounts() {
        return accounts;
    }
}
