package jalau.at18.katas.bankocr.rodrigov;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
    private int cont = 0;
    private final String path = "D:/AutomationTesting/Prog101/gitRemote/at18/src/main/java/jalau/at18/katas/bankocr/rodrigov/account.txt";
    private final int limitLines = 3;
    private String[] lines = new String[limitLines];

    public void readAccountsTxt() throws FileNotFoundException {
        File myObj = new File(path);
        Scanner myReader = new Scanner(myObj);
        loopReadAccount(myReader);
        myReader.close();
    }

    public void loopReadAccount(Scanner myReader) {
        while (myReader.hasNextLine()) {
            lines[cont] = myReader.nextLine();
            cont++;
        }
    }

    public String[] getLines() {
        return lines;
    }

    public void setLines(String[] linesRead) {
        this.lines = linesRead;
    }
}