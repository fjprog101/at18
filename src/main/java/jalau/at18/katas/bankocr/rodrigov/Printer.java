package jalau.at18.katas.bankocr.rodrigov;
import java.io.FileNotFoundException;

public class Printer {
    private ReadFile readFile = new ReadFile();
    private String[] linesArray;

    public Printer() throws FileNotFoundException {
        readFile.readAccountsTxt();
        linesArray = readFile.getLines();
    }

    public String[] printArrayLines() {
        for (int index = 0; index < linesArray.length; index++) {
            System.out.println(linesArray[index]);
        }
        return linesArray;
    }
}
