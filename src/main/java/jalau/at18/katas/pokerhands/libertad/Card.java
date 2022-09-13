package jalau.at18.katas.pokerhands.libertad;

public class Card {

    private CardValue value;
    private char suit;

    public Card(CardValue value, char suit) {
        this.value = value;
        this.suit = suit;
    }

    public CardValue getValue() {
        return value;
    }

    public char getSuit() {
        return suit;
    }

    public boolean equals(Card card) {
        if (suit == card.getSuit() && value.getIntValue() == card.getValue().getIntValue()) {
            return true;
        }
        return false;
    }
}
