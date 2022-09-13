package jalau.at18.katas.bankocr.sergio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

public class SplitMatrixTest {
    @Test
    public void shouldReturnSingleNumber() throws FileNotFoundException {
        SplitMatrix splitMatrix = new SplitMatrix();
        char[][] matrix = new char[4][27];
        char[][] singleNumberTest = new char[3][3];
        assertEquals(singleNumberTest.length, splitMatrix.singleNumber(matrix).length);
        assertEquals(singleNumberTest[0].length, splitMatrix.singleNumber(matrix)[0].length);
        assertEquals(singleNumberTest[1].length, splitMatrix.singleNumber(matrix)[1].length);
        assertEquals(singleNumberTest[2].length, splitMatrix.singleNumber(matrix)[2].length);
    }

    @Test
    public void shouldReturnSmallMatrix() throws FileNotFoundException {
        SplitMatrix splitMatrix = new SplitMatrix();
        char[][] matrix = new char[4][27];
        char[][] newSmallMatrix = new char[4][24];
        assertEquals(newSmallMatrix.length, splitMatrix.removeSingleNumber(matrix).length);
        assertEquals(newSmallMatrix[0].length, splitMatrix.removeSingleNumber(matrix)[0].length);
        assertEquals(newSmallMatrix[1].length, splitMatrix.removeSingleNumber(matrix)[1].length);
        assertEquals(newSmallMatrix[2].length, splitMatrix.removeSingleNumber(matrix)[2].length);
        assertEquals(newSmallMatrix[3].length, splitMatrix.removeSingleNumber(matrix)[3].length);
    }

    @Test
    public void shouldReturnSmallMatrixOfThree() throws FileNotFoundException {
        SplitMatrix splitMatrix = new SplitMatrix();
        char[][] matrix = new char[4][3];
        char[][] newSmallMatrix = new char[4][3];
        assertEquals(newSmallMatrix.length, splitMatrix.removeSingleNumber(matrix).length);
        assertEquals(newSmallMatrix[0].length, splitMatrix.removeSingleNumber(matrix)[0].length);
        assertEquals(newSmallMatrix[1].length, splitMatrix.removeSingleNumber(matrix)[1].length);
        assertEquals(newSmallMatrix[2].length, splitMatrix.removeSingleNumber(matrix)[2].length);
        assertEquals(newSmallMatrix[3].length, splitMatrix.removeSingleNumber(matrix)[3].length);
    }

}
