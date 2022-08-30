package jalau.at18.katas.pokerhands.team2;

public class Card {
    private char suit;
    private int number;

    public Card(char suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public char getSuit() {
        return this.suit;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

}