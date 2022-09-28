package jalau.at18.architects.model.player;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jalau.at18.architects.model.cards.BlueCard;
import jalau.at18.architects.model.cards.RedCard;

public class PlaycardTest {
    @Test
    public void addCardsToPlayCards() {
        Playcard playcard = new Playcard();
        BlueCard blueCard = new BlueCard(false, 3);
        RedCard redCard = new RedCard(1);
        playcard.addNewCard(blueCard);
        playcard.addNewCard(redCard);
        assertEquals(1, playcard.getMilitarySection().getTemporalShield());
        assertEquals(3, playcard.getBluePoints().getPoints());
    }
    
}
