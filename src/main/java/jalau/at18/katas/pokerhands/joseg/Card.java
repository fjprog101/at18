package jalau.at18.katas.pokerhands.joseg;

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

    public int compareTo(Card anotherCard) {
        return this.value.rank() - anotherCard.value.rank();
    }
}
