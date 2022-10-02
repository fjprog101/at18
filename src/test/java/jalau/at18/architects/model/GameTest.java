package jalau.at18.architects.model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GameTest {
    @Test 
    public void createGameWith2Players() {
        Game game = Game.getInstance();
        game.reset();
        List<String> names = new ArrayList<>();
        names.add("Alvaro");
        names.add("Mauri");
        game.initGame(2,names);
        assertEquals(2, game.getPlayers().size());
        assertEquals("Alvaro", game.getPlayers().get(0).getName());
        assertEquals("Mauri", game.getPlayers().get(1).getName());
        game.reset();
    }
    @Test 
    public void createGameWith3Players() {
        Game game = Game.getInstance();
        game.reset();
        List<String> names = new ArrayList<>();
        names.add("Alvaro");
        names.add("Mauri");
        names.add("Jose");
        game.initGame(3, names);
        assertEquals(3, game.getPlayers().size());
        assertEquals("Alvaro", game.getPlayers().get(0).getName());
        assertEquals("Mauri", game.getPlayers().get(1).getName());
        assertEquals("Jose", game.getPlayers().get(2).getName());
        game.reset();
    }
    @Test 
    public void addCardsToPlayers() {
        Game game = Game.getInstance();
        game.reset();
        List<String> names = new ArrayList<>();
        names.add("Alvaro");
        names.add("Mauri");
        game.initGame(2,names);
        assertEquals(2, game.getPlayers().size());
        assertEquals("Alvaro", game.getPlayers().get(0).getName());
        assertEquals("Mauri", game.getPlayers().get(1).getName());
        game.reset();
    }
    @Test 
    public void getPlayer() {
        Game game = Game.getInstance();
        game.reset();
        List<String> names = new ArrayList<>();
        names.add("Alvaro");
        names.add("Mauri");
        game.initGame(2,names);
        assertEquals(2, game.getPlayers().size());
        assertEquals("Alvaro", game.getPlayer().getName());
        assertEquals("Mauri", game.getPlayers().get(0).getName());
        assertEquals("Alvaro", game.getPlayers().get(1).getName());
        assertEquals(2, game.getPlayers().size());
        game.reset();
    }
}
