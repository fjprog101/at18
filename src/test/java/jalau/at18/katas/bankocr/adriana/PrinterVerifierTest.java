package jalau.at18.katas.bankocr.adriana;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrinterVerifierTest {
    private static final String ENTRY_LINE_ONE = " _     _  _  _  _  _  _    ";
    private static final String ENTRY_LINE_TWO = " _|  | _|| ||_||_   || ||_|";
    private static final String ENTRY_LINE_THR = " _|  ||_ |_||_||_|  ||_|  |";
    private static final String ENTRY_LINE_BAD = " _|   |_  _||_| _   ||_|   ";
    
    @Test
    public void shouldGiveAccountStatus() {
        String[] entry = {ENTRY_LINE_ONE, ENTRY_LINE_TWO, ENTRY_LINE_THR};
        Input input = new Input(entry);
        Account account = new Account(input.getDigits());
        PrinterVerifier printer = new PrinterVerifier(account);
        assertEquals(" ERR\n", printer.getMessage());

        String[] badEntry = {ENTRY_LINE_ONE, ENTRY_LINE_TWO, ENTRY_LINE_BAD};
        Input badInput = new Input(badEntry);
        Account badAccount = new Account(badInput.getDigits());
        PrinterVerifier printer2 = new PrinterVerifier(badAccount);
        assertEquals(" ILL\n", printer2.getMessage());

        String line4 = " _     _  _  _  _  _  _  _ ";
        String line5 = " _||_||_ |_||_| _||_||_ |_ ";
        String line6 = " _|  | _||_||_||_ |_||_| _|";
        String[] entry2 = {line4, line5, line6};
        Input input2 = new Input(entry2);
        Account account2 = new Account(input2.getDigits());
        PrinterVerifier printer3 = new PrinterVerifier(account2);
        assertEquals(" \n", printer3.getMessage());
    }
    
}
