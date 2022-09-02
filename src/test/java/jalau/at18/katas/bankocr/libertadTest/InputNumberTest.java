package jalau.at18.katas.bankocr.libertadTest;

import static org.junit.Assert.assertArrayEquals;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import jalau.at18.katas.bankocr.libertad.InputNumber;

public class InputNumberTest {
    @Test
    public void getArrayOfString() throws IOException {
        String direction = "src\\main\\java\\jalau\\at18\\katas\\bankocr\\libertad\\inputs";
        File file = new File(System.getProperty("user.dir")+File.separator+direction+File.separator+"FirstCase.txt");
        InputNumber inputNumber = new InputNumber(file);
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
        assertArrayEquals(expected.toArray(), inputNumber.getSeparateHasNumbers().toArray());
    }
}
