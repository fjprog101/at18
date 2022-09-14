package jalau.at18.azul;

import org.junit.Test;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

public class TileTest {
    @Test
    public void shouldReturnthereisavalueintheenum() {
        assertThat(Tile.valueOf("RED"), is(notNullValue()));
        assertThat(Tile.valueOf("YELLOW"), is(notNullValue()));
        assertThat(Tile.valueOf("DARK"), is(notNullValue()));
        assertThat(Tile.valueOf("BLUE"), is(notNullValue()));
        assertThat(Tile.valueOf("WHITE"), is(notNullValue()));
        assertThat(Tile.valueOf("FIRST_PLAYER"), is(notNullValue()));
    }

}
