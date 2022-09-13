package jalau.at18.katas.pokerhands.adriana;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PokerHandAnalizerTest {

    @Test
    public void shouldSayHandKindAndHighestCard() {

        PokerHand straightFlushHand = new PokerHand("White", new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SEVEN, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.NINE, 'C'),
        });
        PokerHandAnalizer analizer = new PokerHandAnalizer(straightFlushHand);
        assertEquals(HandKind.STRAIGHT_FLUSH, analizer.getHandKind());
        assertEquals(9, analizer.getCardValueOfThePattern());

        PokerHand straightHand = new PokerHand("White", new Card[]{
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'S'),
        });
        PokerHandAnalizer analizer1 = new PokerHandAnalizer(straightHand);
        assertEquals(HandKind.STRAIGHT, analizer1.getHandKind());
        assertEquals(6, analizer1.getCardValueOfThePattern());

        PokerHand fourOfAKindHand = new PokerHand("White", new Card[]{
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        PokerHandAnalizer analizer2 = new PokerHandAnalizer(fourOfAKindHand);
        assertEquals(HandKind.FOUR_EQUALS, analizer2.getHandKind());
        assertEquals(6, analizer2.getCardValueOfThePattern());

        PokerHand fullHouseHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.EIGHT, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.EIGHT, 'S'),
            new Card(CardValue.TWO, 'C'),
        });
        PokerHandAnalizer analizer3 = new PokerHandAnalizer(fullHouseHand);
        assertEquals(HandKind.FULL_HOUSE, analizer3.getHandKind());
        assertEquals(2, analizer3.getCardValueOfThePattern());

        PokerHand flushHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.KING, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.JACK, 'C'),
        });
        PokerHandAnalizer analizer4 = new PokerHandAnalizer(flushHand);
        assertEquals(HandKind.FLUSH, analizer4.getHandKind());
        assertEquals(13, analizer4.getCardValueOfThePattern());

        PokerHand threeOfAKindHand = new PokerHand("White", new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.ACE, 'C'),
        });
        PokerHandAnalizer analizer5 = new PokerHandAnalizer(threeOfAKindHand);
        assertEquals(HandKind.THREE_EQUALS, analizer5.getHandKind());
        assertEquals(3, analizer5.getCardValueOfThePattern());

        PokerHand twoPairsHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.ACE, 'C'),
        });
        PokerHandAnalizer analizer6 = new PokerHandAnalizer(twoPairsHand);
        assertEquals(HandKind.TWO_PAIRS, analizer6.getHandKind());
        assertEquals(6, analizer6.getCardValueOfThePattern());
        
        PokerHand onePairHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SEVEN, 'S'),
            new Card(CardValue.ACE, 'C'),
        });
        PokerHandAnalizer analizer7 = new PokerHandAnalizer(onePairHand);
        assertEquals(HandKind.PAIR, analizer7.getHandKind());
        assertEquals(2, analizer7.getCardValueOfThePattern());

        PokerHand noTypeHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SEVEN, 'S'),
            new Card(CardValue.JACK, 'C'),
        });
        PokerHandAnalizer analizer8 = new PokerHandAnalizer(noTypeHand);
        assertEquals(HandKind.NONE, analizer8.getHandKind());
        assertEquals(14, analizer8.getCardValueOfThePattern());

        PokerHand twoPairsHand1 = new PokerHand("White", new Card[]{
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.TWO, 'H'),
        });
        PokerHandAnalizer analizer9 = new PokerHandAnalizer(twoPairsHand1);
        assertEquals(14, analizer9.getCardValueOfThePattern());
    }
}
