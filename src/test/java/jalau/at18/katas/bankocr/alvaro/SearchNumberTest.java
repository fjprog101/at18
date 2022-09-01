package jalau.at18.katas.bankocr.alvaro;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchNumberTest {
    @Test
    public void itShouldFindNumberZero() {
        char[][]zero = new char[][]{{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}};
        SearchNumber searchNumber = new SearchNumber(zero);
        assertEquals(0,searchNumber.getNumber());

    }

}
