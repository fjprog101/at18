package jalau.at18.katas.pokerhands.sergio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DetermineWinnerTest {

    @Test
    public void IdentifyWhoWins() {
        DetermineWinnner identifier = new DetermineWinnner();

        PokerHand hand1TwoPairs = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.QUEEN, 'C'), });

        PokerHand hand2OnePair = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.EIGHT, 'H'),
            new Card(CardValue.QUEEN, 'C'), });

        assertEquals(4, identifier.handScore(hand1TwoPairs));
        assertEquals(2, identifier.handScore(hand2OnePair));

        PokerHand hand1FullHouse = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.NINE, 'C'),
            new Card(CardValue.NINE, 'H'), });

        PokerHand hand2PokerHand = new PokerHand(new Card[]{
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.SIX, 'C'), });

        assertEquals(8, identifier.handScore(hand1FullHouse));
        assertEquals(9, identifier.handScore(hand2PokerHand));

        PokerHand hand1Flush = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.EIGHT, 'S'),
            new Card(CardValue.QUEEN, 'S'), });

        PokerHand hand2ThreeOfKind = new PokerHand(new Card[]{
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.EIGHT, 'H'),
            new Card(CardValue.TEN, 'C'), });

        assertEquals(7, identifier.handScore(hand1Flush));
        assertEquals(5, identifier.handScore(hand2ThreeOfKind));

    }

}