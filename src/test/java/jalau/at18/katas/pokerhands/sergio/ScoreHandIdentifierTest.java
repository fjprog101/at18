package jalau.at18.katas.pokerhands.sergio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScoreHandIdentifierTest {
    ScoreHandIdentifier identifier = new ScoreHandIdentifier();

    @Test
    public void shouldIdentifyStraightFlushHand() {
        PokerHand straightFlushHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'), });
        assertEquals(10, identifier.getScore(straightFlushHand));
    }

    @Test
    public void shouldIdentifyPokerHand() {
        PokerHand pokerHand = new PokerHand(new Card[]{
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.JACK, 'C'), });
        assertEquals(9, identifier.getScore(pokerHand));
    }

    @Test
    public void shouldIdentifyFullHouseHand() {
        PokerHand fullsHouseHand = new PokerHand(new Card[]{
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.ACE, 'C'), });
        assertEquals(8, identifier.getScore(fullsHouseHand));
    }

    @Test
    public void shouldIdentifyFlushHand() {
        PokerHand flushHand = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SEVEN, 'S'),
            new Card(CardValue.JACK, 'S'),
            new Card(CardValue.ACE, 'S'), });
        assertEquals(7, identifier.getScore(flushHand));
    }

    @Test
    public void shouldIdentifyStraightHand() {
        PokerHand straightHand = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'S'),
            new Card(CardValue.NINE, 'D'),
            new Card(CardValue.TEN, 'H'),
            new Card(CardValue.JACK, 'S'),
            new Card(CardValue.QUEEN, 'C'), });
        assertEquals(6, identifier.getScore(straightHand));
    }

    @Test
    public void shouldIdentifyThreeOfKindHand() {
        PokerHand threeOfKindHand = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'S'),
            new Card(CardValue.EIGHT, 'D'),
            new Card(CardValue.EIGHT, 'H'),
            new Card(CardValue.JACK, 'S'),
            new Card(CardValue.QUEEN, 'C'), });
        assertEquals(5, identifier.getScore(threeOfKindHand));
    }

    @Test
    public void shouldIdentifyTwoPairsHand() {
        PokerHand twoPairsHand = new PokerHand(new Card[]{
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.TEN, 'H'),
            new Card(CardValue.TEN, 'S'),
            new Card(CardValue.QUEEN, 'C'), });
        assertEquals(4, identifier.getScore(twoPairsHand));
    }

    @Test
    public void shouldIdentifyOnePairHand() {
        PokerHand onePairHand = new PokerHand(new Card[]{
            new Card(CardValue.NINE, 'S'),
            new Card(CardValue.NINE, 'D'),
            new Card(CardValue.TEN, 'H'),
            new Card(CardValue.JACK, 'S'),
            new Card(CardValue.ACE, 'C'), });
        assertEquals(2, identifier.getScore(onePairHand));
    }

}
