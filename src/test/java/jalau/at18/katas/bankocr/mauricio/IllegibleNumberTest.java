package jalau.at18.katas.bankocr.mauricio;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class IllegibleNumberTest {

        private final int one = 1;
        private final int two = 2;
        private final int three = 3;
        private final int four = 4;
        private final int five = 5;
        private final int six = 6;
        private final int seven = 7;
        private final int eight = 8;
        private final int ninetynine = 99;
    
        @Test
        public void illegibleNumbersTest(){
            Illegible illegible = new Illegible();
            int[] listNumbers = {three, four, five, eight, eight, two, eight, six, ninetynine};
            assertFalse(illegible.illegibleNumber(listNumbers));
        }
}
