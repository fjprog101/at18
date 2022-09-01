package jalau.at18.katas.bankocr.robertof;

import org.junit.Test;
import java.io.IOException;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class DecryptorTest {
    @Test
    public void shouldDecryptFileTable() throws IOException {
        File file = new File("src/main/java/jalau/at18/katas/bankocr/robertof/sampleFile");
        FileReader fileReader = new FileReader(file);
        ArrayList<String> tableValue = fileReader.readFile(fileReader.getFilePath());
        Decryptor decryptor = new Decryptor();
        String finalValue = decryptor.decryptValue(tableValue);
        assertEquals("123456789", finalValue);
    }
}
