package jalau.at18.katas.pokerhands.daniela;

public class TieBraker {
    public int highCardWhite(PokerHand handwhite, CardValue cardwhite) {
        CardSorted counter = new CardSorted(handwhite);
        CardstoString count = counter.getCount();
        return count.highCard(cardwhite);
    }

    public int highCardBlack(PokerHand handBlack, CardValue cardBlack) {
        CardSorted counter = new CardSorted(handBlack);
        CardstoString count = counter.getCount();
        return count.highCard(cardBlack);
    }
}
