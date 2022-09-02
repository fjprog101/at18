package jalau.at18.katas.bankocr.libertadTest;

import static org.junit.Assert.assertArrayEquals;

import java.io.File;
import java.io.IOException;

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
}
