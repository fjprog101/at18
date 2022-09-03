package jalau.at18.katas.bankocr.adriana;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrinterEntryTest {
    private static final String ENTRY_LINE_ONE = " _     _  _  _  _  _  _    ";
    private static final String ENTRY_LINE_TWO = " _|  | _|| ||_||_   || ||_|";
    private static final String ENTRY_LINE_THR = " _|  ||_ |_||_||_|  ||_|  |";
    
    @Test
    public void shouldGetInputMessageForPrint() {
        String[] entry = {ENTRY_LINE_ONE, ENTRY_LINE_TWO, ENTRY_LINE_THR};
        PrinterEntry printer = new PrinterEntry(entry);
        String expectMessage = " _     _  _  _  _  _  _    \n _|  | _|| ||_||_   || ||_|\n _|  ||_ |_||_||_|  ||_|  |\n";
        assertEquals(expectMessage, printer.getMessage());
    }
}