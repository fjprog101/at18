package jalau.at18.katas.bankocr.libertadTest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import jalau.at18.katas.bankocr.libertad.InputReader;

public class InputReaderTest {
    @Test
    public void getLinesOfInput() throws IOException {
        File file = new File("C:\\Users\\livia\\Jala\\Prog101\\at18\\src\\main\\java\\jalau\\at18\\katas\\bankocr\\libertad\\inputs\\FirstCase.txt");
        InputReader inputReader = new InputReader(file);
        String firstLine =  "    _  _     _  _  _  _  _ ";
        String secondLine = "  | _| _||_||_ |_   ||_||_|";
        String thridLine =  "  ||_  _|  | _||_|  ||_| _|";
        String[] expected = {firstLine,secondLine,thridLine};
        assertArrayEquals(expected, inputReader.getLinesOfInput());
    }
    @Test
    public void getArrayOfString() {
        File file = new File("C:\\Users\\livia\\Jala\\Prog101\\at18\\src\\main\\java\\jalau\\at18\\katas\\bankocr\\libertad\\inputs\\FirstCase.txt");
        InputReader inputReader = new InputReader(file);
        String[] one = {"   ",
                        "  |",
                        "  |"};
        String[] two = {" _ ",
                        " _|",
                        "|_ "};
        String[] three = {" _ ",
                          " _|",
                          " _|"};
        String[] four = {"   ",
                         "|_|",
                         "  |"};
        String[] five = {" _ ",
                         "|_ ",
                         " _|"};
        String[] six = {" _ ",
                        "|_ ",
                        "|_|"};
        String[] seven = {" _ ",
                          "  |",
                          "  |"};
        String[] eigth = {" _ ",
                          "|_|",
                          "|_|"};
        String[] nine = {" _ ",
                         "|_|",
                         " _|"};
        List<String[]> expected = new LinkedList<>();
        expected.add(one);
        expected.add(two);
        expected.add(three);
        expected.add(four);
        expected.add(five);
        expected.add(six);
        expected.add(seven);
        expected.add(eigth);
        expected.add(nine);
    }
}
