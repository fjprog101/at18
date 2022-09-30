package jalau.at18.architects.model.player;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jalau.at18.architects.model.cards.RedCard;
import jalau.at18.architects.model.wonders.Wonders;

public class PlayerTest {
    @Test
    public void createNewPlayer() {
        Player player = new Player("Jose", Wonders.FOUR);
        assertEquals("Jose", player.getName());
        assertEquals(4, player.getWonder().getNumberWonder());
        assertEquals(0, player.getPlaycard().getBluePoints().getPoints());
        assertEquals(0, player.getPlaycard().getWarWinnerPoints().getPoints());
        assertEquals(0, player.getPlaycard().getScienceSection().sizeOfScienceELementsList());
        assertEquals(0, player.getPlaycard().getMilitarySection().getTemporalShield());
        assertEquals(0, player.getPlaycard().getMilitarySection().getPermanentShield());
    }

    @Test
    public void addCardtoPlayer() {
        Player player = new Player("Jose", Wonders.FOUR);
        assertEquals("Jose", player.getName());
        assertEquals(4, player.getWonder().getNumberWonder());
        assertEquals(0, player.getPlaycard().getBluePoints().getPoints());
        assertEquals(0, player.getPlaycard().getWarWinnerPoints().getPoints());
        assertEquals(0, player.getPlaycard().getScienceSection().sizeOfScienceELementsList());
        assertEquals(0, player.getPlaycard().getMilitarySection().getTemporalShield());
        assertEquals(0, player.getPlaycard().getMilitarySection().getPermanentShield());
    }
    @Test
    public void shouldAddCardToPlayCard() {
        Player player = new Player("Jose", Wonders.FOUR);
        RedCard card = new RedCard(2);
        player.addNewCard(card);
        Playcard playcard = player.getPlaycard();
        assertEquals(1, playcard.getMilitarySection().getTemporalShield());
    }

}
