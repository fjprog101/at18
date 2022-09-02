package jalau.at18.katas.bankocr.rodrigob;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrinterTest {
    char[][] input = {{' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' '},
                         {' ', ' ', '|', ' ', '_', '|', ' ', '_', '|', '|', '_', '|', '|', '_', ' ', '|', '_', ' ', ' ', ' ', '|', '|', '_', '|', '|', '_', '|'},
                         {' ', ' ', '|', '|', '_', ' ', ' ', '_', '|', ' ', ' ', '|', ' ', '_', '|', '|', '_', '|', ' ', ' ', '|', '|', '_', '|', ' ', '_', '|'}
                        };

    @Test
    public void shouldWriteOutput() {
        Printer writter = new Printer();
        String output = writter.writeOutput(input);
        assertEquals("123456789", output);
    }
    @Test
    public void shouldParse() {
        char[][] out = new char[3][27];
        String accountNumbers = "";
        Printer PrinterParse = new Printer();
        String accountExpected = PrinterParse.parserDigit(out, accountNumbers, input);
        assertEquals("123456789", accountExpected);
    }
}
