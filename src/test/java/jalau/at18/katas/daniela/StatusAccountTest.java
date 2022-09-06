package jalau.at18.katas.daniela;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import jalau.at18.katas.bankocr.daniela.StatusAccount;

public class StatusAccountTest {
    @Test
    public void ShouldValidTheCheckModFalse() {
        ////// 664371495
        int totaldigits = 9;
        int sizenumbers = 27;
        String statusaccount = "";
        int finalresult = 0;
        String line1 = " _  _     _  _        _  _ ";
        String line2 = "|_ |_ |_| _|  |  || ||_||_ ";
        String line3 = "|_||_|  | _|     |  |  | _|";
        StatusAccount status = new StatusAccount(line1, line2, line3, totaldigits, sizenumbers);
        assertEquals("ILL", status.statusDigits(statusaccount, finalresult));
    }

}
