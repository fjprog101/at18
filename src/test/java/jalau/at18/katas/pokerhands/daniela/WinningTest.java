package jalau.at18.katas.pokerhands.daniela;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class WinningTest {
        @Test
        public void shouldIdentifyWinnerGame1() {
                Winning identifywinner = new Winning();

                PokerHand White = new PokerHand(new Card[] {
                                new Card(CardValue.TWO, 'C'),
                                new Card(CardValue.TWO, 'C'),
                                new Card(CardValue.FOUR, 'H'),
                                new Card(CardValue.FIVE, 'S'),
                                new Card(CardValue.SIX, 'D'),
                });
                PokerHand Black = new PokerHand(new Card[] {
                                new Card(CardValue.TWO, 'C'),
                                new Card(CardValue.THREE, 'C'),
                                new Card(CardValue.FOUR, 'C'),
                                new Card(CardValue.FIVE, 'C'),
                                new Card(CardValue.SIX, 'C'),
                });

                assertEquals("Player black wins", identifywinner.defineWinner(White, Black));
        }

        @Test
        public void shouldIdentifyWinnerGame2() {
                Winning identifywinner = new Winning();

                PokerHand White = new PokerHand(new Card[] {
                                new Card(CardValue.TWO, 'C'),
                                new Card(CardValue.TWO, 'C'),
                                new Card(CardValue.TWO, 'H'),
                                new Card(CardValue.FIVE, 'S'),
                                new Card(CardValue.SIX, 'D'),
                });
                PokerHand Black = new PokerHand(new Card[] {
                                new Card(CardValue.TWO, 'H'),
                                new Card(CardValue.THREE, 'C'),
                                new Card(CardValue.FOUR, 'S'),
                                new Card(CardValue.NINE, 'D'),
                                new Card(CardValue.JACK, 'C'),
                });

                assertEquals("Player white wins", identifywinner.defineWinner(White, Black));
        }

        @Test
        public void shouldIdentifyATie() {
                Winning identifywinner = new Winning();

                PokerHand White = new PokerHand(new Card[] {
                                new Card(CardValue.TWO, 'C'),
                                new Card(CardValue.TWO, 'C'),
                                new Card(CardValue.TWO, 'C'),
                                new Card(CardValue.FIVE, 'C'),
                                new Card(CardValue.SIX, 'C'),
                });
                PokerHand Black = new PokerHand(new Card[] {
                                new Card(CardValue.TWO, 'C'),
                                new Card(CardValue.TWO, 'C'),
                                new Card(CardValue.TWO, 'C'),
                                new Card(CardValue.FIVE, 'C'),
                                new Card(CardValue.SEVEN, 'C'),
                });

                assertEquals("Blackwins",
                                identifywinner.defineWinnerinatie(White, Black, CardValue.TWO, CardValue.THREE));
        }

        @Test
        public void shouldIdentifyATieWhereWhiteWins() {
                Winning identifywinner = new Winning();

                PokerHand Black = new PokerHand(new Card[] {
                                new Card(CardValue.TWO, 'C'),
                                new Card(CardValue.TWO, 'H'),
                                new Card(CardValue.FOUR, 'C'),
                                new Card(CardValue.FIVE, 'S'),
                                new Card(CardValue.JACK, 'C'),
                });
                PokerHand White = new PokerHand(new Card[] {
                                new Card(CardValue.THREE, 'C'),
                                new Card(CardValue.THREE, 'D'),
                                new Card(CardValue.FOUR, 'D'),
                                new Card(CardValue.FIVE, 'C'),
                                new Card(CardValue.SIX, 'S'),
                });

                assertEquals("Whitewins",
                                identifywinner.defineWinnerinatie(White, Black, CardValue.TWO, CardValue.THREE));
        }

        @Test
        public void shouldIdentifyThereisaWinnerAlready() {
                Winning identifywinner = new Winning();

                PokerHand Black = new PokerHand(new Card[] {
                                new Card(CardValue.TWO, 'C'),
                                new Card(CardValue.TWO, 'H'),
                                new Card(CardValue.FOUR, 'C'),
                                new Card(CardValue.FIVE, 'S'),
                                new Card(CardValue.JACK, 'C'),
                });
                PokerHand White = new PokerHand(new Card[] {
                                new Card(CardValue.THREE, 'C'),
                                new Card(CardValue.THREE, 'D'),
                                new Card(CardValue.THREE, 'D'),
                                new Card(CardValue.FIVE, 'C'),
                                new Card(CardValue.SIX, 'S'),
                });

                assertEquals("There is a winner already",
                                identifywinner.defineWinnerinatie(White, Black, CardValue.TWO, CardValue.THREE));
        }
}
