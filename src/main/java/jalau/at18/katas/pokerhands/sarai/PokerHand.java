package jalau.at18.katas.pokerhands.sarai;


public class PokerHand {

    private Card[] cards;
    private Card[] nevo;

    public PokerHand(Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        //Arrays.sort(cards, Collections.reverseOrder()); //recive un texto
        return cards;
    }
}
