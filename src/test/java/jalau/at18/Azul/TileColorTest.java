package jalau.at18.azul;

import org.junit.Test;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

public class TileColorTest {
    @Test
    public void shouldReturnthereisavalueintheenum() {
        assertThat(TileColor.valueOf("RED"), is(notNullValue()));
        assertThat(TileColor.valueOf("YELLOW"), is(notNullValue()));
        assertThat(TileColor.valueOf("DARK"), is(notNullValue()));
        assertThat(TileColor.valueOf("BLUE"), is(notNullValue()));
        assertThat(TileColor.valueOf("WHITE"), is(notNullValue()));
        assertThat(TileColor.valueOf("FIRST"), is(notNullValue()));
    }

}
