package jalau.at18.azul;

import org.junit.Test;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

public class TilesTest {
    @Test
    public void shouldReturnthereisavalueintheenum() {
        assertThat(Tiles.valueOf("RED"), is(notNullValue()));
        assertThat(Tiles.valueOf("YELLOW"), is(notNullValue()));
        assertThat(Tiles.valueOf("DARK"), is(notNullValue()));
        assertThat(Tiles.valueOf("BLUE"), is(notNullValue()));
        assertThat(Tiles.valueOf("WHITE"), is(notNullValue()));
        assertThat(Tiles.valueOf("FIRST_PLAYER"), is(notNullValue()));
    }

}
