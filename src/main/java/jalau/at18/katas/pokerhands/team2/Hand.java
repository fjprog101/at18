package jalau.at18.katas.pokerhands.team2;

public class Hand {
    private String color;
    private Card[] cards;
    private int rank;

    public Hand(String color, Card[] card) {
        this.color = color;
        this.cards = card;
        this.rank = 0;
    }

    public String getColor() {
        return color;
    }

    public int getRank() {
        return rank;
    }

    public Card[] getCards() {
        return cards;
    }

    public void calculateRank() {

    }


}