package jalau.at18.katas.bankocr.robertof;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FileReaderTest {

    @Test
    public void shouldHavePath() {
        File file = new File("src/main/resources/sampleFile");
        FileReader fileReader = new FileReader(file);
        assertEquals("src/main/resources/sampleFile", fileReader.getFilePath());
    }

    @Test
    public void shouldReadFile() throws IOException {
        File file = new File("src/main/resources/sampleFile");
        FileReader fileReader = new FileReader(file);
        ArrayList<String> tableValue = fileReader.readFile();
        assertEquals(3, tableValue.size());
    }

}
