package jalau.at18.katas.pokerhands.daniela;

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

    public int getScore(CardValue value1) {
        return value.getScore(value1);
    }

    public char getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card c) {
        if (value.getRealNumberValue() > c.getValue().getRealNumberValue()) {
            return 1;
        } else if (value.getRealNumberValue() < c.getValue().getRealNumberValue()) {
            return -1;
        }
        return 0;
    }
}
