package jalau.at18.katas.bankocr.maria;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerifyListAccounts {
    public Map<String, AccountStatusEnum> verifyValidAccounts(List<String> accountList) {
        Map<String, AccountStatusEnum> validAccounts = new HashMap<String, AccountStatusEnum>();
        for (String account : accountList) {
            defineStatus(validAccounts, account);
        }
        return validAccounts;
    }

    private void defineStatus(Map<String, AccountStatusEnum> validAccounts, String account) {
        CheckSum checkSum = new CheckSum(account);
        validAccounts.put(account, AccountStatusEnum.VALID);
        if (account.contains("?")) {
            validAccounts.put(account, AccountStatusEnum.ILL);
        } else if (!checkSum.isValidAccountNumber()) {
            validAccounts.put(account, AccountStatusEnum.ERR);
        }
    }
}
