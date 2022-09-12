package jalau.at18.katas.pokerhands.rodrigob.Cards;

public class Card implements Comparable<Card> {

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

    @Override
    public int compareTo(Card anotherCard) {
        return this.value.getNumericValue() - anotherCard.value.getNumericValue();
    }
}
