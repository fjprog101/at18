package jalau.at18.katas.pokerhands.sarai;

public class HighCardsIdentify {

    public boolean identifyhighcard(PokerHand hand) {
        HighCards highcards = new HighCards();
        return highcards.match(hand);
    }
}
