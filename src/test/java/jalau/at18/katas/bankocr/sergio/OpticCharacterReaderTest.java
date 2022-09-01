package jalau.at18.katas.bankocr.sergio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OpticCharacterReaderTest {

    @Test
    public void shouldReturnNumber() {
        String[][] numberOcrTest = new String[][] {{"", "", "" }, {"", "", "|" }, {"", "", "|" } };
        OpticCharacterReader ocr = new OpticCharacterReader();
        assertEquals(true, ocr.numberOne(numberOcrTest));
    }
}