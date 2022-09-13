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

        PokerHand straightFlushHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.FIVE, 'C'),
        });
        assertEquals(TypesOfHands.STRAIGHTFLUSH.getRankValue(),identify.searchTypeHand(straightFlushHand));

        PokerHand highCardHand = new PokerHand(new Card[]{
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.QUEEN, 'H'),
            new Card(CardValue.ACE, 'C'),
        });
        assertEquals(TypesOfHands.HIGHCARD.getRankValue(),identify.searchTypeHand(highCardHand));

        PokerHand flushHand = new PokerHand(new Card[]{ //flush hand
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SEVEN, 'S'),
            new Card(CardValue.JACK, 'S'),
            new Card(CardValue.QUEEN, 'S'),
            new Card(CardValue.KING, 'S'),
        });
        assertEquals(TypesOfHands.FLUSH.getRankValue(),identify.searchTypeHand(flushHand));

        PokerHand pairHand = new PokerHand(new Card[]{ //pair hand
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.QUEEN, 'H'),
            new Card(CardValue.SIX, 'C'),
        });
        assertEquals(TypesOfHands.PAIR.getRankValue(),identify.searchTypeHand(pairHand));

        PokerHand straightHand = new PokerHand(new Card[]{ //straight hand
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'C'),
        });
        assertEquals(TypesOfHands.STRAIGHT.getRankValue(),identify.searchTypeHand(straightHand));

        PokerHand threeOfAKindHand = new PokerHand(new Card[]{ // three of a kind hand
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'C'),
        });
        assertEquals(TypesOfHands.THREEOFAKIND.getRankValue(),identify.searchTypeHand(threeOfAKindHand));

        PokerHand FullHouseHand = new PokerHand(new Card[]{ //Full House hand
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.TWO,'C'),
            new Card(CardValue.TWO,'D'),
            new Card(CardValue.TWO,'S'),
        });
        assertEquals(TypesOfHands.FULLHOUSE.getRankValue(),identify.searchTypeHand(FullHouseHand));


        PokerHand fourOfAKindHand = new PokerHand(new Card[]{ // fourof akind
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO,'C'),
            new Card(CardValue.TWO,'D'),
            new Card(CardValue.THREE,'S'),
        });
        assertEquals(TypesOfHands.FOUROFAKIND.getRankValue(),identify.searchTypeHand(fourOfAKindHand));

    }


}
