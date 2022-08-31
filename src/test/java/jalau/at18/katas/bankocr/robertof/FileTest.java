package jalau.at18.katas.bankocr.robertof;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileTest {

    @Test
    public void shouldHavePathAndTableValue() {
        File file = new File("path");
        assertEquals("path", file.getPath());
        assertEquals(0, file.getTableValue().size());
    }
}
