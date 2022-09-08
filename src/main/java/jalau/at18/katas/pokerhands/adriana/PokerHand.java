package jalau.at18.katas.pokerhands.adriana;

public class PokerHand {

    private Card[] cards;
    private String player;

    public PokerHand(String player, Card[] cards) {
        this.player = player;
        SorterCards sorter = new SorterCards();
        this.cards = sorter.sortCards(cards);
    }

    public Card[] getCards() {
        return cards;
    }

    public String getPlayer() {
        return player;
    }
}
