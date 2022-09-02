package jalau.at18.katas.bankocr.sergio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OpticCharacterReaderTest {

    @Test
    public void shouldReturnNumberOne() {
        char[][] numberOcrTest = new char[][] {{' ', ' ', ' ' }, {' ', ' ', '|' }, {' ', ' ', '|' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertTrue(ocr.numberOne(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberTwo() {
        char[][] numberOcrTest = new char[][] {{' ', '_', ' ' }, {' ', '_', '|' }, {'|', '_', ' ' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertTrue(ocr.numberTwo(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberThree() {
        char[][] numberOcrTest = new char[][] {{' ', '_', ' ' }, {' ', '_', '|' }, {' ', '_', '|' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertTrue(ocr.numberThree(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberFour() {
        char[][] numberOcrTest = new char[][] {{' ', ' ', ' ' }, {'|', '_', '|' }, {' ', ' ', '|' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertTrue(ocr.numberFour(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberFive() {
        char[][] numberOcrTest = new char[][] {{' ', '_', ' ' }, {'|', '_', ' ' }, {' ', '_', '|' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertTrue(ocr.numberFive(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberSix() {
        char[][] numberOcrTest = new char[][] {{' ', '_', ' ' }, {'|', '_', ' ' }, {'|', '_', '|' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertTrue(ocr.numberSix(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberSeven() {
        char[][] numberOcrTest = new char[][] {{' ', '_', ' ' }, {' ', ' ', '|' }, {' ', ' ', '|' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertTrue(ocr.numberSeven(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberEight() {
        char[][] numberOcrTest = new char[][] {{' ', '_', ' ' }, {'|', '_', '|' }, {'|', '_', '|' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertTrue(ocr.numberEight(numberOcrTest));
    }

    @Test
    public void shouldReturnNumberNine() {
        char[][] numberOcrTest = new char[][] {{' ', '_', ' ' }, {'|', '_', '|' }, {' ', '_', '|' } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertTrue(ocr.numberNine(numberOcrTest));
    }
}