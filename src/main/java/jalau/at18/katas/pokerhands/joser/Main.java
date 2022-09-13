package jalau.at18.katas.pokerhands.joser;

public class Main {
    public static void main(String[] args) {

        PokerHand hand1 = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        PokerHand hand2 = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });

        Game game = new Game(hand1, hand2);
        System.out.println(game.getWin() == 1 ? "White wins" : "Black wins");

    }

}
