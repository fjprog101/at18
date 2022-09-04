package jalau.at18.katas.bankocr.maria;

import java.util.List;

public class BankOCR {
    private ProcessAccountLineFile processAccountLineFile;
    private ReadFile readFile;

    public BankOCR(ProcessAccountLineFile processAccountLineFile, ReadFile readFile) {

        this.processAccountLineFile = processAccountLineFile;
        this.readFile = readFile;
    }

    public List<String> processAccountFromFile() {
        List<String> linesFile = readFile();
        processAccountLineFile.readAccountLines(linesFile);
        return processAccountLineFile.getAccounts();
    }

    private List<String> readFile() {
        return readFile.readFile();
    }
}
