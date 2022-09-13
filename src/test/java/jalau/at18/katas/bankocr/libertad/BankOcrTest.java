package jalau.at18.katas.bankocr.libertad;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class BankOcrTest {
    @Test
    public void shouldIdentifyAllDigit() throws IOException {
        String direction = "src/main/java/jalau/at18/katas/bankocr/libertad/inputs";
        File file = new File(System.getProperty("user.dir")+File.separator+direction+File.separator+"FirstCase.txt");
        InputNumber input = new InputNumber(file);
        BankOcr bankOcr = new BankOcr(input);
        assertEquals("123456789", bankOcr.readNumbers());
    }
    @Test
    public void shouldIdentifyWhenHasANoDigit() throws IOException {
        String direction = "src/main/java/jalau/at18/katas/bankocr/libertad/inputs";
        File file = new File(System.getProperty("user.dir")+File.separator+direction+File.separator+"NumbersWithNoDigit.txt");
        InputNumber input = new InputNumber(file);
        BankOcr bankOcr = new BankOcr(input);
        assertEquals("1234?6709", bankOcr.readNumbers());
    }
}
