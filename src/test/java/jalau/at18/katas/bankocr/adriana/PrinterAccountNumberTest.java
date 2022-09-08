package jalau.at18.katas.bankocr.adriana;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrinterAccountNumberTest {
    private static final String ENTRY_LINE_ONE = " _     _  _  _  _  _  _    ";
    private static final String ENTRY_LINE_TWO = " _|  | _|| ||_||_   || ||_|";
    private static final String ENTRY_LINE_THR = " _|  ||_ |_||_||_|  ||_|  |";
    private static final String ENTRY_LINE_BAD = " _|   |_  _||_| _   ||_|   ";
    
    @Test
    public void shouldGiveAccountNumber() {
        String[] entry = {ENTRY_LINE_ONE, ENTRY_LINE_TWO, ENTRY_LINE_THR};
        Input input = new Input(entry);
        Account account = new Account(input.getDigits());
        PrinterAccountNumber printer = new PrinterAccountNumber(account);
        assertEquals("312086704", printer.getMessage());

        String[] badEntry = {ENTRY_LINE_ONE, ENTRY_LINE_TWO, ENTRY_LINE_BAD};
        Input badInput = new Input(badEntry);
        Account badAccount = new Account(badInput.getDigits());
        PrinterAccountNumber printer2 = new PrinterAccountNumber(badAccount);
        assertEquals("3?2?8?70?", printer2.getMessage());
    }

    @Test
    public void shouldGiveValue() {
        String[] entry = {ENTRY_LINE_ONE, ENTRY_LINE_TWO, ENTRY_LINE_THR};
        Input input = new Input(entry);
        Account account = new Account(input.getDigits());
        PrinterAccountNumber printer = new PrinterAccountNumber(account);
        assertEquals("3", printer.giveValue("3"));
        assertEquals("?", printer.giveValue("-1"));
    }
    
}
