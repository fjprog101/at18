package jalau.at18.katas.bankocr.maria;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerifyListAccounts {
    public Map<String, Boolean> verifyValidAccounts(List<String> accountList) {
        Map<String, Boolean> validAccounts = new HashMap<String, Boolean>();
        for (String account : accountList) {
            CheckSum checkSum = new CheckSum(account);
            validAccounts.put(account, checkSum.isValidAccountNumber());
        }
        return validAccounts;
    }
}
