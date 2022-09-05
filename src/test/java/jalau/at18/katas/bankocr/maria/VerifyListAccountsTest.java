package jalau.at18.katas.bankocr.maria;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class VerifyListAccountsTest {
    @Test
    public void verifyValidAccounts() {
        VerifyListAccounts verifyListAccounts = new VerifyListAccounts();
        List<String> accountList = new ArrayList<>();
        accountList.add("345882865");
        accountList.add("111111111");
        Map<String, AccountStatusEnum> validAccounts = new HashMap<String, AccountStatusEnum>();
        validAccounts.put("345882865", AccountStatusEnum.VALID);
        validAccounts.put("111111111", AccountStatusEnum.ERR);
        assertEquals(validAccounts, verifyListAccounts.verifyValidAccounts(accountList));
    }
    @Test
    public void verifyAccountWithQuestionMark() {
        VerifyListAccounts verifyListAccounts = new VerifyListAccounts();
        List<String> accountList = new ArrayList<>();
        accountList.add("3??882865");
        accountList.add("1?1111111");
        Map<String, AccountStatusEnum> validAccounts = new HashMap<String, AccountStatusEnum>();
        validAccounts.put("3??882865", AccountStatusEnum.ILL);
        validAccounts.put("1?1111111", AccountStatusEnum.ILL);
        assertEquals(validAccounts, verifyListAccounts.verifyValidAccounts(accountList));
    }

}
