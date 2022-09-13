package jalau.at18.katas.daniela;

import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import jalau.at18.katas.bankocr.daniela.DigitValid;
import jalau.at18.katas.bankocr.daniela.PossibleAccount;

public class PosibilityTest {
    @Test
    public void ShouldReturnThePosibilitynumber() {
        String line1 = " _ ";
        String line2 = "|_ ";
        String line3 = " _|";
        DigitValid digit = new DigitValid(line1, line2, line3);
        assertThat(digit.getDigitChar(), equalTo("356"));
        String line11 = " _ ";
        String line21 = " _ ";
        String line33 = " _|";
        DigitValid digit1 = new DigitValid(line11, line21, line33);
        assertThat(digit1.getDigitChar(), equalTo("35"));
        String line12 = " _ ";
        String line22 = " _|";
        String line13 = " _|";
        DigitValid digit2 = new DigitValid(line12, line22, line13);
        assertThat(digit2.getDigitChar(), equalTo("235"));
        String line14 = "   ";
        String line24 = "  |";
        String line34 = "  |";
        DigitValid digit3 = new DigitValid(line14, line24, line34);
        assertThat(digit3.getDigitChar(), equalTo("147"));

    }

    @Test
    public void ShouldReturnTheValuesofNineDigits() {
        int sizenumbers1 = 27;
        // 000000051
        String line11 = " _  _  _  _  _  _     _    ";
        String line21 = "| || || || || || || ||_   |";
        String line31 = "|_||_||_||_||_||_||_| _|  |";
        PossibleAccount account1 = new PossibleAccount(line11, line21, line31, sizenumbers1);
        assertThat(account1.getPossibleDigitChar(0, '1', "000000051", "000000051"), equalTo(
                "[500000051, 600000051, 300000051, 000000051, 700000051, 800000051, 100000051, 400000051]"));

    }

}
