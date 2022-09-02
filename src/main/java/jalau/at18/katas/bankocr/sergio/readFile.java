package jalau.at18.katas.bankocr.sergio;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {

    public readFile() throws FileNotFoundException {
        PathFile path = new PathFile();
        Scanner sc = new Scanner(path.getPathFile());
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());

    }
}
