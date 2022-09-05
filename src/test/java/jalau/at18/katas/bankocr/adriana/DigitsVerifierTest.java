package jalau.at18.katas.bankocr.adriana;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DigitsVerifierTest {
    @Test
    public void shoudlSayIsNumberAccountValid() {
        String line1 = " _     _  _  _  _  _  _    ";
        String line2 = " _|  | _|| ||_||_   || ||_|";
        String line3 = " _|  ||_ |_||_||_|  ||_|  |";
        String[] entry = {line1, line2, line3};
        Input input = new Input(entry);
        Account account = new Account(input.getDigits());
        DigitVerifier verifier = new DigitVerifier(account);
        assertTrue(verifier.isValidDigits());
        String line4 = " _     _     _  _  _  _  _ ";
        String line5 = " _||_| _ |_||_| _| _ |_ |_ ";
        String line6 = " _|  | _||  |_||_ |_||_| _|";
        String[] entry1 = {line4, line5, line6};
        Input input1 = new Input(entry1);
        Account account1 = new Account(input1.getDigits());
        DigitVerifier verifier1 = new DigitVerifier(account1);
        assertFalse(verifier1.isValidDigits());
        
    }
}
