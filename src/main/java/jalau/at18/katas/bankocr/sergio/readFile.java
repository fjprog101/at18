package jalau.at18.katas.bankocr.sergio;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public ReadFile() throws FileNotFoundException {
        PathFile path = new PathFile();
        Scanner input = new Scanner(path.getPathFile());
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
    }
}
