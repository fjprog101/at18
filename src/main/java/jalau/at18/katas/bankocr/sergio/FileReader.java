package jalau.at18.katas.bankocr.sergio;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    private Scanner input;
    private PathFile path = new PathFile();

    public FileReader() throws FileNotFoundException {
        input = new Scanner(path.getPathFile());
    }

    public Scanner getReadFile() {
        return input;
    }
}