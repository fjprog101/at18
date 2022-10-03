package jalau.at18.architects.model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import jalau.at18.architects.model.cards.MilitarySymbol;
import jalau.at18.architects.model.cards.RedCard;
import jalau.at18.architects.model.player.Player;

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
    @Test 
    public void calltoWarn() {
        Game game = Game.getInstance();
        game.reset();
        List<String> names = new ArrayList<>();
        names.add("Alvaro");
        names.add("Mauri");
        names.add("Andy");
        game.initGame(3,names);
        assertEquals(3, game.getPlayers().size());
        Player turn = game.getPlayer();
        assertEquals("Alvaro", turn.getName());
        game.addCardtoPlayer(new RedCard(2, MilitarySymbol.TWO_HORN), turn);
        turn = game.getPlayer();
        assertEquals("Mauri", turn.getName());
        game.addCardtoPlayer(new RedCard(0, MilitarySymbol.PERMANENT), turn);
        assertEquals("Andy", game.getPlayers().get(0).getName());
        assertEquals(0, game.getPlayers().get(0).getPlaycard().getMilitarySection().getPermanentShield());
        assertEquals(0, game.getPlayers().get(0).getPlaycard().getMilitarySection().getTemporalShield());
        assertEquals("Alvaro", game.getPlayers().get(1).getName());
        assertEquals(0, game.getPlayers().get(1).getPlaycard().getMilitarySection().getPermanentShield());
        assertEquals(1, game.getPlayers().get(1).getPlaycard().getMilitarySection().getTemporalShield());
        assertEquals("Mauri", game.getPlayers().get(2).getName());
        assertEquals(1, game.getPlayers().get(2).getPlaycard().getMilitarySection().getPermanentShield());
        assertEquals(0, game.getPlayers().get(2).getPlaycard().getMilitarySection().getTemporalShield());
        assertEquals(3, game.getPlayers().size());
        turn = game.getPlayer();
        assertEquals("Andy", turn.getName());
        game.addCardtoPlayer(new RedCard(2, MilitarySymbol.TWO_HORN), turn);
        assertEquals("Alvaro", game.getPlayers().get(0).getName());
        assertEquals(0, game.getPlayers().get(0).getPlaycard().getMilitarySection().getPermanentShield());
        assertEquals(0, game.getPlayers().get(0).getPlaycard().getMilitarySection().getTemporalShield());
        assertEquals("Mauri", game.getPlayers().get(1).getName());
        assertEquals(1, game.getPlayers().get(1).getPlaycard().getMilitarySection().getPermanentShield());
        assertEquals(0, game.getPlayers().get(1).getPlaycard().getMilitarySection().getTemporalShield());
        assertEquals("Andy", game.getPlayers().get(2).getName());
        assertEquals(0, game.getPlayers().get(2).getPlaycard().getMilitarySection().getPermanentShield());
        assertEquals(0, game.getPlayers().get(2).getPlaycard().getMilitarySection().getTemporalShield());
        assertEquals(3, game.getPlayers().size());
        game.reset();
    }
}
