package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;

import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.view.board.BoardPanel;

import org.junit.Test;

public class BoardPanelTest {
    @Test
    public void shouldShowTheBoard() {
        Player player = new Player();
        player.addMonster(Monster.ALIENOID);
        BoardPanel boardpanel = new BoardPanel();
        assertEquals(1, boardpanel.getComponentCount());
        assertEquals(500, boardpanel.getWidth());
        assertEquals(500, boardpanel.getHeight());

    }
}
