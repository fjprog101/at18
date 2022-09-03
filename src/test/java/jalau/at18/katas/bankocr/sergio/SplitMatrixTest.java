package jalau.at18.katas.bankocr.sergio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SplitMatrixTest {
    @Test
    public void shouldReturnSingleNumber() {
        SplitMatrix splitMatrix = new SplitMatrix();
        char[][] matrix = new char[27][27];
        char[][] singleNumberTest = new char[3][3];
        assertEquals(singleNumberTest.length, splitMatrix.singleNumber(matrix).length);
        assertEquals(singleNumberTest[0].length, splitMatrix.singleNumber(matrix)[0].length);
        assertEquals(singleNumberTest[1].length, splitMatrix.singleNumber(matrix)[1].length);
        assertEquals(singleNumberTest[2].length, splitMatrix.singleNumber(matrix)[2].length);
    }
}
