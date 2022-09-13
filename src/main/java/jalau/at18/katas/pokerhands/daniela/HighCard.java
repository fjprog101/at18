package jalau.at18.katas.pokerhands.daniela;

public class HighCard extends CardsPattern {
    private final int highCard = 1;
    private final int otherCards = 2;
    private final int otherCards1 = 3;

    public HighCard() {

    }

    @Override
    public boolean match(PokerHand handWith2PairsPerHand) {
        return highCard(handWith2PairsPerHand);
    }

    public boolean highCard(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount count = cardValuesCounter.getCount();
        return count.exists(highCard) != count.exists(otherCards) != count.exists(otherCards1) != count
                .exists(otherCards1 + highCard);
    }

}
