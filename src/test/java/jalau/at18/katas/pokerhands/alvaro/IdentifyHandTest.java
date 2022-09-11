package jalau.at18.katas.pokerhands.alvaro;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class IdentifyHandTest {

    @Test
    public void shouldIdentifyATypeOfHand() {
        IdentifyHand identify = new IdentifyHand();
        PokerHand handTwoPair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertEquals(TypesOfHands.TWOPAIR.getRankValue(),identify.searchTypeHand(handTwoPair));
    }


}
