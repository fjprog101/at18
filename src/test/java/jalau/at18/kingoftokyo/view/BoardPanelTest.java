package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;

import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.model.TokyoCity;
import jalau.at18.kingoftokyo.view.board.BoardPanel;

import org.junit.Test;

public class BoardPanelTest {
    @Test
    public void shouldShowTheBoard() {
        TokyoCity tokyoCity = new TokyoCity();
        Player player = new Player();
        player.addMonster(Monster.ALIENOID);
        BoardPanel boardpanel = new BoardPanel(tokyoCity);
        assertEquals(1, boardpanel.getComponentCount());
        assertEquals(500, boardpanel.getWidth());
        assertEquals(500, boardpanel.getHeight());

    }
}
