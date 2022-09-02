package jalau.at18.katas.daniela;

import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import jalau.at18.katas.bankocr.daniela.BankAccount;
import jalau.at18.katas.bankocr.daniela.Digit;

public class BankCountTest {

    @Test
    public void ShouldValidTheDigits() {
        String line1 = "   ";
        String line2 = "|_|";
        String line3 = "  |";
        Digit digit = new Digit(line1, line2, line3);
        assertThat(digit.getDigitChar(), equalTo('4'));
        String line11 = "   ";
        String line21 = "| |";
        String line33 = "  |";
        Digit digit1 = new Digit(line11, line21, line33);
        assertThat(digit1.getDigitChar(), equalTo('a'));

    }

    @Test
    public void ShouldReturnTheValuesofNineDigits() {
        String line1 = "    _  _     _  _  _  _  _ ";
        String line2 = "  | _| _||_||_ |_   ||_||_|";
        String line3 = "  ||_  _|  | _||_|  ||_|  |";
        BankAccount account = new BankAccount(line1, line2, line3);
        assertThat(account.getDigitChar(), equalTo("123456789"));

    }
}
