package jalau.at18.katas.pokerhands.sergio;

public class ScoreHandIdentifier {
    private int score;

    ScoreHandIdentifier() {
        this.score = 0;
    }

    public int getScore(PokerHand pokerHand) {
        handScore(pokerHand);
        return score;
    }

    public void handScore(PokerHand hand) {
        for (ListPatterns list : ListPatterns.values()) {
            if (handIdentifier(hand, list.identifyCardsPattern())) {
                score = list.patternScore();
            }
        }
    }

    private boolean handIdentifier(PokerHand hand, CardsPattern cardsPattern) {
        return cardsPattern.match(hand);
    }
}
