package jalau.at18.katas.rodrigov;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;

import jalau.at18.katas.bankocr.rodrigov.PrintNumberAccount;

public class PrinterNumberAccountTest {
    @Test
    public void shouldPrintAccount() throws FileNotFoundException{
        PrintNumberAccount printNumAccount = new PrintNumberAccount();
        String expected = "000000051";
        assertEquals(expected, printNumAccount.printAccount());
    }
}
