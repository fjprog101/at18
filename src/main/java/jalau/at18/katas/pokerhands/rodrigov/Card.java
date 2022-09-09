package jalau.at18.katas.pokerhands.rodrigov;

public class Card {

    private CardValue value;
    private char suit;

    public Card(CardValue value, char suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getScore(CardValue value1) {
        return value.getScore(value);
    }

    public CardValue getValue() {
        return value;
    }

    public char getSuit() {
        return suit;
    }
}
