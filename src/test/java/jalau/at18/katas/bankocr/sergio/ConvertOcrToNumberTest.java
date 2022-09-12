package jalau.at18.katas.bankocr.sergio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConvertOcrToNumberTest {

    @Test
    public void shouldReturnZero() {
        char[][] numberOcrTest = new char[][]{{' ', '_', ' ' }, {'|', ' ', '|' }, {'|', '_', '|' } };
        ConvertOcrToNumber ocr = new ConvertOcrToNumber();
        assertEquals(0, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberOne() {
        char[][] numberOcrTest = new char[][]{{' ', ' ', ' ' }, {' ', ' ', '|' }, {' ', ' ', '|' } };
        ConvertOcrToNumber ocr = new ConvertOcrToNumber();
        assertEquals(1, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberTwo() {
        char[][] numberOcrTest = new char[][]{{' ', '_', ' ' }, {' ', '_', '|' }, {'|', '_', ' ' } };
        ConvertOcrToNumber ocr = new ConvertOcrToNumber();
        assertEquals(2, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberThree() {
        char[][] numberOcrTest = new char[][]{{' ', '_', ' ' }, {' ', '_', '|' }, {' ', '_', '|' } };
        ConvertOcrToNumber ocr = new ConvertOcrToNumber();
        assertEquals(3, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberFour() {
        char[][] numberOcrTest = new char[][]{{' ', ' ', ' ' }, {'|', '_', '|' }, {' ', ' ', '|' } };
        ConvertOcrToNumber ocr = new ConvertOcrToNumber();
        assertEquals(4, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberFive() {
        char[][] numberOcrTest = new char[][]{{' ', '_', ' ' }, {'|', '_', ' ' }, {' ', '_', '|' } };
        ConvertOcrToNumber ocr = new ConvertOcrToNumber();
        assertEquals(5, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberSix() {
        char[][] numberOcrTest = new char[][]{{' ', '_', ' ' }, {'|', '_', ' ' }, {'|', '_', '|' } };
        ConvertOcrToNumber ocr = new ConvertOcrToNumber();
        assertEquals(6, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberSeven() {
        char[][] numberOcrTest = new char[][]{{' ', '_', ' ' }, {' ', ' ', '|' }, {' ', ' ', '|' } };
        ConvertOcrToNumber ocr = new ConvertOcrToNumber();
        assertEquals(7, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberEight() {
        char[][] numberOcrTest = new char[][]{{' ', '_', ' ' }, {'|', '_', '|' }, {'|', '_', '|' } };
        ConvertOcrToNumber ocr = new ConvertOcrToNumber();
        assertEquals(8, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberNine() {
        char[][] numberOcrTest = new char[][]{{' ', '_', ' ' }, {'|', '_', '|' }, {' ', '_', '|' } };
        ConvertOcrToNumber ocr = new ConvertOcrToNumber();
        assertEquals(9, ocr.analizeSingleNumbers(numberOcrTest));
    }
}