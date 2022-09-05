package jalau.at18.katas.bankocr.carlos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    private final String path = "C:/Jala University/Prog101/at18/src/main/java/jalau/at18/katas/bankocr/carlos/accounts.txt";
    private Scanner myReader;

    public ReadFile() throws FileNotFoundException {
        File myObj = new File(path);
        myReader = new Scanner(myObj);
    }

    public Scanner getFile() {
        return myReader;
    }

    /*public void printMatrix() {
        for (int index = 0; index < lines.length; index++) {
            System.out.println(lines[index]);
        }
    }*/
}
