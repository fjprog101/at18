package jalau.at18.katas.bankocr.rodrigob;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScannerTest {
    char[][] expected = {{' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' '},
                           {' ', ' ', '|', ' ', '_', '|', ' ', '_', '|', '|', '_', '|', '|', '_', ' ', '|', '_', ' ', ' ', ' ', '|', '|', '_', '|', '|', '_', '|'},
                           {' ', ' ', '|', '|', '_', ' ', ' ', '_', '|', ' ', ' ', '|', ' ', '_', '|', '|', '_', '|', ' ', ' ', '|', '|', '_', '|', ' ', '_', '|'}
                          };
    @Test
    public void shouldReadInput() {

        Scanner scannerReader = new Scanner();
        char[][] input = scannerReader.readInput();
        assertArrayEquals(expected, input);
    }
    @Test
    public void shouldWriteOutput() {
        Scanner scannerWritter = new Scanner();
        String output = scannerWritter.writeOutput(expected);
        assertEquals("123456789", output);
    }
    @Test
    public void shouldParse() {
        char[][] out = new char[3][27];
        String accountNumbers = "";
        Scanner scannerParse = new Scanner();
        String accountExpected = scannerParse.parserDigit(out, accountNumbers, expected);
        assertEquals("123456789", accountExpected);
    }
}
