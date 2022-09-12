package jalau.at18.katas.pokerhands.carlos;

public class PlaysComparer {
    private int score;
    PlaysComparer() {
        this.score = 0;
    }
    public int getScore(PokerHand pokerHand) {
        handScore(pokerHand);
        return score;
    }
    public void handScore(PokerHand hand) {
        for (PlayList list : PlayList.values()) {
            if (handIdentifier(hand, list.identifyCardsPattern())) {
                score = list.patternScore();
            }
        }
    }
    private boolean handIdentifier(PokerHand hand, CardsPattern cardsPattern) {
        return cardsPattern.match(hand);
    }
}
