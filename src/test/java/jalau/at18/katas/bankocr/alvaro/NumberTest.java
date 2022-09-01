package jalau.at18.katas.bankocr.alvaro;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class NumberTest {
    @Test
    public void itShouldReturnNumberZero() {
        char[][]matrix = new char[][]{{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}};
        Number number = new Number(matrix);
        number.compareNumber();
        assertEquals(0, number.getNumber());
    }
    @Test
    public void itShouldReturnNumberOne() {
        char[][]matrix = new char[][]{{' ', ' ', ' '}, {'|', ' ', ' '}, {'|', ' ', ' '}};
        Number number = new Number(matrix);
        number.compareNumber();
        assertEquals(1, number.getNumber());
    }
    @Test
    public void itShouldReturnNumberTwo() {
        char[][]matrix = new char[][]{{' ', '_', ' '}, {' ', '_', '|'}, {'|', '_', ' '}};
        Number number = new Number(matrix);
        number.compareNumber();
        assertEquals(2, number.getNumber());
    }
    @Test
    public void itShouldReturnNumberThree() {
        char[][]matrix = new char[][]{{' ', '_', ' '}, {' ', '_', '|'}, {' ', '_', '|'}};
        Number number = new Number(matrix);
        number.compareNumber();
        assertEquals(3, number.getNumber());
    }
    @Test
    public void itShouldReturnNumberFour() {
        char[][]matrix = new char[][]{{' ', ' ', ' '}, {'|', '_', '|'}, {' ', ' ', '|'}};
        Number number = new Number(matrix);
        number.compareNumber();
        assertEquals(4, number.getNumber());
    }
    @Test
    public void itShouldReturnNumberFive() {
        char[][]matrix = new char[][]{{' ', '_', ' '}, {'|', '_', ' '}, {' ', '_', '|'}};
        Number number = new Number(matrix);
        number.compareNumber();
        assertEquals(5, number.getNumber());
    }
    @Test
    public void itShouldReturnNumberSix() {
        char[][]matrix = new char[][]{{' ', '_', ' '}, {'|', '_', ' '}, {'|', '_', '|'}};
        Number number = new Number(matrix);
        number.compareNumber();
        assertEquals(6, number.getNumber());
    }
    @Test
    public void itShouldReturnNumberSeven() {
        char[][]matrix = new char[][]{{' ', '_', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
        Number number = new Number(matrix);
        number.compareNumber();
        assertEquals(7, number.getNumber());
    }
    @Test
    public void itShouldReturnNumberEight() {
        char[][]matrix = new char[][]{{' ', '_', ' '}, {'|', '_', '|'}, {'|', '_', '|'}};
        Number number = new Number(matrix);
        number.compareNumber();
        assertEquals(8, number.getNumber());
    }
    @Test
    public void itShouldReturnNumberNine() {
        char[][]matrix = new char[][]{{' ', '_', ' '}, {'|', '_', '|'}, {' ', '_', '|'}};
        Number number = new Number(matrix);
        number.compareNumber();
        assertEquals(9, number.getNumber());
    }
}
