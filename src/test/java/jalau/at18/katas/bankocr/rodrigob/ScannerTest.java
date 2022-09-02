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
}
