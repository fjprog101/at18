package jalau.at18.katas.pokerhands.joseg;

public class CardComparer {

    public boolean haveSameValue(Card cardLeft, Card cardRight) {
        return cardLeft.getValue() == cardRight.getValue();
    }
}
