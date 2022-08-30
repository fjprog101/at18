package jalau.at18.katas.pokerhands.team2;

public class Hand {
    private String color;
    private Card[] hand;
    private int rank;

    public Hand(String color, Card[] hand) {
        this.color = color;
        this.hand = hand;
        this.rank = 0;
    }
    public String getColor() {
        return color;
    }
    public int getRank() {
        return rank;
    }
    public Card[] getHand() {
        return hand;
    }
    public void calculateRank() {
        
    }


}
