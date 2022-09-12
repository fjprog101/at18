package jalau.at18.katas.bankocr.maria;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Map;

public class WriteFile {
    private Map<String, AccountStatusEnum> accountsStatus;

    public WriteFile(Map<String, AccountStatusEnum> listAccountsStatus) {
        this.accountsStatus = listAccountsStatus;
    }

    public void writeFile() throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter("reportaccounts.txt"));
        for (Map.Entry<String, AccountStatusEnum> entry : accountsStatus.entrySet()) {
            printWriter.println("Account: " + entry.getKey() + " " + entry.getValue().getValue());
        }
        printWriter.close();
    }
}
