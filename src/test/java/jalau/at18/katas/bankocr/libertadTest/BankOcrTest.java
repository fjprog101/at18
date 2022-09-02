package jalau.at18.katas.bankocr.libertadTest;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import jalau.at18.katas.bankocr.libertad.BankOcr;
import jalau.at18.katas.bankocr.libertad.InputNumber;

public class BankOcrTest {
    @Test
    public void getLinesOfInput() throws IOException {
        File file = new File("inputs","FirstCase.txt");
        InputNumber input = new InputNumber(file);
        BankOcr bankOcr = new BankOcr(input);
        //assertEquals(123456789, bankOcr.readNumbers());
    }
}
