package jalau.at18.katas.bankocr.alvaro;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class ConvertToMatrixTest {
    @Test
    public void itShouldReturnMatrix() {
        String[] data = {"                           ",
                         "|  |  |  |  |  |  |  |  |  ",
                         "|  |  |  |  |  |  |  |  |  ",
                         "                           "};
        ConvertToMatrix convert = new ConvertToMatrix(data);
        char[][] expectedResult =new char[][]{{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                                              {'|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' '},
                                              {'|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' ','|',' ',' '}};
        assertArrayEquals(expectedResult, convert.getMatrix());
    }

}
