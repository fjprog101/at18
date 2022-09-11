package jalau.at18.katas.pokerhands.alvaro;

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
    public int compareTo(Card compareCard) {
        return this.value.getValue() - compareCard.value.getValue();
    }

}
