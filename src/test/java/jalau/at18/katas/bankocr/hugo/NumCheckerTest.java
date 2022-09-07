package jalau.at18.katas.bankocr.hugo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumCheckerTest {

    @Test
    public void dividerIsCorrect() {
        NumChecker number = new NumChecker();
        int sum = 242;
        int expected = 0;
        int result = number.divider(sum);
        assertEquals(expected, result);
    }

    @Test
    public void adderIsCorrect() {
        NumChecker number = new NumChecker();
        int[] tocheck = { 4, 9, 8, 8, 8, 7, 7, 1, 5 };
        int expected = 0;
        int result = number.adder(0, tocheck);
        assertEquals(expected, result);
    }

    @Test
    public void checkerIsCorrect() {
        NumChecker number = new NumChecker();
        int[] tocheck = { 4, 9, 8, 8, 8, 7, 7, 1, 5 };
        boolean result = number.checkAccountNum(tocheck);
        assertEquals(true, result);
    }

    @Test
    public void checkerIsNotCorrect() {
        NumChecker number = new NumChecker();
        int[] tocheck = { 4, 9, 8, 0, 8, 7, 7, 1, 5 };
        boolean result = number.checkAccountNum(tocheck);
        assertEquals(false, result);
    }
}
