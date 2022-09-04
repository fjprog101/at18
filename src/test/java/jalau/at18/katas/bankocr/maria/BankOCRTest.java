package jalau.at18.katas.bankocr.maria;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BankOCRTest {
    @Test
    public void processAccountFromFile() {
        List<String> accounts = new ArrayList<>();
        String account1 = "000000000";
        String account2 = "192345678";
        accounts.add(account1);
        accounts.add(account2);
        BankOCR bankOCR = new BankOCR();
        List<String> resultAccounts = bankOCR.processAccountFromFile("TestFile.txt");
        assertEquals(accounts, resultAccounts);
    }

}
