package jalau.at18.katas.bankocr.fernanda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CompareTest {
    @Test
    public void testCompareDig() {
        Compare compare = new Compare();
        char[][] numberToCompare = {{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}};
        int expected = '0';
        int result = compare.compareDig(numberToCompare);
        assertEquals(expected, result);
        Compare compare1 = new Compare();
        char[][] numberToCompare1 = {{' ', ' ', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
        int expected1 = '1';
        int result1 = compare1.compareDig(numberToCompare1);
        assertEquals(expected1, result1);
        Compare compare2 = new Compare();
        char[][] numberToCompare2 = {{' ', '_', ' '}, {' ', '_', '|'}, {'|', '_', ' '}};
        int expected2 = '2';
        int result2 = compare2.compareDig(numberToCompare2);
        assertEquals(expected2, result2);
        Compare compare3 = new Compare();
        char[][] numberToCompare3 = {{' ', '_', ' '}, {' ', '_', '|'}, {' ', '_', '|'}};
        int expected3 = '3';
        int result3 = compare3.compareDig(numberToCompare3);
        assertEquals(expected3, result3);
        Compare compare4 = new Compare();
        char[][] numberToCompare4 = {{' ', ' ', ' '}, {'|', '_', '|'}, {' ', ' ', '|'}};
        int expected4 = '4';
        int result4 = compare4.compareDig(numberToCompare4);
        assertEquals(expected4, result4);
        Compare compare5 = new Compare();
        char[][] numberToCompare5 = {{' ', '_', ' '}, {'|', '_', ' '}, {' ', '_', '|'}};
        int expected5 = '5';
        int result5 = compare5.compareDig(numberToCompare5);
        assertEquals(expected5, result5);
        Compare compare6 = new Compare();
        char[][] numberToCompare6 = {{' ', '_', ' '}, {'|', '_', ' '}, {'|', '_', '|'}};
        int expected6 = '6';
        int result6 = compare6.compareDig(numberToCompare6);
        assertEquals(expected6, result6);
        Compare compare7 = new Compare();
        char[][] numberToCompare7 = {{' ', '_', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
        int expected7 = '7';
        int result7 = compare7.compareDig(numberToCompare7);
        assertEquals(expected7, result7);
        Compare compare8 = new Compare();
        char[][] numberToCompare8 = {{' ', '_', ' '}, {'|', '_', '|'}, {'|', '_', '|'}};
        int expected8 = '8';
        int result8 = compare8.compareDig(numberToCompare8);
        assertEquals(expected8, result8);
        Compare compare9 = new Compare();
        char[][] numberToCompare9 = {{' ', '_', ' '}, {'|', '_', '|'}, {' ', '_', '|'}};
        int expected9 = '9';
        int result9 = compare9.compareDig(numberToCompare9);
        assertEquals(expected9, result9);
    }
}
