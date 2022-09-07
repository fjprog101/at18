package jalau.at18.katas.bankocr.robertof;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TableTest {
    @Test
    public void shouldHaveValuesInTheTable() {
        Table table = new Table();
        int value = table.getValue(1,1);
        assertEquals(5, value);
    }
}
