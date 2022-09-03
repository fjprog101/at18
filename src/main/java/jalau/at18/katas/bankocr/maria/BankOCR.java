package jalau.at18.katas.bankocr.maria;

import java.util.List;

public class BankOCR {
    public List<String> processAccountFromFile(String fileName) {
        List<String> linesFile = readFile(fileName);
        ProcessAccountLineFile processAccountLineFile = new ProcessAccountLineFile();
        processAccountLineFile.readAccountLines(linesFile);
        return processAccountLineFile.getAccounts();
    }

    public List<String> readFile(String fileName) {
        ReadFile readFiles = new ReadFile(fileName);
        return readFiles.readFile();
    }


}
