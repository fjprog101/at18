package jalau.at18.katas.pokerhands.mauricio;

public class CardComparer {

    public boolean haveSameValue(Card leftCard, Card rightCard) {
        return leftCard.getValue() == rightCard.getValue();
    }

    public boolean areConsecutive(Card leftCard, Card rightCard) {
        return leftCard.getValue().next() == rightCard.getValue();
    }

    public boolean haveSameSuit(Card leftCard, Card rightCard) {
        return leftCard.getSuit() == rightCard.getSuit();
    }

    public boolean haveDifferentValue(Card leftCard, Card rightCard) {
        return leftCard.getValue() != rightCard.getValue();
    }
}
