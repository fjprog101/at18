package jalau.at18.katas.bankocr.sergio;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    private Scanner input;
    private PathFile path = new PathFile();

    public ReadFile() throws FileNotFoundException {
        input = new Scanner(path.getPathFile());
    }

    public Scanner getReadFile() {
        return input;
    }
}
