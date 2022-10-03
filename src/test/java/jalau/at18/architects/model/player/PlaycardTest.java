package jalau.at18.architects.model.player;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import jalau.at18.architects.model.cards.Resource;
import jalau.at18.architects.model.cards.BlueCard;
import jalau.at18.architects.model.cards.GrayCard;
import jalau.at18.architects.model.cards.GreenCard;
import jalau.at18.architects.model.cards.MilitarySymbol;
import jalau.at18.architects.model.cards.RedCard;
import jalau.at18.architects.model.cards.ScientificSymbol;

public class PlaycardTest {
    @Test
    public void addCardsToPlayCards() {
        Playcard playcard = new Playcard();
        BlueCard blueCard = new BlueCard(false, 3);
        RedCard redCard = new RedCard(1, MilitarySymbol.ONE_HORN);
        playcard.addNewCard(blueCard);
        playcard.addNewCard(redCard);
        assertEquals(1, playcard.getMilitarySection().getTemporalShield());
        assertEquals(3, playcard.getBluePoints().getPoints());
    }
    @Test
    public void addCardsToPlayCards1() {
        Playcard playcard = new Playcard();
        GrayCard grayCard = new GrayCard(Resource.WATER);
        GreenCard greenCard = new GreenCard(ScientificSymbol.COMPASS);
        playcard.addNewCard(grayCard);
        playcard.addNewCard(greenCard);
        assertEquals(1, playcard.getScienceSection().sizeOfScienceELementsList());
        assertEquals(1, playcard.getResourceSection().getUpdateList().sizeOfResourceList());
    }

}
