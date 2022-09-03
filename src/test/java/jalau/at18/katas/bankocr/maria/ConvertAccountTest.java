package jalau.at18.katas.bankocr.maria;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertAccountTest {
    @Test
    public void convertLinesToAccount() {
        ConvertAccount convertAccount = new ConvertAccount();
        String linesFile1 = "    _  _  _     _  _  _  _ ";
        String linesFile2 = "  ||_| _| _||_||_ |_   ||_|";
        String linesFile3 = "  | _||_  _|  | _||_|  ||_|";
        assertEquals("192345678", convertAccount.convertLinesToAccount(linesFile1, linesFile2, linesFile3));

    }

}