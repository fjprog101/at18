package jalau.at18.katas.pokerhands.adriana.identifier;

import jalau.at18.katas.pokerhands.adriana.*;

public abstract class HandIdentifier {

    public abstract boolean identify(PokerHand hand);
    public abstract HandKind getKind();
    public abstract int getCardWithPatternValue(PokerHand hand);

    public CardValue getRepeatedCard(CardValuesCount count, int value) {
        CardValue repeatedCard = CardValue.TWO;
        for (CardValue key : count.getValuesCount().keySet()) {
            if (count.get(key) == value && key.get() >= repeatedCard.get()) {
                repeatedCard = key;
            }
        }
        return repeatedCard;
    }
}
