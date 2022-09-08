package jalau.at18.katas.bankocr.libertad;

import static org.junit.Assert.assertArrayEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class InputReaderTest {
    @Test
    public void getLinesOfInput() throws IOException {
        String direction = "src/main/java/jalau/at18/katas/bankocr/libertad/inputs";
        File file = new File(System.getProperty("user.dir")+File.separator+direction+File.separator+"FirstCase.txt");
        InputReader inputReader = new InputReader(file);
        String firstLine =  "    _  _     _  _  _  _  _ ";
        String secondLine = "  | _| _||_||_ |_   ||_||_|";
        String thridLine =  "  ||_  _|  | _||_|  ||_| _|";
        String[] expected = {firstLine,secondLine,thridLine};
        assertArrayEquals(expected, inputReader.getLinesOfInput());
    }
}
