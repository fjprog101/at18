package jalau.at18.katas.pokerhands.sarai;

public class HightCardsIdentify {
    public HightCardsIdentify() {
    }

    public boolean identifyhigthcard(PokerHand hand) {
        HightCards higthcards = new HightCards();
        return higthcards.match(hand);
    }
}
