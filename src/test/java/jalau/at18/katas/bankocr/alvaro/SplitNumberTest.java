package jalau.at18.katas.bankocr.alvaro;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class SplitNumberTest {
    @Test
    public void itShouldReturnMatrix() {
        String[] data = {"                           ",
                         "|  |  |  |  |  |  |  |  |  ",
                         "|  |  |  |  |  |  |  |  |  ",
                         "                           "};
        SplitNumber split = new SplitNumber(data);
        char[][] expectedResult = new char[][]{{' ',' ',' '},
                                               {'|',' ',' '},
                                               {'|',' ',' '}};
        split.extractNumberIn3x3Matrix(0);
        assertArrayEquals(expectedResult,split.extractNumberIn3x3Matrix(0));
    }
}
