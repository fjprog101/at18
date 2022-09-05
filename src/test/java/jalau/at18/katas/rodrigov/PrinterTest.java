package jalau.at18.katas.rodrigov;
import org.junit.Test;

import jalau.at18.katas.bankocr.rodrigov.Printer;
import static org.junit.Assert.assertArrayEquals;
import java.io.FileNotFoundException;

public class PrinterTest {
    @Test
    public void shouldPrintArrayLines() throws FileNotFoundException{
        String[] expected = {"    _  _  _  _  _  _     _ ","|_||_|| || ||_   |  |  ||_ ","  | _||_||_||_|  |  |  | _|"};
        Printer printer = new Printer();
        assertArrayEquals(expected, printer.printArrayLines());
    }
}
