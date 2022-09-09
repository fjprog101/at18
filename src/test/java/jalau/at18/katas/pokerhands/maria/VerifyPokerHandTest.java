package jalau.at18.katas.pokerhands.maria;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VerifyPokerHandTest {
    @Test
    public void shouldIdentifyStraightFlushWithOrderCards() {
        VerifyPokerHand verifyPokerHand = new VerifyPokerHand();

        PokerHand straightFlushHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.FOUR, 'H'),
                new Card(CardValue.FIVE, 'H'),
                new Card(CardValue.SIX, 'H'),
        });
        PokerHandRank pokerHandRank = verifyPokerHand.returnTypePokerHand(straightFlushHand);
        assertEquals(PokerHandType.STRAIGHTFLUSH, pokerHandRank.getPokerHandType());
    }

    @Test
    public void shouldIdentifyStraightFlushWithMessyCards() {
        VerifyPokerHand verifyPokerHand = new VerifyPokerHand();

        PokerHand straightFlushHand = new PokerHand(new Card[]{
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.SIX, 'H'),
                new Card(CardValue.FOUR, 'H'),
                new Card(CardValue.FIVE, 'H'),
                new Card(CardValue.TWO, 'H'),
        });
        PokerHandRank pokerHandRank = verifyPokerHand.returnTypePokerHand(straightFlushHand);
        assertEquals(PokerHandType.STRAIGHTFLUSH, pokerHandRank.getPokerHandType());
    }

    @Test
    public void shouldIdentifyFourKind() {
        VerifyPokerHand verifyPokerHand = new VerifyPokerHand();
        PokerHand fourKindHand = new PokerHand(new Card[]{
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.SIX, 'D'),
                new Card(CardValue.THREE, 'C'),
                new Card(CardValue.THREE, 'S'),
                new Card(CardValue.THREE, 'H'),
        });
        PokerHandRank pokerHandRank = verifyPokerHand.returnTypePokerHand(fourKindHand);
        assertEquals(PokerHandType.FOURKIND, pokerHandRank.getPokerHandType());
    }

    @Test
    public void shouldIdentifyFullHouse() {
        VerifyPokerHand verifyPokerHand = new VerifyPokerHand();
        PokerHand fullHouseHand = new PokerHand(new Card[]{
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.SIX, 'D'),
                new Card(CardValue.SIX, 'C'),
                new Card(CardValue.THREE, 'S'),
                new Card(CardValue.THREE, 'H'),
        });
        PokerHandRank pokerHandRank = verifyPokerHand.returnTypePokerHand(fullHouseHand);
        assertEquals(PokerHandType.FULLHOUSE, pokerHandRank.getPokerHandType());
    }

    @Test
    public void shouldIdentifyFlush() {
        VerifyPokerHand verifyPokerHand = new VerifyPokerHand();
        PokerHand flushHand = new PokerHand(new Card[]{
                new Card(CardValue.THREE, 'D'),
                new Card(CardValue.SIX, 'D'),
                new Card(CardValue.SIX, 'D'),
                new Card(CardValue.FOUR, 'D'),
                new Card(CardValue.FIVE, 'D'),
        });
        PokerHandRank pokerHandRank = verifyPokerHand.returnTypePokerHand(flushHand);
        assertEquals(PokerHandType.FLUSH, pokerHandRank.getPokerHandType());
    }

    @Test
    public void shouldIdentifyStraight() {
        VerifyPokerHand verifyPokerHand = new VerifyPokerHand();
        PokerHand straight = new PokerHand(new Card[]{
                new Card(CardValue.THREE, 'D'),
                new Card(CardValue.FOUR, 'S'),
                new Card(CardValue.SIX, 'C'),
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.FIVE, 'H'),
        });
        PokerHandRank pokerHandRank = verifyPokerHand.returnTypePokerHand(straight);
        assertEquals(PokerHandType.STRAIGHT, pokerHandRank.getPokerHandType());
    }

    @Test
    public void shouldIdentifyThreeKind() {
        VerifyPokerHand verifyPokerHand = new VerifyPokerHand();
        PokerHand threeKind = new PokerHand(new Card[]{
                new Card(CardValue.FOUR, 'D'),
                new Card(CardValue.FOUR, 'S'),
                new Card(CardValue.SIX, 'C'),
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.FOUR, 'H'),
        });
        PokerHandRank pokerHandRank = verifyPokerHand.returnTypePokerHand(threeKind);
        assertEquals(PokerHandType.THREEKIND, pokerHandRank.getPokerHandType());
    }

    @Test
    public void shouldIdentifyTwoPairs() {
        VerifyPokerHand verifyPokerHand = new VerifyPokerHand();
        PokerHand twoPairs = new PokerHand(new Card[]{
                new Card(CardValue.FOUR, 'D'),
                new Card(CardValue.FOUR, 'S'),
                new Card(CardValue.SIX, 'C'),
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.TWO, 'H'),
        });
        PokerHandRank pokerHandRank = verifyPokerHand.returnTypePokerHand(twoPairs);
        assertEquals(PokerHandType.TWOPAIRS, pokerHandRank.getPokerHandType());
    }

    @Test
    public void shouldIdentifyPair() {
        VerifyPokerHand verifyPokerHand = new VerifyPokerHand();
        PokerHand pair = new PokerHand(new Card[]{
                new Card(CardValue.FIVE, 'D'),
                new Card(CardValue.NINE, 'S'),
                new Card(CardValue.SIX, 'C'),
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.TWO, 'H'),
        });
        PokerHandRank pokerHandRank = verifyPokerHand.returnTypePokerHand(pair);
        assertEquals(PokerHandType.PAIR, pokerHandRank.getPokerHandType());
    }

    @Test
    public void shouldIdentifyHighCard() {
        VerifyPokerHand verifyPokerHand = new VerifyPokerHand();
        PokerHand highCard = new PokerHand(new Card[]{
                new Card(CardValue.FIVE, 'D'),
                new Card(CardValue.NINE, 'S'),
                new Card(CardValue.KING, 'C'),
                new Card(CardValue.THREE, 'D'),
                new Card(CardValue.TWO, 'H'),
        });
        PokerHandRank pokerHandRank = verifyPokerHand.returnTypePokerHand(highCard);
        assertEquals(PokerHandType.HIGHCARD, pokerHandRank.getPokerHandType());
    }


}
