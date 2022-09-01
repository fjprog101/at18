package jalau.at18.katas.bankocr.alvaro;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class ReadDataTest {
    @Test
    public void itShouldReturnMatrix() {
        String[] data = {"                           ",
                         "|  |  |  |  |  |  |  |  |  ",
                         "|  |  |  |  |  |  |  |  |  ",
                         "                           "};
        ReadData convert = new ReadData(data);
        char[][] expectedResult =new char[][]{{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                                              {'|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' '},
                                              {'|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' '}};
        assertArrayEquals(expectedResult, convert.getData());
    }

}
