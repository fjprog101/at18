package jalau.at18.katas.pokerhands.adriana;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PokerHandAnalizerTest {

    @Test
    public void shouldSayHandKind() {

        PokerHand straightFlushHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        PokerHandAnalizer analizer = new PokerHandAnalizer(straightFlushHand);
        assertEquals(HandKind.STRAIGHT_FLUSH, analizer.getHandKind());

        PokerHand straightHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        PokerHandAnalizer analizer1 = new PokerHandAnalizer(straightHand);
        assertEquals(HandKind.STRAIGHT, analizer1.getHandKind());

        PokerHand fourOfAKindHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        PokerHandAnalizer analizer2 = new PokerHandAnalizer(fourOfAKindHand);
        assertEquals(HandKind.FOUR_EQUALS, analizer2.getHandKind());

        PokerHand fullHouseHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        PokerHandAnalizer analizer3 = new PokerHandAnalizer(fullHouseHand);
        assertEquals(HandKind.FULL_HOUSE, analizer3.getHandKind());

        PokerHand flushHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.JACK, 'C'),
        });
        PokerHandAnalizer analizer4 = new PokerHandAnalizer(flushHand);
        assertEquals(HandKind.FLUSH, analizer4.getHandKind());

        PokerHand threeOfAKindHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.ACE, 'C'),
        });
        PokerHandAnalizer analizer5 = new PokerHandAnalizer(threeOfAKindHand);
        assertEquals(HandKind.THREE_EQUALS, analizer5.getHandKind());

        PokerHand twoPairsHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.ACE, 'C'),
        });
        PokerHandAnalizer analizer6 = new PokerHandAnalizer(twoPairsHand);
        assertEquals(HandKind.TWO_PAIRS, analizer6.getHandKind());
        
        PokerHand onePairHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SEVEN, 'S'),
            new Card(CardValue.ACE, 'C'),
        });
        PokerHandAnalizer analizer7 = new PokerHandAnalizer(onePairHand);
        assertEquals(HandKind.PAIR, analizer7.getHandKind());

        PokerHand noTypeHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SEVEN, 'S'),
            new Card(CardValue.JACK, 'C'),
        });
        PokerHandAnalizer analizer8 = new PokerHandAnalizer(noTypeHand);
        assertEquals(HandKind.NONE, analizer8.getHandKind());
    }
}
