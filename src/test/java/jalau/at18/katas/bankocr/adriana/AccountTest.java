package jalau.at18.katas.bankocr.adriana;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

//import java.util.Arrays;

import org.junit.Test;

public class AccountTest {
    final Digit ZERO = new Digit(DigitType.ZERO.getArrayCharacters());
    final Digit ONE = new Digit(DigitType.ONE.getArrayCharacters());
    final Digit TWO = new Digit(DigitType.TWO.getArrayCharacters());
    
    @Test
    public void shouldReturnAccount() {
        Digit[] accountDigits = {TWO, TWO, TWO, TWO, TWO, TWO, TWO, TWO, TWO};
        Account account = new Account(accountDigits);
        String[] expected = {"2", "2", "2", "2", "2", "2", "2", "2", "2"};
        assertArrayEquals(expected, account.getAccountNumber());
        Digit[] accountDigits1 = {TWO, ONE, TWO, ONE, TWO, ZERO, TWO, ZERO, ONE};
        Account account1 = new Account(accountDigits1);
        String[] expected1 = {"2", "1", "2", "1", "2", "0", "2", "0", "1"};
        assertArrayEquals(expected1, account1.getAccountNumber());
    }

    @Test
    public void shouldGetDigitsValues() {
        Digit[] accountDigits = {TWO, TWO, TWO, TWO, TWO, TWO, TWO, TWO, TWO};
        Account account = new Account(accountDigits);
        String[] expected = {"2", "2", "2", "2", "2", "2", "2", "2", "2"};
        assertArrayEquals(expected, account.getDigitsValues());
    }
}