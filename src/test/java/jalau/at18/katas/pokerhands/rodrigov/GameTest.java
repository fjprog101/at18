package jalau.at18.katas.pokerhands.rodrigov;
import static org.junit.Assert.assertEquals;

import org.junit.Test;;
public class GameTest {

    @Test
    public void shouldSayIfTheHandIsHighCard() {
        PokerHand hand = new PokerHand(new Card[] {
                new Card(CardValue.THREE, 'C'),
                new Card(CardValue.FIVE, 'S'),
                new Card(CardValue.FOUR, 'D'),
                new Card(CardValue.NINE, 'H'),
                new Card(CardValue.TWO, 'C'),
        });
        Game game = new Game(hand);
        assertEquals(Rank.HIGHCARD, game.getidentifyPokerHand());
    }

    @Test
    public void shouldSayIfTheHandIsOnePair() {

        PokerHand hand = new PokerHand(new Card[] {
                new Card(CardValue.TWO, 'S'),
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.FOUR, 'H'),
                new Card(CardValue.QUEEN, 'C'),
                new Card(CardValue.KING, 'D'),
        });
        Game game = new Game(hand);
        assertEquals(Rank.PAIR, game.getidentifyPokerHand());
    }

    @Test
    public void shouldSayIfTheHandIsTwoPairs() {

        PokerHand hand = new PokerHand(new Card[] {
                new Card(CardValue.TWO, 'S'),
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.FOUR, 'H'),
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.THREE, 'C'),
        });
        Game game = new Game(hand);
        assertEquals(Rank.TWOPAIRS, game.getidentifyPokerHand());
    }

    @Test
    public void shouldSayIfTheHandIsThreeOfAKind() {

        PokerHand hand = new PokerHand(new Card[] {
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.FOUR, 'D'),
                new Card(CardValue.FIVE, 'S'),
                new Card(CardValue.TWO, 'H'),
        });
        Game game = new Game(hand);
        assertEquals(Rank.THREEOFAKIND, game.getidentifyPokerHand());
    }

    @Test
    public void shouldSayIfTheHandIsStraight() {

        PokerHand hand = new PokerHand(new Card[] {
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.FOUR, 'D'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.SIX, 'D'),
        });
        Game game = new Game(hand);
        assertEquals(Rank.STRAIGHT, game.getidentifyPokerHand());
    }


    @Test
    public void shouldSayIfTheHandIsFlush() {

        PokerHand hand = new PokerHand(new Card[] {
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.FIVE, 'D'),
                new Card(CardValue.FOUR, 'D'),
                new Card(CardValue.QUEEN, 'D'),
                new Card(CardValue.ACE, 'D'),
        });
        Game game = new Game(hand);
        assertEquals(Rank.FLUSH, game.getidentifyPokerHand());
    }

    @Test
    public void shouldSayIfTheHandIsFullHouse() {

        PokerHand hand = new PokerHand(new Card[] {
                new Card(CardValue.TWO, 'S'),
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.FOUR, 'H'),
                new Card(CardValue.TWO, 'S'),
        });
        Game game = new Game(hand);
        assertEquals(Rank.FULLHOUSE, game.getidentifyPokerHand());
    }

    @Test
    public void shouldSayIfTheHandIsFourOfAKind() {

        PokerHand hand = new PokerHand(new Card[] {
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.TWO, 'S'),
        });
        Game game = new Game(hand);
        assertEquals(Rank.FOUROFAKIND, game.getidentifyPokerHand());
    }

    @Test
    public void shouldSayIfTheHandIsStraightFlush() {

        PokerHand hand = new PokerHand(new Card[] {
                new Card(CardValue.EIGHT, 'C'),
                new Card(CardValue.NINE, 'C'),
                new Card(CardValue.TEN, 'C'),
                new Card(CardValue.JACK, 'C'),
                new Card(CardValue.QUEEN, 'C'),
        });
        Game game = new Game(hand);
        assertEquals(Rank.STRAIGHTFLUSH, game.getidentifyPokerHand());
    }
}
