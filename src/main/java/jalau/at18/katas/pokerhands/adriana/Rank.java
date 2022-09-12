package jalau.at18.katas.pokerhands.adriana;

public class Rank {

    public int getRank(PokerHand hand) {
        PokerHandAnalizer analizer = new PokerHandAnalizer(hand);
        return analizer.getHandKind().ordinal();
    }
    public int getCardRank(PokerHand hand) {
        PokerHandAnalizer analizer = new PokerHandAnalizer(hand);
        return analizer.getCardValueOfThePattern();
    }
    public int sumOfCards(PokerHand hand) {
        int sum = 0;
        for (Card card : hand.getCards()) {
            sum = sum + card.getValue().get();
        }
        return sum;
    }
}
