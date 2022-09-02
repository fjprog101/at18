package jalau.at18.katas.bankocr.rodrigov;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ReadFile readFile = new ReadFile();
        SplitDigit splitDigit = new SplitDigit(readFile.getLines());
        readFile.readAccountsTxt();
        splitDigit.splitNumbers();
        splitDigit.print(); 
    }
}
