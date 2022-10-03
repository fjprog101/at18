package jalau.at18.architects.model.player;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import jalau.at18.architects.model.cards.MilitarySymbol;
import jalau.at18.architects.model.cards.RedCard;
import jalau.at18.architects.model.wonders.Wonders;

public class PlayerTest {
    @Test
    public void createNewPlayer() {
        Player player = new Player("Jose", Wonders.FOUR.getWonder());
        assertEquals("Jose", player.getName());
        assertNotNull(player.getWonder());
        assertEquals(0, player.getPlaycard().getBluePoints().getPoints());
        assertEquals(0, player.getPlaycard().getWarWinnerPoints().getPoints());
        assertEquals(0, player.getPlaycard().getScienceSection().sizeOfScienceELementsList());
        assertEquals(0, player.getPlaycard().getMilitarySection().getTemporalShield());
        assertEquals(0, player.getPlaycard().getMilitarySection().getPermanentShield());
    }

    @Test
    public void addCardtoPlayer() {
        Player player = new Player("Jose", Wonders.FOUR.getWonder());
        assertEquals("Jose", player.getName());
        assertNotNull(player.getWonder());
        assertEquals(0, player.getPlaycard().getBluePoints().getPoints());
        assertEquals(0, player.getPlaycard().getWarWinnerPoints().getPoints());
        assertEquals(0, player.getPlaycard().getScienceSection().sizeOfScienceELementsList());
        assertEquals(0, player.getPlaycard().getMilitarySection().getTemporalShield());
        assertEquals(0, player.getPlaycard().getMilitarySection().getPermanentShield());
    }
    @Test
    public void shouldAddCardToPlayCard() {
        Player player = new Player("Jose", Wonders.FOUR.getWonder());
        RedCard card = new RedCard(2, MilitarySymbol.TWO_HORN);
        player.addNewCard(card);
        Playcard playcard = player.getPlaycard();
        assertEquals(1, playcard.getMilitarySection().getTemporalShield());
    }

}
