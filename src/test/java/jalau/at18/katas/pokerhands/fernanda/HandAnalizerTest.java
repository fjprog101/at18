package jalau.at18.katas.pokerhands.fernanda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HandAnalizerTest {
    @Test
    public void shouldidentifyTwoPairs() {

        PokerHand twopairhand = new PokerHand(new Card[] {
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.FOUR, 'S'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.SIX, 'C'),
        });
        HandAnalizer analizer = new HandAnalizer(twopairhand);
        assertEquals(RankHand.TWOPAIRS, analizer.identifyPokerhand());
    }
    @Test
    public void shouldidentifythreeofAKind() {

        PokerHand threeofakind = new PokerHand(new Card[] {
                new Card(CardValue.QUEEN, 'T'),
                new Card(CardValue.QUEEN, 'D'),
                new Card(CardValue.QUEEN, 'C'),
                new Card(CardValue.TWO, 'S'),
                new Card(CardValue.ACE, 'S'),
        });
        HandAnalizer analizer = new HandAnalizer(threeofakind);
        assertEquals(RankHand.THREEOFAKIND, analizer.identifyPokerhand());
    }
    @Test
    public void shouldidentifyFourofAKind() {

        PokerHand fourofakind = new PokerHand(new Card[] {
                new Card(CardValue.QUEEN, 'T'),
                new Card(CardValue.QUEEN, 'D'),
                new Card(CardValue.QUEEN, 'C'),
                new Card(CardValue.QUEEN, 'S'),
                new Card(CardValue.ACE, 'S'),
        });
        HandAnalizer analizer = new HandAnalizer(fourofakind);
        assertEquals(RankHand.FOUROFAKIND, analizer.identifyPokerhand());
    }
    @Test
    public void shouldidentifyFullHouse() {

        PokerHand straightFlush = new PokerHand(new Card[] {
                new Card(CardValue.THREE, 'T'),
                new Card(CardValue.THREE, 'D'),
                new Card(CardValue.THREE, 'C'),
                new Card(CardValue.KING, 'S'),
                new Card(CardValue.KING, 'S'),
        });
        HandAnalizer analizer = new HandAnalizer(straightFlush);
        assertEquals(RankHand.FULLHOUSE, analizer.identifyPokerhand());
    }
    @Test
    public void shouldidentifyPair() {

        PokerHand pair = new PokerHand(new Card[] {
                new Card(CardValue.THREE, 'T'),
                new Card(CardValue.THREE, 'D'),
                new Card(CardValue.QUEEN, 'C'),
                new Card(CardValue.KING, 'S'),
                new Card(CardValue.ACE, 'S'),
        });
        HandAnalizer analizer = new HandAnalizer(pair);
        assertEquals(RankHand.PAIR, analizer.identifyPokerhand());
    }
    @Test
    public void shouldidentifyStraight() {

        PokerHand straight = new PokerHand(new Card[] {
                new Card(CardValue.THREE, 'T'),
                new Card(CardValue.FOUR, 'D'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.SIX, 'S'),
                new Card(CardValue.SEVEN, 'S'),
        });
        HandAnalizer analizer = new HandAnalizer(straight);
        assertEquals(RankHand.STRAIGHT, analizer.identifyPokerhand());
    }
    @Test
    public void shouldidentifyFlush() {

        PokerHand flush = new PokerHand(new Card[] {
                new Card(CardValue.THREE, 'T'),
                new Card(CardValue.KING, 'T'),
                new Card(CardValue.FIVE, 'T'),
                new Card(CardValue.SIX, 'T'),
                new Card(CardValue.SEVEN, 'T'),
        });
        HandAnalizer analizer = new HandAnalizer(flush);
        assertEquals(RankHand.FLUSH, analizer.identifyPokerhand());
    }
    @Test
    public void shouldidentifyStraightFlush() {

        PokerHand straightflush = new PokerHand(new Card[] {
                new Card(CardValue.THREE, 'T'),
                new Card(CardValue.FOUR, 'T'),
                new Card(CardValue.FIVE, 'T'),
                new Card(CardValue.SIX, 'T'),
                new Card(CardValue.SEVEN, 'T'),
        });
        HandAnalizer analizer = new HandAnalizer(straightflush);
        assertEquals(RankHand.STRAIGHTFLUSH, analizer.identifyPokerhand());
    }

}
