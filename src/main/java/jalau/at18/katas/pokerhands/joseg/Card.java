package jalau.at18.katas.pokerhands.joseg;

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

    public boolean hasSameValueAs(Card anotherCard) {
        return this.value == anotherCard.value;
    }
}
