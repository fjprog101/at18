package jalau.at18.katas.bankocr.sergio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OpticCharacterReaderTest {

    @Test
    public void shouldReturnNumberOne() {
        char[][] numberOcrTest = new char[][] {{' ', ' ', ' ' }, {' ', ' ', '|' }, {' ', ' ', '|' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertEquals(1, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberTwo() {
        char[][] numberOcrTest = new char[][] {{' ', '_', ' ' }, {' ', '_', '|' }, {'|', '_', ' ' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertEquals(2, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberThree() {
        char[][] numberOcrTest = new char[][] {{' ', '_', ' ' }, {' ', '_', '|' }, {' ', '_', '|' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertEquals(3, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberFour() {
        char[][] numberOcrTest = new char[][] {{' ', ' ', ' ' }, {'|', '_', '|' }, {' ', ' ', '|' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertEquals(4, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberFive() {
        char[][] numberOcrTest = new char[][] {{' ', '_', ' ' }, {'|', '_', ' ' }, {' ', '_', '|' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertEquals(5, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberSix() {
        char[][] numberOcrTest = new char[][] {{' ', '_', ' ' }, {'|', '_', ' ' }, {'|', '_', '|' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertEquals(6, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberSeven() {
        char[][] numberOcrTest = new char[][] {{' ', '_', ' ' }, {' ', ' ', '|' }, {' ', ' ', '|' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertEquals(7, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberEight() {
        char[][] numberOcrTest = new char[][] {{' ', '_', ' ' }, {'|', '_', '|' }, {'|', '_', '|' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertEquals(8, ocr.analizeSingleNumbers(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberNine() {
        char[][] numberOcrTest = new char[][] {{' ', '_', ' ' }, {'|', '_', '|' }, {' ', '_', '|' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertEquals(9, ocr.analizeSingleNumbers(numberOcrTest));
    }
}