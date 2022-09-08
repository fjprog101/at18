package jalau.at18.katas.pokerhands.daniela;

public class TieBraker {
    public int highCardWhite(PokerHand handwhite, CardValue cardwhite) {
        Cardssorted counter = new Cardssorted(handwhite);
        CardstoString count = counter.getCount();
        return count.highCard(cardwhite);
    }

    public int highCardBlack(PokerHand handBlack, CardValue cardBlack) {
        Cardssorted counter = new Cardssorted(handBlack);
        CardstoString count = counter.getCount();
        return count.highCard(cardBlack);
    }
}
