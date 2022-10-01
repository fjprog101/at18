package jalau.at18.architects.view;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import jalau.at18.architects.model.Game;

public class BoardFrameTest {
    @Test
    public void boardFrameShouldShowByDefault() {
        Game game = Game.getInstance();
        game.reset();
        List<String> names = new ArrayList<>();
        names.add("Alvaro");
        names.add("Mauri");
        game.initGame(2,names);
        BoardFrame boardFrame = new BoardFrame(game);
        assertEquals(840, boardFrame.getWidth());
        assertEquals(737, boardFrame.getHeight());
    }
}
