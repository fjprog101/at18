package jalau.at18.katas.bankocr.robertof;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapperTest {
    @Test
    public void shouldHaveMappedValues() {
        Mapper mapper = new Mapper();
        int value = mapper.getMapValue(41);
        assertEquals(8, value);
    }
}
