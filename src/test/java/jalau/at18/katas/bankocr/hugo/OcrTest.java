package jalau.at18.katas.bankocr.hugo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OcrTest {

    @Test
    public void setOne() {
        Ocr number = new Ocr();
        char[][] numberToSearch = {
                { ' ', ' ', ' ' },
                { ' ', ' ', '|' },
                { ' ', ' ', '|' } };
        int expected = '1';
        int result = number.getValue(numberToSearch);
        assertEquals(expected, result);
    }

    @Test
    public void setTwo() {
        Ocr number = new Ocr();
        char[][] numberToSearch = {
                { ' ', '_', ' ' },
                { ' ', '_', '|' },
                { '|', '_', ' ' } };
        int expected = '2';
        int result = number.getValue(numberToSearch);
        assertEquals(expected, result);
    }

    @Test
    public void setThree() {
        Ocr number = new Ocr();
        char[][] numberToSearch = {
                { ' ', '_', ' ' },
                { ' ', '_', '|' },
                { ' ', '_', '|' } };
        int expected = '3';
        int result = number.getValue(numberToSearch);
        assertEquals(expected, result);
    }

    @Test
    public void setFour() {
        Ocr number = new Ocr();
        char[][] numberToSearch = {
                { ' ', ' ', ' ' },
                { '|', '_', '|' },
                { ' ', ' ', '|' } };
        int expected = '4';
        int result = number.getValue(numberToSearch);
        assertEquals(expected, result);
    }

    @Test
    public void setFive() {
        Ocr number = new Ocr();
        char[][] numberToSearch = {
                { ' ', '_', ' ' },
                { '|', '_', ' ' },
                { ' ', '_', '|' } };
        int expected = '5';
        int result = number.getValue(numberToSearch);
        assertEquals(expected, result);
    }

    @Test
    public void setSix() {
        Ocr number = new Ocr();
        char[][] numberToSearch = {
                { ' ', '_', ' ' },
                { '|', '_', ' ' },
                { '|', '_', '|' } };
        int expected = '6';
        int result = number.getValue(numberToSearch);
        assertEquals(expected, result);
    }

    @Test
    public void setSeven() {
        Ocr number = new Ocr();
        char[][] numberToSearch = {
                { ' ', '_', ' ' },
                { ' ', ' ', '|' },
                { ' ', ' ', '|' } };
        int expected = '7';
        int result = number.getValue(numberToSearch);
        assertEquals(expected, result);
    }

    @Test
    public void setEight() {
        Ocr number = new Ocr();
        char[][] numberToSearch = {
                { ' ', '_', ' ' },
                { '|', '_', '|' },
                { '|', '_', '|' } };
        int expected = '8';
        int result = number.getValue(numberToSearch);
        assertEquals(expected, result);
    }

    @Test
    public void setNine() {
        Ocr number = new Ocr();
        char[][] numberToSearch = {
                { ' ', '_', ' ' },
                { '|', '_', '|' },
                { ' ', '_', '|' } };
        int expected = '9';
        int result = number.getValue(numberToSearch);
        assertEquals(expected, result);
    }

    @Test
    public void setZero() {
        Ocr number = new Ocr();
        char[][] numberToSearch = {
                { ' ', '_', ' ' },
                { '|', ' ', '|' },
                { '|', '_', '|' } };
        int expected = '0';
        int result = number.getValue(numberToSearch);
        assertEquals(expected, result);
    }

    @Test
    public void setNull() {
        Ocr number = new Ocr();
        char[][] numberToSearch = {
                { ' ', '|', ' ' },
                { '_', ' ', '|' },
                { ' ', ' ', '|' } };
        int expected = '?';
        int result = number.getValue(numberToSearch);
        assertEquals(expected, result);
    }

    @Test
    public void areErrors() {
        Ocr number = new Ocr();
        char[] numberToSearch = { '4', '9', '0', '?', '6', '7', '7', '1', '9' };
        int colpos = 8;
        boolean result = number.areErrors(numberToSearch, colpos);
        assertEquals(true, result);
    }

    @Test
    public void areNoErrors() {
        Ocr number = new Ocr();
        char[] numberToSearch = { '4', '9', '0', '7', '6', '7', '7', '1', '9' };
        int colpos = 3;
        boolean result = number.areErrors(numberToSearch, colpos);
        assertEquals(false, result);
    }
}
