package jalau.at18.katas.bankocr.maria;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReadFileTest {
    @Test
    public void readFileExist() {
        List<String> listLines = new ArrayList<String>();
        String line1 = " _  _  _  _  _  _  _  _  _ ";
        String line2 = "| || || || || || || || || |";
        String line3 = "|_||_||_||_||_||_||_||_||_|";
        String line4 = "";

        String line5 = "    _  _  _     _  _  _  _ ";
        String line6 = "  ||_| _| _||_||_ |_   ||_|";
        String line7 = "  | _||_  _|  | _||_|  ||_|";
        String line8 = "";
        listLines.add(line1);
        listLines.add(line2);
        listLines.add(line3);
        listLines.add(line4);
        listLines.add(line5);
        listLines.add(line6);
        listLines.add(line7);
        listLines.add(line8);
        ReadFile readFilee = new ReadFile("TestFile.txt");
        List<String> readLinesFile = readFilee.readFile();
        assertEquals(listLines, readLinesFile);
    }

    @Test
    public void readFileNotExist() {
        ReadFile readFilee = new ReadFile("TestFileXX.txt");
        List<String> readLinesFile = readFilee.readFile();
        assertEquals(null, readLinesFile);
    }
}
