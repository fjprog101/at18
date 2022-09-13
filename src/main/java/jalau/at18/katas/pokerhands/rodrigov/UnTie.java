package jalau.at18.katas.pokerhands.rodrigov;

public class UnTie {
    public int handPlayer1(PokerHand handPlayer1, CardValue cardsPlayer1) {
        SortedCards sortedCards = new SortedCards(handPlayer1);
        StringCards count = sortedCards.getCount();
        return count.cardDefinitive(cardsPlayer1);
    }

    public int handPlayer2(PokerHand handPlayer2, CardValue cardsPlayer2) {
        SortedCards sortedCards = new SortedCards(handPlayer2);
        StringCards count = sortedCards.getCount();
        return count.cardDefinitive(cardsPlayer2);
    }
}
