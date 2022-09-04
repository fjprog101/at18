package jalau.at18.katas.bankocr.maria;

import java.util.ArrayList;
import java.util.List;

public class ProcessAccountLineFile {
    private ConvertAccount convertAccount = new ConvertAccount();
    private List<String> accounts = new ArrayList<>();

    public void readAccountLines(List<String> contentFileRead) {
        List<String> threeLines = new ArrayList<>();
        for (String element : contentFileRead) {
            processAccount(threeLines, element);
        }
    }

    private void processAccount(List<String> threeLines, String element) {
        if (!element.isEmpty()) {
            threeLines.add(element);
        } else {
            accounts.add(convertAccount.convertLinesToAccount(threeLines.get(0), threeLines.get(1), threeLines.get(2)));
            threeLines.clear();
        }
    }

    public List<String> getAccounts() {
        return accounts;
    }
}
